package io.riskscanner.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fit2cloud.quartz.service.QuartzManageService;
import io.riskscanner.base.domain.*;
import io.riskscanner.base.mapper.*;
import io.riskscanner.base.mapper.ext.ExtTaskMapper;
import io.riskscanner.base.rs.SelectTag;
import io.riskscanner.commons.constants.*;
import io.riskscanner.commons.exception.RSException;
import io.riskscanner.commons.utils.*;
import io.riskscanner.dto.*;
import io.riskscanner.i18n.Translator;
import org.apache.commons.lang3.StringUtils;
import org.quartz.CronScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.Yaml;

import javax.annotation.Resource;
import java.util.*;

import static com.alibaba.fastjson.JSON.parseArray;

/**
 * @author maguohao
 */
@Service
public class TaskService {

    @Resource
    private TaskMapper taskMapper;
    @Resource
    private TaskItemMapper taskItemMapper;
    @Resource
    private ExtTaskMapper extTaskMapper;
    @Resource
    private TaskItemLogMapper taskItemLogMapper;
    @Resource
    private TaskItemResourceMapper taskItemResourceMapper;
    @Resource
    private AccountMapper accountMapper;
    @Resource
    private QuartzManageService quartzManageService;
    @Resource
    private AccountService accountService;
    @Resource
    private ResourceRuleMapper resourceRuleMapper;
    @Resource
    private ResourceMapper resourceMapper;
    @Resource
    private OrderService orderService;
    @Resource
    private ResourceItemMapper resourceItemMapper;
    @Resource
    private ProxyMapper proxyMapper;
    @Resource
    private CloudAccountQuartzTaskMapper quartzTaskMapper;
    @Resource
    private CloudAccountQuartzTaskRelationMapper quartzTaskRelationMapper;
    @Resource
    private RuleMapper ruleMapper;
    @Resource
    private CloudAccountQuartzTaskRelaLogMapper quartzTaskRelaLogMapper;
    @Resource
    private NucleiService nucleiService;
    @Resource
    private ProwlerService prowlerService;

    public Task saveManualTask(QuartzTaskDTO quartzTaskDTO, String messageOrderId) {
        try {
            if (StringUtils.equalsIgnoreCase(quartzTaskDTO.getScanType(), ScanTypeConstants.custodian.name())) {
                this.validateYaml(quartzTaskDTO);
                return orderService.createTask(quartzTaskDTO, TaskConstants.TASK_STATUS.APPROVED.name(), messageOrderId);
            } else if (StringUtils.equalsIgnoreCase(quartzTaskDTO.getScanType(), ScanTypeConstants.nuclei.name())) {
                return nucleiService.createTask(quartzTaskDTO, TaskConstants.TASK_STATUS.APPROVED.name(), messageOrderId);
            } else if (StringUtils.equalsIgnoreCase(quartzTaskDTO.getScanType(), ScanTypeConstants.prowler.name())) {
                return prowlerService.createTask(quartzTaskDTO, TaskConstants.TASK_STATUS.APPROVED.name(), messageOrderId);
            } else {
                return orderService.createTask(quartzTaskDTO, TaskConstants.TASK_STATUS.APPROVED.name(), messageOrderId);
            }
        } catch (Exception e) {
            LogUtil.error(e.getMessage());
            throw new RSException(e.getMessage());
        }
    }

    public boolean morelTask(String taskId) {
        try {
            Task task = taskMapper.selectByPrimaryKey(taskId);
            if (task != null) {
                task.setStatus(TaskConstants.TASK_STATUS.APPROVED.name());
                taskMapper.updateByPrimaryKeySelective(task);
            } else {
                RSException.throwException("Task not found");
            }
        } catch (Exception e) {
            LogUtil.error(e.getMessage());
            throw e;
        }
        return true;
    }

