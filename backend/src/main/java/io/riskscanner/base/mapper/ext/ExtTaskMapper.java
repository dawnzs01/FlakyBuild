package io.riskscanner.base.mapper.ext;

import io.riskscanner.base.domain.MessageOrder;
import io.riskscanner.base.domain.Task;
import io.riskscanner.controller.request.task.TaskSearchRequest;
import io.riskscanner.dto.TaskDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExtTaskMapper {

    TaskDTO getTaskDetail(@Param("taskId") String taskId);

    List<Task> searchTask(TaskSearchRequest request);

    TaskDTO getTaskExtendInfo(String taskId);

    int getResourceSum(String taskId);

    int getReturnSum(String taskId);

    List<Task> getTopTasksForEmail(MessageOrder messageOrder);

    int getReturnSumForEmail(MessageOrder messageOrder);

    int getResourcesSumForEmail(MessageOrder messageOrder);
}
