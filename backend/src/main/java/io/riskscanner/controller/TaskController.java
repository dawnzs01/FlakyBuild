package io.riskscanner.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.riskscanner.base.domain.*;
import io.riskscanner.commons.utils.PageUtils;
import io.riskscanner.commons.utils.Pager;
import io.riskscanner.dto.*;
import io.riskscanner.service.OrderService;
import io.riskscanner.service.TaskService;
import org.quartz.CronExpression;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@ApiIgnore
@RestController
@RequestMapping(value = "task")
public class TaskController {
    @Resource
    private TaskService taskService;
    @Resource
    private OrderService orderService;

    @GetMapping(value = "detail/{taskId}")
    public TaskDTO getTaskDetail(@PathVariable String taskId) {
        return orderService.getTaskDetail(taskId);
    }

    @GetMapping(value = "copy/{taskId}")
    public TaskCopyDTO copy(@PathVariable String taskId) {
        return orderService.copy(taskId);
    }

    @GetMapping(value = "log/taskId/{taskId}")
    public List<TaskItemLogDTO> getTaskItemLogByTask(@PathVariable String taskId) {
        return orderService.getTaskItemLogByTaskId(taskId);
    }

    @GetMapping(value = "quartz/log/taskId/{taskId}")
    public List<TaskItemLogDTO> getQuartzLogByTask(@PathVariable String taskId) {
        return orderService.getQuartzLogByTask(taskId);
    }

    @PostMapping("quartz/log/{taskItemId}/{goPage}/{pageSize}")
    public Pager<List<TaskItemLog>> getquartzLogDetails(@PathVariable int goPage, @PathVariable int pageSize, @PathVariable String taskItemId) {
        TaskItemWithBLOBs taskItem = orderService.taskItemWithBLOBs(taskItemId);
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, orderService.getQuartzLogByTaskItemId(taskItem));
    }

    @PostMapping("quartz/rela/log/{qzTaskId}/{goPage}/{pageSize}")
    public Pager<List<CloudAccountQuartzTaskRelaLog>> getQuartzLogs(@PathVariable int goPage, @PathVariable int pageSize, @PathVariable String qzTaskId) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, orderService.getQuartzLogsById(qzTaskId));
    }

    @GetMapping(value = "extendinfo/{taskId}")
    public TaskDTO getTaskExtendInfo(@PathVariable String taskId) {
        return orderService.getTaskExtendInfo(taskId);
    }

    @PostMapping(value = "retry/{taskId}")
    public void retryTask(@PathVariable String taskId) {
        orderService.retry(taskId);
    }

    @PostMapping(value = "getCronDesc/{taskId}")
    public void getCronDesc(@PathVariable String taskId) throws Exception {
        orderService.getCronDesc(taskId);
    }

    @PostMapping("manual/list/{goPage}/{pageSize}")
    public Pager<List<Task>> getManualTasks(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody Map<String, Object> param) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        param.put("type", "manual");
        return PageUtils.setPageInfo(page, taskService.selectManualTasks(param));
    }

    @PostMapping("manual/Alllist")
    public List<Task> getAllManualTasks(@RequestBody Map<String, Object> param) {
        param.put("type", "manual");
        return taskService.selectManualTasks(param);
    }

    @GetMapping("manual/more/{taskId}")
    public boolean morelTask(@PathVariable String taskId) {
        return taskService.morelTask(taskId);
    }

    @PostMapping("manual/create")
    public Task saveManualTask(@RequestBody QuartzTaskDTO quartzTaskDTO) {
        quartzTaskDTO.setType("manual");
        return taskService.saveManualTask(quartzTaskDTO, null);
    }

    @PostMapping("manual/delete")
    public void deleteManualTask(@RequestBody String quartzTaskId) {
        taskService.deleteManualTask(quartzTaskId);
    }

    @PostMapping(value = "manual/dryRun")
    public boolean dryRun(@RequestBody QuartzTaskDTO quartzTaskDTO) {
        quartzTaskDTO.setType("manual");
        return taskService.dryRun(quartzTaskDTO);
    }

    @PostMapping("quartz/list/{goPage}/{pageSize}")
    public Pager<List<CloudAccountQuartzTask>> getQuartzTasks(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody Map<String, Object> param) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, taskService.selectQuartzTasks(param));
    }

    @PostMapping("quartz/Alllist")
    public List<CloudAccountQuartzTask> getQuartzTasks(@RequestBody Map<String, Object> param) {
        return taskService.selectQuartzTasks(param);
    }

    @PostMapping("quartz/create")
    public boolean saveQuartzTask(@RequestBody CloudAccountQuartzTaskDTO cloudAccountQuartzTaskDTO) throws Exception {
        return taskService.saveQuartzTask(cloudAccountQuartzTaskDTO);
    }

    @GetMapping("quartz/pause/{quartzTaskId}")
    public boolean pauseQuartzTask(@PathVariable String quartzTaskId) throws Exception {
        return taskService.changeQuartzStatus(quartzTaskId, "pause");
    }

    @GetMapping("quartz/resume/{quartzTaskId}")
    public boolean resumeQuartzTask(@PathVariable String quartzTaskId) throws Exception {
        return taskService.changeQuartzStatus(quartzTaskId, "resume");
    }

    @GetMapping("quartz/delete/{quartzTaskId}")
    public void deleteQuartzTask(@PathVariable String quartzTaskId) {
        taskService.deleteQuartzTask(quartzTaskId);
    }

    @PostMapping(value = "quartz/dryRun")
    public boolean quartzDryRun(@RequestBody QuartzTaskDTO quartzTaskDTO) {
        quartzTaskDTO.setType("quartz");
        return taskService.dryRun(quartzTaskDTO);
    }

    @PostMapping(value = "quartz/validateCron")
    public boolean validateCron(@RequestBody Map<String, String> map) {
        return CronExpression.isValidExpression(map.get("cron"));
    }

    @GetMapping("show/account/{taskId}")
    public ShowAccountQuartzTaskDTO showAccount(@PathVariable String taskId) {
        return taskService.showAccount(taskId);
    }

}