    public boolean validateYaml(QuartzTaskDTO quartzTaskDTO) {
        try {
            String script = quartzTaskDTO.getScript();
            JSONArray jsonArray = JSON.parseArray(quartzTaskDTO.getParameter());
            for (Object o : jsonArray) {
                JSONObject jsonObject = (JSONObject) o;
                String key = "${{" + jsonObject.getString("key") + "}}";
                if (script.contains(key)) {
                    script = script.replace(key, jsonObject.getString("defaultValue"));
                }
            }
            Yaml yaml = new Yaml();
            Map map = yaml.load(script);
            if (map != null) {
                List<Map> list = (List) map.get("policies");
                for (Map m : list) m.get("resource").toString();
            }
        } catch (Exception e) {
            RSException.throwException(Translator.get("i18n_compliance_rule_code_error"));
        }
        return true;
    }

    public void deleteManualTask(String taskId) {
        Task task = taskMapper.selectByPrimaryKey(taskId);
        TaskItemExample taskItemExample = new TaskItemExample();
        taskItemExample.createCriteria().andTaskIdEqualTo(task.getId());
        List<TaskItem> taskItemList = taskItemMapper.selectByExample(taskItemExample);
        try {
            taskItemList.forEach(taskItem -> {
                if (taskItem == null) return;
                taskItemMapper.deleteByPrimaryKey(taskItem.getId());

                TaskItemLogExample taskItemLogExample = new TaskItemLogExample();
                taskItemLogExample.createCriteria().andTaskItemIdEqualTo(taskItem.getId());
                taskItemLogMapper.deleteByExample(taskItemLogExample);

                TaskItemResourceExample taskItemResourceExample = new TaskItemResourceExample();
                taskItemResourceExample.createCriteria().andTaskItemIdEqualTo(taskItem.getId());
                List<TaskItemResource> taskItemResources = taskItemResourceMapper.selectByExample(taskItemResourceExample);
                taskItemResourceMapper.deleteByExample(taskItemResourceExample);

                taskItemResources.forEach(taskItemResource -> {
                    if (taskItemResource == null) return;
                    resourceMapper.deleteByPrimaryKey(taskItemResource.getResourceId());

                    if (taskItemResource.getResourceId() != null) {
                        ResourceItemExample resourceItemExample = new ResourceItemExample();
                        resourceItemExample.createCriteria().andResourceIdEqualTo(taskItemResource.getResourceId());
                        List<ResourceItem> resourceItems = resourceItemMapper.selectByExample(resourceItemExample);
                        resourceItems.forEach(resourceItem -> {
                            ResourceRuleExample resourceRuleExample = new ResourceRuleExample();
                            if (resourceItem.getResourceId() != null) {
                                resourceRuleExample.createCriteria().andResourceIdEqualTo(resourceItem.getResourceId());
                                resourceRuleMapper.deleteByExample(resourceRuleExample);
                            }
                        });
                    }
                });

            });
            taskMapper.deleteByPrimaryKey(task.getId());
            OperationLogService.log(SessionUtils.getUser(), taskId, task.getDescription(), ResourceTypeConstants.TASK.name(), ResourceOperation.DELETE, "删除任务");
        } catch (Exception e) {
            LogUtil.error("Delete manual task error{} " + e.getMessage());
            RSException.throwException(e.getMessage());
        }
    }

