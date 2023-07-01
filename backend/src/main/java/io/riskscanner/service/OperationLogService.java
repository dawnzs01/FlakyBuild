package io.riskscanner.service;

import io.riskscanner.base.domain.OperationLog;
import io.riskscanner.base.domain.OperationLogExample;
import io.riskscanner.base.domain.User;
import io.riskscanner.base.mapper.OperationLogMapper;
import io.riskscanner.commons.utils.SessionUtils;
import io.riskscanner.commons.utils.UUIDUtil;
import io.riskscanner.controller.request.log.OperayionLogRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class OperationLogService {

    private static OperationLogMapper operationLogMapper;

    public static void log(String resourceId, String resourceName, String resourceType, String operation, String message) {
        User user = SessionUtils.getUser();
        String ip = SessionUtils.getRemoteAddress();
        OperationLog operationLog = createOperationLog(user, resourceId, resourceName, resourceType, operation, message, ip);
        operationLogMapper.insertSelective(operationLog);
    }

    public static void log(User user, String resourceId, String resourceName, String resourceType, String operation, String message) {
        String ip = SessionUtils.getRemoteAddress();
        OperationLog operationLog = createOperationLog(user, resourceId, resourceName, resourceType, operation, message, ip);
        operationLogMapper.insertSelective(operationLog);
    }

    public static void log(OperationLog operationLog) {
        if (StringUtils.isBlank(operationLog.getId())) {
            operationLog.setId(UUIDUtil.newUUID());
        }
        operationLogMapper.insertSelective(operationLog);
    }

    public static OperationLog createOperationLog(User user, String resourceId, String resourceName, String resourceType, String operation, String message, String ip) {
        OperationLog operationLog = new OperationLog();
        operationLog.setId(UUIDUtil.newUUID());
        operationLog.setResourceId(resourceId);
        operationLog.setResourceName(resourceName);
        if (user == null) {
            operationLog.setResourceUserId(SystemUserConstants.getUserId());
            operationLog.setResourceUserName(SystemUserConstants.getUser().getName());
        } else {
            operationLog.setResourceUserId(user.getId());
            operationLog.setResourceUserName(user.getName() + " [" + user.getEmail() + "]");
        }
        operationLog.setResourceType(resourceType);
        operationLog.setOperation(operation);
        operationLog.setMessage(message);
        operationLog.setSourceIp(ip);
        operationLog.setTime(System.currentTimeMillis());
        return operationLog;
    }

    @Resource
    public void setOperationLogMapper(OperationLogMapper operationLogMapper) {
        OperationLogService.operationLogMapper = operationLogMapper;
    }

    public List<OperationLog> selectOperationLog(OperayionLogRequest dto) {
        OperationLogExample example = new OperationLogExample();
        if (StringUtils.isNotEmpty(dto.getName())) {
            example.createCriteria().andResourceUserIdLike(dto.getName());
        }
        example.setOrderByClause("time desc");
        return operationLogMapper.selectByExampleWithBLOBs(example);
    }

    public List<OperationLog> selectRersourceOperationLog(String resourceId) {
        OperationLogExample example = new OperationLogExample();
        example.createCriteria().andResourceIdEqualTo(resourceId);
        example.setOrderByClause("time desc");
        return operationLogMapper.selectByExample(example);
    }
}

class SystemUserConstants extends User {

    private static User user = new User();

    static {
        user.setId("system");
        user.setName("SYSTEM");
    }

    public static User getUser() {
        return user;
    }

    public static String getUserId() {
        return user.getId();
    }

}
