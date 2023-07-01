package io.riskscanner.service;

import com.alibaba.fastjson.JSON;
import io.riskscanner.base.domain.Schedule;
import io.riskscanner.base.domain.ScheduleExample;
import io.riskscanner.base.domain.User;
import io.riskscanner.base.domain.UserExample;
import io.riskscanner.base.mapper.ScheduleMapper;
import io.riskscanner.base.mapper.UserMapper;
import io.riskscanner.base.mapper.ext.ExtScheduleMapper;
import io.riskscanner.commons.exception.RSException;
import io.riskscanner.commons.utils.LogUtil;
import io.riskscanner.commons.utils.ServiceUtils;
import io.riskscanner.commons.utils.SessionUtils;
import io.riskscanner.controller.request.OrderRequest;
import io.riskscanner.controller.request.QueryScheduleRequest;
import io.riskscanner.dto.ScheduleDao;
import io.riskscanner.sechedule.ScheduleManager;
import org.apache.commons.lang3.StringUtils;
import org.quartz.JobKey;
import org.quartz.SchedulerException;
import org.quartz.TriggerKey;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author maguohao
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ScheduleService {

    @Resource
    private ScheduleMapper scheduleMapper;
    @Resource
    private ScheduleManager scheduleManager;
    @Resource
    private ExtScheduleMapper extScheduleMapper;
    @Resource
    private UserMapper userMapper;

    public void addSchedule(Schedule schedule) {
        schedule.setId(UUID.randomUUID().toString());
        scheduleMapper.insert(schedule);
    }

    public Schedule getSchedule(String ScheduleId) {
        return scheduleMapper.selectByPrimaryKey(ScheduleId);
    }

    public int editSchedule(Schedule schedule) {
        return scheduleMapper.updateByPrimaryKeySelective(schedule);
    }

    public Schedule getScheduleByResource(String resourceId, String group) {
        ScheduleExample example = new ScheduleExample();
        example.createCriteria().andResourceIdEqualTo(resourceId).andGroupEqualTo(group);
        List<Schedule> schedules = scheduleMapper.selectByExample(example);
        if (!schedules.isEmpty()) {
            return schedules.get(0);
        }
        return null;
    }

    public int deleteSchedule(String scheduleId) {
        Schedule schedule = scheduleMapper.selectByPrimaryKey(scheduleId);
        removeJob(schedule.getResourceId());
        return scheduleMapper.deleteByPrimaryKey(scheduleId);
    }

    public int deleteByResourceId(String resourceId) {
        ScheduleExample scheduleExample = new ScheduleExample();
        scheduleExample.createCriteria().andResourceIdEqualTo(resourceId);
        removeJob(resourceId);
        return scheduleMapper.deleteByExample(scheduleExample);
    }

    public List<Schedule> listSchedule() {
        ScheduleExample example = new ScheduleExample();
        return scheduleMapper.selectByExample(example);
    }

    public List<Schedule> getEnableSchedule() {
        ScheduleExample example = new ScheduleExample();
        example.createCriteria().andEnableEqualTo(true);
        return scheduleMapper.selectByExample(example);
    }

    public void startEnableSchedules() {
        List<Schedule> Schedules = getEnableSchedule();
        Schedules.forEach(schedule -> {
            try {
                if (schedule.getEnable()) {
                    LogUtil.error("初始化任务：" + JSON.toJSONString(schedule));
                    scheduleManager.addOrUpdateCronJob(new JobKey(schedule.getKey(), schedule.getGroup()),
                            new TriggerKey(schedule.getKey(), schedule.getGroup()), Class.forName(schedule.getJob()), schedule.getValue(),
                            scheduleManager.getDefaultJobDataMap(schedule.getResourceId(), schedule.getValue(), schedule.getUserId()));
                }
            } catch (RSException | ClassNotFoundException | SchedulerException e) {
                LogUtil.error("初始化任务失败", e);
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Schedule buildApiTestSchedule(Schedule request) {
        Schedule schedule = new Schedule();
        schedule.setResourceId(request.getResourceId());
        schedule.setEnable(request.getEnable());
        schedule.setValue(request.getValue().trim());
        schedule.setKey(request.getResourceId());
        schedule.setUserId(Objects.requireNonNull(SessionUtils.getUser()).getId());
        return schedule;
    }

    public void removeJob(String resourceId) {
    }

    public void addOrUpdateCronJob(Schedule request, JobKey jobKey, TriggerKey triggerKey, Class clazz) throws Exception {
        Boolean enable = request.getEnable();
        String cronExpression = request.getValue();
        if (enable != null && enable && StringUtils.isNotBlank(cronExpression)) {
            try {
                scheduleManager.addOrUpdateCronJob(jobKey, triggerKey, clazz, cronExpression, scheduleManager.getDefaultJobDataMap(request.getResourceId(), cronExpression, SessionUtils.getUser().getId()));
            } catch (SchedulerException e) {
                LogUtil.error(e.getMessage(), e);
                RSException.throwException("定时任务开启异常");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                scheduleManager.removeJob(jobKey, triggerKey);
            } catch (RSException e) {
                RSException.throwException("定时任务关闭异常");
            }
        }
    }

    public List<ScheduleDao> list(QueryScheduleRequest request) {
        List<OrderRequest> orderList = ServiceUtils.getDefaultOrder(request.getOrders());
        request.setOrders(orderList);
        return extScheduleMapper.list(request);
    }

    public void build(Map<String, String> resourceNameMap, List<ScheduleDao> schedules) {
        List<String> userIds = schedules.stream()
                .map(Schedule::getUserId)
                .collect(Collectors.toList());
        UserExample example = new UserExample();
        example.createCriteria().andIdIn(userIds);
        Map<String, String> userMap = userMapper.selectByExample(example).stream().collect(Collectors.toMap(User::getId, User::getName));
        schedules.forEach(schedule -> {
            schedule.setResourceName(resourceNameMap.get(schedule.getResourceId()));
            schedule.setUserName(userMap.get(schedule.getUserId()));
        });
    }
}