    public boolean dryRun(QuartzTaskDTO quartzTaskDTO) {
        //validate && dryrun
        String uuid = UUIDUtil.newUUID();
        try {
            String script = quartzTaskDTO.getScript();
            JSONArray jsonArray = JSON.parseArray(quartzTaskDTO.getParameter());
            for (Object o : jsonArray) {
                JSONObject jsonObject = (JSONObject) o;
                String key = "${{" + jsonObject.getString("key") + "}}";
                if (script.contains(key)) {
                    script = script.replace(key, jsonObject.getString("defaultValue"));
                }
            }
            final String finalScript = script;
            String dirPath;
            AccountExample example = new AccountExample();
            example.createCriteria().andPluginIdEqualTo(quartzTaskDTO.getPluginId()).andStatusEqualTo("VALID");
            AccountWithBLOBs account = accountMapper.selectByExampleWithBLOBs(example).get(0);
            Proxy proxy = new Proxy();
            if (account.getProxyId() != null) proxy = proxyMapper.selectByPrimaryKey(account.getProxyId());
            // 校验云账号是否有效
            Optional.ofNullable(accountService.validate(account.getId())).filter(Boolean::booleanValue).orElseGet(() -> {
                RSException.throwException(Translator.get("i18n_ex_plugin_validate"));
                return null;
            });
            //  获得区域 -- nuclei的区域为all 因为当前方法是判断当前规则是否正确,所以任意取一个区域只要执行没有问题则证明规则没有问题
            JSONObject regionObj = quartzTaskDTO.getScanType().equals(ScanTypeConstants.nuclei.name()) ? new JSONObject() {{
                put("regionId", "ALL");
            }} : Optional.ofNullable(PlatformUtils._getRegions(account, proxy, true)).filter(s -> {
                return !s.isEmpty();
            }).map(jsonArr -> {
                return (JSONObject) jsonArr.get(0);
            }).orElseGet(() -> {
                RSException.throwException(Translator.get("i18n_ex_plugin_validate"));
                return null;
            });

            Map<String, String> map = PlatformUtils.getAccount(account, regionObj.get("regionId").toString(), proxyMapper.selectByPrimaryKey(account.getProxyId()));

            String fileName = "", commandEnum = "";
            if (StringUtils.equalsIgnoreCase(quartzTaskDTO.getScanType(), ScanTypeConstants.custodian.name())) {
                fileName = "policy.yml";
                commandEnum = CommandEnum.custodian.getCommand();
            } else if (StringUtils.equalsIgnoreCase(quartzTaskDTO.getScanType(), ScanTypeConstants.nuclei.name())) {
                fileName = "nuclei.yml";
                commandEnum = CommandEnum.nuclei.getCommand();
            } else if (StringUtils.equalsIgnoreCase(quartzTaskDTO.getScanType(), ScanTypeConstants.prowler.name())) {
                JSONArray objects = JSONObject.parseArray(quartzTaskDTO.getParameter());
                if (objects.isEmpty()) RSException.throwException(Translator.get("error_lang_invalid"));
                fileName = objects.getJSONObject(0).getString("defaultValue");
                commandEnum = CommandEnum.prowler.getCommand();
            }

            dirPath = commandEnum.equals(CommandEnum.prowler.getCommand())?TaskConstants.PROWLER_RESULT_FILE_PATH:CommandUtils.saveAsFile(finalScript, TaskConstants.RESULT_FILE_PATH_PREFIX + uuid, fileName);

            String command = PlatformUtils.fixedCommand(commandEnum, CommandEnum.validate.getCommand(), dirPath, fileName, map);

            String resultStr = quartzTaskDTO.getScanType().equals(ScanTypeConstants.nuclei.name()) ? CommandUtils.commonExecCmdWithResultByNuclei(command, dirPath) : CommandUtils.commonExecCmdWithResult(command, dirPath);
            // 检查结果
            checkResultStr(resultStr, quartzTaskDTO.getScanType());
            String command2 = PlatformUtils.fixedCommand(commandEnum, CommandEnum.dryrun.getCommand(), dirPath, fileName, map);
            String resultStr2 = quartzTaskDTO.getScanType().equals(ScanTypeConstants.nuclei.name()) ? CommandUtils.commonExecCmdWithResultByNuclei(command2, dirPath) : CommandUtils.commonExecCmdWithResult(command2, dirPath);
            // 结果
            checkResultStr(resultStr2, quartzTaskDTO.getScanType());
        } catch (Exception e) {
            LogUtil.error("[{}] validate && dryrun generate policy.yml file failed:{}", uuid, e.getMessage());
            RSException.throwException(e instanceof RSException ? e.getMessage() : Translator.get("i18n_compliance_rule_error"));
        }
        return true;
    }

    /**
     * 检查返回值是否正常返回
     *
     * @param resultStr 需要检查的结果
     * @param type      扫描类型
     */
    public void checkResultStr(String resultStr, String type) {
        if (type.equals(ScanTypeConstants.nuclei.name())) {
            if (resultStr.contains("ERR") || resultStr.contains("error")) {
                RSException.throwException(Translator.get("i18n_create_resource_failed"));
            }
        } else if (type.equals(ScanTypeConstants.custodian.name())) {
            if (!resultStr.isEmpty() && !resultStr.contains("INFO")) {
                LogUtil.error(Translator.get("i18n_compliance_rule_error") + " {validate}:" + resultStr);
                RSException.throwException(Translator.get("i18n_compliance_rule_error"));
            }
        } else if (type.equals(ScanTypeConstants.prowler.name())) {
            if (!resultStr.isEmpty() && !resultStr.contains("INFO")) {
                LogUtil.error(Translator.get("i18n_compliance_rule_error") + " {validate}:" + resultStr);
                RSException.throwException(Translator.get("i18n_compliance_rule_error"));
            }
        }
    }

