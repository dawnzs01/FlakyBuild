package io.riskscanner.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.aliyuncs.exceptions.ClientException;
import io.riskscanner.base.domain.*;
import io.riskscanner.base.mapper.AccountMapper;
import io.riskscanner.base.mapper.PluginMapper;
import io.riskscanner.base.mapper.ProxyMapper;
import io.riskscanner.base.mapper.RuleAccountParameterMapper;
import io.riskscanner.base.mapper.ext.ExtAccountMapper;
import io.riskscanner.commons.constants.CloudAccountConstants;
import io.riskscanner.commons.constants.ResourceOperation;
import io.riskscanner.commons.constants.ResourceTypeConstants;
import io.riskscanner.commons.exception.RSException;
import io.riskscanner.commons.utils.*;
import io.riskscanner.controller.request.account.CloudAccountRequest;
import io.riskscanner.controller.request.account.CreateCloudAccountRequest;
import io.riskscanner.controller.request.account.UpdateCloudAccountRequest;
import io.riskscanner.dto.AccountDTO;
import io.riskscanner.dto.QuartzTaskDTO;
import io.riskscanner.dto.RuleDTO;
import io.riskscanner.i18n.Translator;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static com.alibaba.fastjson.JSON.parseArray;
import static com.alibaba.fastjson.JSON.parseObject;

