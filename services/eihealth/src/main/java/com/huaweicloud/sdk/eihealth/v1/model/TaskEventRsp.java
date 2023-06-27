package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 任务启动事件响应内容
 */
public class TaskEventRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_timestamp")

    private String firstTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_timestamp")

    private String lastTimestamp;

    public TaskEventRsp withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 任务启动事件类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TaskEventRsp withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 任务启动事件发生次数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public TaskEventRsp withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 任务启动事件状态
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public TaskEventRsp withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 任务启动事件详细信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public TaskEventRsp withFirstTimestamp(String firstTimestamp) {
        this.firstTimestamp = firstTimestamp;
        return this;
    }

    /**
     * 任务启动事件首次上报时间
     * @return firstTimestamp
     */
    public String getFirstTimestamp() {
        return firstTimestamp;
    }

    public void setFirstTimestamp(String firstTimestamp) {
        this.firstTimestamp = firstTimestamp;
    }

    public TaskEventRsp withLastTimestamp(String lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
        return this;
    }

    /**
     * 任务启动事件末次上报时间
     * @return lastTimestamp
     */
    public String getLastTimestamp() {
        return lastTimestamp;
    }

    public void setLastTimestamp(String lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskEventRsp taskEventRsp = (TaskEventRsp) o;
        return Objects.equals(this.type, taskEventRsp.type) && Objects.equals(this.count, taskEventRsp.count)
            && Objects.equals(this.reason, taskEventRsp.reason) && Objects.equals(this.message, taskEventRsp.message)
            && Objects.equals(this.firstTimestamp, taskEventRsp.firstTimestamp)
            && Objects.equals(this.lastTimestamp, taskEventRsp.lastTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, count, reason, message, firstTimestamp, lastTimestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskEventRsp {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    firstTimestamp: ").append(toIndentedString(firstTimestamp)).append("\n");
        sb.append("    lastTimestamp: ").append(toIndentedString(lastTimestamp)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}