    public List<Task> selectManualTasks(Map<String, Object> params) {

        TaskExample example = new TaskExample();
        TaskExample.Criteria criteria = example.createCriteria();
        if (params.get("name") != null && StringUtils.isNotEmpty(params.get("name").toString())) {
            criteria.andTaskNameLike("%" + params.get("name").toString() + "%");
        }
        if (params.get("type") != null && StringUtils.isNotEmpty(params.get("type").toString())) {
            criteria.andTypeEqualTo(params.get("type").toString());
        }
        if (params.get("accountId") != null && StringUtils.isNotEmpty(params.get("accountId").toString())) {
            criteria.andAccountIdEqualTo(params.get("accountId").toString());
        }
        if (params.get("cron") != null && StringUtils.isNotEmpty(params.get("cron").toString())) {
            criteria.andCronLike(params.get("cron").toString());
        }
        if (params.get("status") != null && StringUtils.isNotEmpty(params.get("status").toString())) {
            criteria.andStatusEqualTo(params.get("status").toString());
        }
        if (params.get("severity") != null && StringUtils.isNotEmpty(params.get("severity").toString())) {
            criteria.andSeverityEqualTo(params.get("severity").toString());
        }
        if (params.get("pluginName") != null && StringUtils.isNotEmpty(params.get("pluginName").toString())) {
            criteria.andPluginNameEqualTo(params.get("pluginName").toString());
        }
        if (params.get("ruleTag") != null && StringUtils.isNotEmpty(params.get("ruleTag").toString())) {
            criteria.andRuleTagsLike("%" + params.get("ruleTag").toString() + "%");
        }
        if (params.get("resourceType") != null && StringUtils.isNotEmpty(params.get("resourceType").toString())) {
            criteria.andResourceTypesLike("%" + params.get("resourceType").toString() + "%");
        }
        example.setOrderByClause("FIELD(`status`, 'PROCESSING', 'APPROVED', 'FINISHED', 'WARNING', 'ERROR'), return_sum desc, create_time desc, FIELD(`severity`, 'HighRisk', 'MediumRisk', 'LowRisk')");
        return taskMapper.selectByExample(example);
    }

    public List<CloudAccountQuartzTask> selectQuartzTasks(Map<String, Object> params) {

        CloudAccountQuartzTaskExample example = new CloudAccountQuartzTaskExample();
        CloudAccountQuartzTaskExample.Criteria criteria = example.createCriteria();
        if (params.get("name") != null && StringUtils.isNotEmpty(params.get("name").toString())) {
            criteria.andNameEqualTo("%" + params.get("name").toString() + "%");
        }
        if (params.get("cron") != null && StringUtils.isNotEmpty(params.get("cron").toString())) {
            criteria.andCronLike(params.get("cron").toString());
        }
        example.setOrderByClause("create_time desc");
        return quartzTaskMapper.selectByExample(example);
    }