/**
 * @author maguohao
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AccountService {

    @Resource
    private ExtAccountMapper extAccountMapper;
    @Resource
    private AccountMapper accountMapper;
    @Resource
    private PluginMapper pluginMapper;
    @Resource
    private CommonThreadPool commonThreadPool;
    @Resource
    private RuleAccountParameterMapper ruleAccountParameterMapper;
    @Resource
    private ProxyMapper proxyMapper;

    public List<AccountDTO> getCloudAccountList(CloudAccountRequest request) {
        return extAccountMapper.getCloudAccountList(request);
    }

    public AccountWithBLOBs getAccount(String id) {
       return accountMapper.selectByPrimaryKey(id);
    }

    public boolean validate(List<String> ids) {
        ids.forEach(id -> {
            try {
                boolean validate = validate(id);
                if(!validate) throw new RSException(Translator.get("failed_cloud_account"));
            } catch (Exception e) {
                LogUtil.error(e.getMessage());
                throw new RSException(e.getMessage());
            }
        });
        return true;
    }


    public boolean validate(String id) {
        AccountWithBLOBs account = accountMapper.selectByPrimaryKey(id);
        //检验账号的有效性
        boolean valid = validateAccount(account);
        if (valid) {
            account.setStatus(CloudAccountConstants.Status.VALID.name());
        } else {
            account.setStatus(CloudAccountConstants.Status.INVALID.name());
        }
        accountMapper.updateByPrimaryKeySelective(account);
        return valid;
    }

    private boolean validateAccount(AccountWithBLOBs account) {
        try {
            Proxy proxy = new Proxy();
            if (account.getProxyId() != null) proxy = proxyMapper.selectByPrimaryKey(account.getProxyId());
            return PlatformUtils.validateCredential(account, proxy);
        } catch (Exception e) {
            LogUtil.error(String.format("RSException in verifying cloud account, cloud account: [%s], plugin: [%s], error information:%s", account.getName(), account.getPluginName(), e.getMessage()), e);
            return false;
        }
    }

    public AccountWithBLOBs addAccount(CreateCloudAccountRequest request) {
        try{
            //参数校验
            if (StringUtils.isEmpty(request.getCredential())
                    || StringUtils.isEmpty(request.getName()) || StringUtils.isEmpty(request.getPluginId())) {
                RSException.throwException(Translator.get("i18n_ex_cloud_account_name_or_plugin"));
            }

            //云账号名称不能重复
            AccountExample accountExample = new AccountExample();
            accountExample.createCriteria().andNameEqualTo(request.getName());
            List<AccountWithBLOBs> accountList = accountMapper.selectByExampleWithBLOBs(accountExample);
            if (!CollectionUtils.isEmpty(accountList)) {
                RSException.throwException(Translator.get("i18n_ex_cloud_account_name_duplicate"));
            }

            AccountWithBLOBs account = new AccountWithBLOBs();

            //校验云插件是否存在
            Plugin plugin = pluginMapper.selectByPrimaryKey(request.getPluginId());
            if (plugin == null) {
                RSException.throwException(Translator.get("i18n_ex_cloud_account_no_exist_plugin"));
            } else {
                BeanUtils.copyBean(account, request);
                account.setPluginIcon(Objects.requireNonNull(plugin.getIcon()));
                account.setPluginName(plugin.getName());
                account.setCreateTime(System.currentTimeMillis());
                account.setUpdateTime(System.currentTimeMillis());
                account.setCreator(Objects.requireNonNull(SessionUtils.getUser()).getId());
                account.setId(UUIDUtil.newUUID());
                accountMapper.insertSelective(account);
                updateRegions(account);
                OperationLogService.log(SessionUtils.getUser(), account.getId(), account.getName(), ResourceTypeConstants.CLOUD_ACCOUNT.name(), ResourceOperation.CREATE, "创建云账号");
                return getCloudAccountById(account.getId());
            }
        } catch (Exception e) {
            RSException.throwException(e.getMessage());
        }
        return null;
    }

    private AccountWithBLOBs getCloudAccountById(String id) {
        return accountMapper.selectByPrimaryKey(id);
    }

    public AccountWithBLOBs editAccount(UpdateCloudAccountRequest request) throws Exception {
        try {
            //参数校验
            if (StringUtils.isEmpty(request.getCredential())
                    || StringUtils.isEmpty(request.getId())) {
                RSException.throwException(Translator.get("i18n_ex_cloud_account_id_or_plugin"));
            }

            //云账号名称不能重复
            AccountExample accountExample = new AccountExample();
            accountExample.createCriteria().andNameEqualTo(request.getName()).andIdNotEqualTo(request.getId());
            List<AccountWithBLOBs> accountList = accountMapper.selectByExampleWithBLOBs(accountExample);
            if (!CollectionUtils.isEmpty(accountList)) {
                RSException.throwException(Translator.get("i18n_ex_cloud_account_name_duplicate"));
            }

            if (accountMapper.selectByPrimaryKey(request.getId()) == null) {
                RSException.throwException(Translator.get("i18n_ex_cloud_account_no_exist_id"));
            }

            AccountWithBLOBs account = new AccountWithBLOBs();
            //校验云插件是否存在
            Plugin plugin = pluginMapper.selectByPrimaryKey(request.getPluginId());
            if (plugin == null) {
                RSException.throwException(Translator.get("i18n_ex_cloud_account_no_exist_plugin"));
            } else {
                BeanUtils.copyBean(account, request);
                account.setPluginIcon(plugin.getIcon());
                account.setPluginName(plugin.getName());
                account.setUpdateTime(System.currentTimeMillis());
                accountMapper.updateByPrimaryKeySelective(account);
                account = accountMapper.selectByPrimaryKey(account.getId());
                updateRegions(account);

                //检验账号已更新状态
                OperationLogService.log(SessionUtils.getUser(), account.getId(), account.getName(), ResourceTypeConstants.CLOUD_ACCOUNT.name(), ResourceOperation.UPDATE, "更新云账号");
                return getCloudAccountById(account.getId());
            }

        } catch (RSException | ClientException e) {
            RSException.throwException(e.getMessage());
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return null;
    }

    public void delete(String accountId) {
        AccountWithBLOBs accountWithBLOBs = accountMapper.selectByPrimaryKey(accountId);
        accountMapper.deleteByPrimaryKey(accountId);
        OperationLogService.log(SessionUtils.getUser(), accountId, accountWithBLOBs.getName(), ResourceTypeConstants.CLOUD_ACCOUNT.name(), ResourceOperation.DELETE, "删除云账号");
    }

    public Object getRegions(String id) {
        try {
            boolean flag = validate(id);
            if (!flag) {
                RSException.throwException(Translator.get("i18n_ex_plugin_validate"));
            }
            AccountWithBLOBs account = accountMapper.selectByPrimaryKey(id);
            String regions = account.getRegions();
            if (regions.isEmpty()) {
                Proxy proxy = new Proxy();
                if (account.getProxyId() != null) proxy = proxyMapper.selectByPrimaryKey(account.getProxyId());
                return PlatformUtils._getRegions(account, proxy, flag);
            } else {
                return regions;
            }
        } catch (Exception e) {
            throw new RSException(e.getMessage());
        }
    }

    public void syncRegions() {
        try {
            List<AccountWithBLOBs> list = accountMapper.selectByExampleWithBLOBs(null);
            list.forEach(account -> {
                try {
                    updateRegions(account);
                } catch (ClientException e) {
                    LogUtil.error(e.getMessage());
                }
            });
        } catch (Exception e) {
            RSException.throwException(e.getMessage());
        }
    }

    public void updateRegions(AccountWithBLOBs account) throws ClientException {
        try {
            Proxy proxy = new Proxy();
            if (account.getProxyId() != null) proxy = proxyMapper.selectByPrimaryKey(account.getProxyId());
            JSONArray jsonArray = PlatformUtils._getRegions(account, proxy, validate(account.getId()));
            if (!jsonArray.isEmpty()) {
                account.setRegions(jsonArray.toJSONString());
                accountMapper.updateByPrimaryKeySelective(account);
            }
        }
        catch (Exception e) {
            LogUtil.error(e.getMessage());
        }
    }

    public String string2PrettyFormat (String regions) {
        StringBuilder stringBuffer = new StringBuilder();
        JSONArray jsonArray = parseArray(regions);
        String pretty = JSON.toJSONString(jsonArray, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteDateUseDateFormat);
        stringBuffer.append(pretty);
        return stringBuffer.toString();
    }

    public Object cleanParameter(List<RuleAccountParameter> list) {
        try {
            list.forEach(rule -> {
                if (rule.getRuleId() != null) {
                    RuleAccountParameterExample example = new RuleAccountParameterExample();
                    example.createCriteria().andRuleIdEqualTo(rule.getRuleId()).andAccountIdEqualTo(rule.getAccountId());
                    ruleAccountParameterMapper.deleteByExample(example);
                }
            });
            OperationLogService.log(SessionUtils.getUser(), list.get(0).getRuleId(), accountMapper.selectByPrimaryKey(list.get(0).getAccountId()).getName(), ResourceTypeConstants.CLOUD_ACCOUNT.name(), ResourceOperation.CREATE, " 清除云账号参数");
        } catch (Exception e) {
            LogUtil.error(e.getMessage());
            throw e;
        }
        return true;
    }

    public Object saveParameter(List<QuartzTaskDTO> list) {
        try {
            list.forEach(this::accept);
            OperationLogService.log(SessionUtils.getUser(), list.get(0).getId(), accountMapper.selectByPrimaryKey(list.get(0).getAccountId()).getName(), ResourceTypeConstants.CLOUD_ACCOUNT.name(), ResourceOperation.CREATE, "保存云账号参数");
        } catch (Exception e) {
            LogUtil.error(e.getMessage());
            throw e;
        }
        return true;
    }

    public List<RuleDTO> getRules(QuartzTaskDTO dto) {
        return extAccountMapper.ruleList(dto);
    }

    public List<Map<String, Object>> groupList(Map<String, Object> params) {
        return extAccountMapper.groupList(params);
    }

    public List<Map<String, Object>> reportList(Map<String, Object> params) {
        return extAccountMapper.reportList(params);
    }

    public List<Map<String, Object>> tagList(Map<String, Object> params) {
        return extAccountMapper.tagList(params);
    }

    public List<Map<String, Object>> regionsList(Map<String, Object> params) {
        return extAccountMapper.regionsList(params);
    }

    public List<Map<String, Object>> resourceList(Map<String, Object> params) {
        return extAccountMapper.resourceList(params);
    }

    public String strategy(String type) throws Exception {
        String script = ReadFileUtils.readConfigFile("support/strategy/", type, ".json");
        try {
            script = this.toJSONString(script);
        } catch (Exception e) {
            script = this.toJSONString2(script);
        }
        return script;
    }

    public String toJSONString(String jsonString) {
        JSONObject object = parseObject(jsonString);
        return JSON.toJSONString(object, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteDateUseDateFormat);
    }

    public String toJSONString2(String jsonString) {
        JSONArray jsonArray = parseArray(jsonString);
        return JSON.toJSONString(jsonArray, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteDateUseDateFormat);
    }

    private void accept(QuartzTaskDTO quartzTaskDTO) {
        RuleAccountParameter parameter = new RuleAccountParameter();
        parameter.setAccountId(quartzTaskDTO.getAccountId());
        parameter.setRuleId(quartzTaskDTO.getId());
        parameter.setParameter(quartzTaskDTO.getParameter());
        parameter.setRegions(quartzTaskDTO.getRegions());

        RuleAccountParameterExample example = new RuleAccountParameterExample();
        example.createCriteria().andAccountIdEqualTo(quartzTaskDTO.getAccountId()).andRuleIdEqualTo(quartzTaskDTO.getId());
        List<RuleAccountParameter> parameters = ruleAccountParameterMapper.selectByExample(example);
        if (!parameters.isEmpty()) {
            ruleAccountParameterMapper.updateByExampleSelective(parameter, example);
        } else {
            ruleAccountParameterMapper.insertSelective(parameter);
        }
    }
}
