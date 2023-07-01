package io.riskscanner.sechedule;

import com.fit2cloud.quartz.anno.QuartzScheduled;
import io.riskscanner.commons.utils.LogUtil;
import io.riskscanner.service.AccountService;
import io.riskscanner.service.RuleService;
import io.riskscanner.service.TaskService;
import org.quartz.*;

import javax.annotation.Resource;

public abstract class ScheduleJob implements Job {

    protected String resourceId;

    protected String userId;

    protected String expression;

    @Resource
    private TaskService taskService;
    @Resource
    private AccountService accountService;
    @Resource
    private RuleService ruleService;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {

        JobKey jobKey = context.getTrigger().getJobKey();
        JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
        this.resourceId = jobDataMap.getString("resourceId");
        this.userId = jobDataMap.getString("userId");
        this.expression = jobDataMap.getString("expression");

        LogUtil.info(jobKey.getGroup() + " Running: " + resourceId);
        LogUtil.info("CronExpression: " + expression);
        businessExecute(context);
    }

    abstract void businessExecute(JobExecutionContext context);

    @QuartzScheduled(cron = "${cron.regions.sync}")
    public void SyncRegions() {
        accountService.syncRegions();
    }

    @QuartzScheduled(cron = "${cron.taskSum.sync}")
    public void SyncTaskSum() {
        taskService.syncTaskSum();
    }

    @QuartzScheduled(cron = "${cron.history.sync}")
    public void SyncScan() {
        ruleService.syncScanHistory();
    }

}