    public boolean saveQuartzTask(CloudAccountQuartzTaskDTO dto) throws Exception {
        try {
            dto.setId(UUIDUtil.newUUID());
            dto.setApplyUser(SessionUtils.getUser().getName());
            dto.setCreateTime(System.currentTimeMillis());
            dto.setStatus(TaskConstants.TASK_STATUS.RUNNING.name());
            dto.setCronDesc(DescCornUtils.descCorn(dto.getCron()));

            Trigger trigger = addQuartzTask(dto);
            dto.setTriggerId("quartz-task" + dto.getId());
            dto.setLastFireTime(trigger.getNextFireTime().getTime());
            if (trigger.getPreviousFireTime() != null) dto.setPrevFireTime(trigger.getPreviousFireTime().getTime());
            quartzTaskMapper.insertSelective(dto);

            if (StringUtils.equalsIgnoreCase(dto.getQzType(), "ACCOUNT")) {
                for (String accountId : dto.getAccountIds()) {
                    CloudAccountQuartzTaskRelation quartzTaskRelation = new CloudAccountQuartzTaskRelation();
                    quartzTaskRelation.setId(UUIDUtil.newUUID());
                    quartzTaskRelation.setQuartzTaskId(dto.getId());
                    quartzTaskRelation.setCreateTime(System.currentTimeMillis());
                    quartzTaskRelation.setSourceId(accountId);
                    quartzTaskRelation.setQzType(dto.getQzType());
                    quartzTaskRelationMapper.insertSelective(quartzTaskRelation);

                    AccountWithBLOBs account = accountMapper.selectByPrimaryKey(accountId);
                    RuleExample example = new RuleExample();
                    JSONArray jsonArray = new JSONArray();
                    example.createCriteria().andPluginIdEqualTo(account.getPluginId());
                    List<Rule> rules = ruleMapper.selectByExample(example);
                    for (Rule rule : rules) {
                        QuartzTaskDTO quartzTaskDTO = new QuartzTaskDTO();
                        BeanUtils.copyBean(quartzTaskDTO, rule);
                        quartzTaskDTO.setType("quartz");
                        quartzTaskDTO.setAccountId(accountId);
                        quartzTaskDTO.setCron(dto.getCron());
                        quartzTaskDTO.setTaskName(rule.getName());

                        List<SelectTag> selectTags = new LinkedList<>();
                        SelectTag s = new SelectTag();
                        s.setAccountId(account.getId());
                        JSONArray j = parseArray(account.getRegions());
                        JSONObject object;
                        List<String> regions = new ArrayList<>();
                        for (int i = 0; i < j.size(); i++) {
                            object = j.getJSONObject(i);
                            String value = object.getString("regionId");
                            regions.add(value);
                        }
                        s.setRegions(regions);
                        selectTags.add(s);
                        quartzTaskDTO.setSelectTags(selectTags);
                        quartzTaskDTO.setRegions(regions.toString());
                        Task task = orderService.createTask(quartzTaskDTO, TaskConstants.TASK_STATUS.APPROVED.name(), null);
                        task.setLastFireTime(dto.getLastFireTime());
                        task.setPrevFireTime(dto.getPrevFireTime());
                        task.setTriggerId(dto.getTriggerId());
                        taskMapper.updateByPrimaryKeySelective(task);

                        jsonArray.add(task.getId());
                    }

                    quartzTaskRelation.setTaskIds(jsonArray.toJSONString());
                    quartzTaskRelationMapper.updateByPrimaryKeySelective(quartzTaskRelation);

                    CloudAccountQuartzTaskRelaLog quartzTaskRelaLog = new CloudAccountQuartzTaskRelaLog();
                    quartzTaskRelaLog.setCreateTime(System.currentTimeMillis());
                    quartzTaskRelaLog.setQuartzTaskId(dto.getId());
                    quartzTaskRelaLog.setQuartzTaskRelaId(quartzTaskRelation.getId());
                    quartzTaskRelaLog.setTaskIds(quartzTaskRelation.getTaskIds());
                    quartzTaskRelaLog.setSourceId(quartzTaskRelation.getSourceId());
                    quartzTaskRelaLog.setQzType(quartzTaskRelation.getQzType());
                    quartzTaskRelaLog.setOperator(SessionUtils.getUser().getName());
                    quartzTaskRelaLog.setOperation("新建定时任务");
                    quartzTaskRelaLogMapper.insertSelective(quartzTaskRelaLog);
                }
            } else {
                JSONArray jsonArray = new JSONArray();
                for (String ruleId : dto.getRuleIds()) {
                    CloudAccountQuartzTaskRelation quartzTaskRelation = new CloudAccountQuartzTaskRelation();
                    quartzTaskRelation.setId(UUIDUtil.newUUID());
                    quartzTaskRelation.setQuartzTaskId(dto.getId());
                    quartzTaskRelation.setCreateTime(System.currentTimeMillis());
                    quartzTaskRelation.setSourceId(ruleId);
                    quartzTaskRelation.setQzType(dto.getQzType());
                    quartzTaskRelationMapper.insertSelective(quartzTaskRelation);

                    QuartzTaskDTO quartzTaskDTO = new QuartzTaskDTO();
                    BeanUtils.copyBean(quartzTaskDTO, ruleMapper.selectByPrimaryKey(ruleId));
                    quartzTaskDTO.setType("quartz");
                    quartzTaskDTO.setAccountId(dto.getAccountId());
                    quartzTaskDTO.setCron(dto.getCron());
                    quartzTaskDTO.setTaskName(ruleMapper.selectByPrimaryKey(ruleId).getName());

                    List<SelectTag> selectTags = new LinkedList<>();
                    SelectTag s = new SelectTag();
                    s.setAccountId(dto.getAccountId());
                    JSONArray j = parseArray(accountMapper.selectByPrimaryKey(dto.getAccountId()).getRegions());
                    JSONObject object;
                    List<String> regions = new ArrayList<>();
                    for (int i = 0; i < j.size(); i++) {
                        object = j.getJSONObject(i);
                        String value = object.getString("regionId");
                        regions.add(value);
                    }
                    s.setRegions(regions);
                    selectTags.add(s);
                    quartzTaskDTO.setSelectTags(selectTags);
                    quartzTaskDTO.setRegions(regions.toString());
                    Task task = orderService.createTask(quartzTaskDTO, TaskConstants.TASK_STATUS.APPROVED.name(), null);
                    task.setLastFireTime(dto.getLastFireTime());
                    task.setPrevFireTime(dto.getPrevFireTime());
                    task.setTriggerId(dto.getTriggerId());
                    taskMapper.updateByPrimaryKeySelective(task);

                    jsonArray.add(task.getId());
                    quartzTaskRelation.setTaskIds(jsonArray.toJSONString());
                    quartzTaskRelationMapper.updateByPrimaryKeySelective(quartzTaskRelation);

                    CloudAccountQuartzTaskRelaLog quartzTaskRelaLog = new CloudAccountQuartzTaskRelaLog();
                    quartzTaskRelaLog.setCreateTime(System.currentTimeMillis());
                    quartzTaskRelaLog.setQuartzTaskId(dto.getId());
                    quartzTaskRelaLog.setQuartzTaskRelaId(quartzTaskRelation.getId());
                    quartzTaskRelaLog.setTaskIds(quartzTaskRelation.getTaskIds());
                    quartzTaskRelaLog.setSourceId(quartzTaskRelation.getSourceId());
                    quartzTaskRelaLog.setQzType(quartzTaskRelation.getQzType());
                    quartzTaskRelaLog.setOperator(SessionUtils.getUser().getName());
                    quartzTaskRelaLog.setOperation("新建定时任务");
                    quartzTaskRelaLogMapper.insertSelective(quartzTaskRelaLog);
                }
            }
            OperationLogService.log(SessionUtils.getUser(), dto.getId(), dto.getName(), ResourceTypeConstants.QUOTA.name(), ResourceOperation.CREATE, "创建定时任务");
        } catch (Exception e) {
            LogUtil.error(e.getMessage());
            throw e;
        }
        return true;
    }


    private Trigger addQuartzTask(CloudAccountQuartzTask quartzTask) throws Exception {
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("quartz-task" + quartzTask.getId())
                .withSchedule(CronScheduleBuilder.cronSchedule(quartzTask.getCron()).withMisfireHandlingInstructionDoNothing())
                .build();

        quartzManageService.addJob("orderService", "createQuartzTask", trigger, quartzTask.getId());
        if (quartzTask.getStatus().equalsIgnoreCase(QuartzTaskStatus.PAUSE)) {
            quartzManageService.pauseJob(trigger.getJobKey());
        }
        return quartzManageService.getTrigger(trigger.getKey());

    }


    public void reAddQuartzOnStart() {
        List<CloudAccountQuartzTask> quartzTasks = quartzTaskMapper.selectByExample(null);
        quartzTasks.forEach(quartzTask -> {
            try {
                if (quartzManageService.getTrigger(new TriggerKey(quartzTask.getTriggerId())) == null) {
                    Trigger trigger = addQuartzTask(getResources(quartzTask.getId()));
                    quartzTask.setLastFireTime(trigger.getNextFireTime().getTime());
                    if (trigger.getPreviousFireTime() != null)
                        quartzTask.setPrevFireTime(trigger.getPreviousFireTime().getTime());
                    quartzTask.setTriggerId("quartz-task" + quartzTask.getId());
                    quartzTaskMapper.updateByPrimaryKeySelective(quartzTask);
                }
            } catch (Exception e) {
                RSException.throwException(e);
            }
        });
    }

    public CloudAccountQuartzTask getResources(String quartzTaskId) {
        return quartzTaskMapper.selectByPrimaryKey(quartzTaskId);
    }

    public void syncTriggerTime() {
        List<CloudAccountQuartzTask> quartzTasks = quartzTaskMapper.selectByExample(null);
        quartzTasks.forEach(quartzTask -> {
            Trigger trigger = null;
            try {
                trigger = quartzManageService.getTrigger(new TriggerKey(quartzTask.getTriggerId()));
            } catch (Exception e) {
                RSException.throwException(e);
            }
            quartzTask.setLastFireTime(trigger.getNextFireTime().getTime());
            if (trigger.getPreviousFireTime() != null)
                quartzTask.setPrevFireTime(trigger.getPreviousFireTime().getTime());
            quartzTaskMapper.updateByPrimaryKeySelective(quartzTask);

        });

    }

    public void syncTaskSum() {
        TaskExample example = new TaskExample();
        example.createCriteria().andStatusIn(Arrays.asList(TaskConstants.TASK_STATUS.FINISHED.name(), TaskConstants.TASK_STATUS.RUNNING.name()));
        List<Task> tasks = taskMapper.selectByExample(example);
        tasks.forEach(task -> {
            if (task.getResourcesSum() != null && task.getReturnSum() != null) {
                int resourceSum = extTaskMapper.getResourceSum(task.getId());
                int returnSum = extTaskMapper.getReturnSum(task.getId());
                task.setResourcesSum((long) resourceSum);
                task.setReturnSum((long) returnSum);
                taskMapper.updateByPrimaryKeySelective(task);
            }
        });
    }

    public boolean changeQuartzStatus(String quartzId, final String action) throws Exception {
        try {
            CloudAccountQuartzTask quartzTask = quartzTaskMapper.selectByPrimaryKey(quartzId);
            String triggerId = quartzTask.getTriggerId();
            Trigger trigger = quartzManageService.getTrigger(new TriggerKey(triggerId));
            String status = null;
            switch (action) {
                case QuartzTaskAction.PAUSE:
                    quartzManageService.pauseJob(trigger.getJobKey());
                    status = QuartzTaskStatus.PAUSE;
                    break;

                case QuartzTaskAction.RESUME:
                    quartzManageService.resumeJob(trigger.getJobKey());
                    status = QuartzTaskStatus.RUNNING;
                    break;
                default:
                    RSException.throwException("action is not invalid");
            }
            quartzTask.setStatus(status);
            quartzTaskMapper.updateByPrimaryKeySelective(quartzTask);

            CloudAccountQuartzTaskRelationExample example = new CloudAccountQuartzTaskRelationExample();
            example.createCriteria().andQuartzTaskIdEqualTo(quartzId);
            List<CloudAccountQuartzTaskRelation> list = quartzTaskRelationMapper.selectByExampleWithBLOBs(example);

            for (CloudAccountQuartzTaskRelation quartzTaskRelation : list) {
                CloudAccountQuartzTaskRelaLog quartzTaskRelaLog = new CloudAccountQuartzTaskRelaLog();
                quartzTaskRelaLog.setCreateTime(System.currentTimeMillis());
                quartzTaskRelaLog.setQuartzTaskId(quartzId);
                quartzTaskRelaLog.setQuartzTaskRelaId(quartzTaskRelation.getId());
                quartzTaskRelaLog.setTaskIds(quartzTaskRelation.getTaskIds());
                quartzTaskRelaLog.setSourceId(quartzTaskRelation.getSourceId());
                quartzTaskRelaLog.setQzType(quartzTaskRelation.getQzType());
                quartzTaskRelaLog.setOperator("System");
                quartzTaskRelaLog.setOperation(action.equals(QuartzTaskAction.PAUSE) ? "暂停定时任务" : "启动定时任务");
                quartzTaskRelaLogMapper.insertSelective(quartzTaskRelaLog);
            }

        } catch (Exception e) {
            return false;
        }
        return true;
    }


    public void deleteQuartzTask(String quartzTaskId) {
        CloudAccountQuartzTask quartzTask = quartzTaskMapper.selectByPrimaryKey(quartzTaskId);
        String triggerId = quartzTask.getTriggerId();
        Trigger trigger;
        try {
            trigger = quartzManageService.getTrigger(new TriggerKey(triggerId));
            quartzManageService.deleteJob(trigger.getJobKey());
        } catch (Exception e) {
            LogUtil.warn("Scheduled task not found！");
        } finally {
            //删除整个任务
            CloudAccountQuartzTaskRelationExample example = new CloudAccountQuartzTaskRelationExample();
            example.createCriteria().andQuartzTaskIdEqualTo(quartzTaskId);
            List<CloudAccountQuartzTaskRelation> quartzTaskRelations = quartzTaskRelationMapper.selectByExample(example);
            for (CloudAccountQuartzTaskRelation quartzTaskRelation : quartzTaskRelations) {
                CloudAccountQuartzTaskRelaLogExample quartzTaskRelaLogExample = new CloudAccountQuartzTaskRelaLogExample();
                quartzTaskRelaLogExample.createCriteria().andQuartzTaskRelaIdEqualTo(quartzTaskRelation.getId());
                quartzTaskRelaLogMapper.deleteByExample(quartzTaskRelaLogExample);
                quartzTaskRelationMapper.deleteByPrimaryKey(quartzTaskRelation.getId());
            }
            quartzTaskMapper.deleteByPrimaryKey(quartzTaskId);
            OperationLogService.log(SessionUtils.getUser(), quartzTaskId, quartzTask.getName(), ResourceTypeConstants.QUOTA.name(), ResourceOperation.DELETE, "删除定时任务");
        }
    }

    public ShowAccountQuartzTaskDTO showAccount(String taskId) {
        try {
            ShowAccountQuartzTaskDTO showAccountQuartzTaskDTO = new ShowAccountQuartzTaskDTO();

            CloudAccountQuartzTask quartzTask = quartzTaskMapper.selectByPrimaryKey(taskId);

            CloudAccountQuartzTaskRelationExample example = new CloudAccountQuartzTaskRelationExample();
            example.createCriteria().andQuartzTaskIdEqualTo(taskId);
            List<CloudAccountQuartzTaskRelation> quartzTaskRelationList = quartzTaskRelationMapper.selectByExampleWithBLOBs(example);

            List<ShowAccountQuartzTaskRelationDto> quartzTaskRelationDtos = new ArrayList<>();
            for (CloudAccountQuartzTaskRelation rela : quartzTaskRelationList) {
                ShowAccountQuartzTaskRelationDto dto = new ShowAccountQuartzTaskRelationDto();
                BeanUtils.copyBean(dto, rela);

                JSONArray jsonArray = JSONArray.parseArray(rela.getTaskIds());
                List<TaskDTO> taskList = new ArrayList<>();
                for (Object obj : jsonArray) {
                    Task task = taskMapper.selectByPrimaryKey(obj.toString());
                    TaskDTO t = BeanUtils.copyBean(new TaskDTO(), task);
                    t.setAccountName(accountMapper.selectByPrimaryKey(task.getAccountId()).getName());
                    taskList.add(t);
                }
                dto.setTaskList(taskList);

                quartzTaskRelationDtos.add(dto);
            }
            showAccountQuartzTaskDTO.setQuartzTaskRelationDtos(quartzTaskRelationDtos);
            BeanUtils.copyBean(showAccountQuartzTaskDTO, quartzTask);
            return showAccountQuartzTaskDTO;
        } catch (Exception e) {
            LogUtil.error(e.getMessage());
            throw new RSException(e.getMessage());
        }
    }

}

class QuartzTaskStatus {
    protected final static String ERROR = "ERROR";
    protected final static String PAUSE = "PAUSE";
    protected final static String RUNNING = "RUNNING";
}

class QuartzTaskAction {
    protected final static String PAUSE = "pause";
    protected final static String RESUME = "resume";
}

