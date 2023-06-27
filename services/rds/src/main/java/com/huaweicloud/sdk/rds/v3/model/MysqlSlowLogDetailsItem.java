package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MysqlSlowLogDetailsItem
 */
public class MysqlSlowLogDetailsItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private String count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_time")

    private String lockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_sent")

    private String rowsSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_examined")

    private String rowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private String users;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_sample")

    private String querySample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ip")

    private String clientIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_num")

    private String lineNum;

    public MysqlSlowLogDetailsItem withCount(String count) {
        this.count = count;
        return this;
    }

    /**
     * 执行次数。
     * @return count
     */
    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public MysqlSlowLogDetailsItem withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 执行时间。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public MysqlSlowLogDetailsItem withLockTime(String lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    /**
     * 等待锁时间。mysql支持
     * @return lockTime
     */
    public String getLockTime() {
        return lockTime;
    }

    public void setLockTime(String lockTime) {
        this.lockTime = lockTime;
    }

    public MysqlSlowLogDetailsItem withRowsSent(String rowsSent) {
        this.rowsSent = rowsSent;
        return this;
    }

    /**
     * 结果行数量。mysql支持
     * @return rowsSent
     */
    public String getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(String rowsSent) {
        this.rowsSent = rowsSent;
    }

    public MysqlSlowLogDetailsItem withRowsExamined(String rowsExamined) {
        this.rowsExamined = rowsExamined;
        return this;
    }

    /**
     * 扫描的行数量。mysql支持
     * @return rowsExamined
     */
    public String getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(String rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public MysqlSlowLogDetailsItem withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 所属数据库。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public MysqlSlowLogDetailsItem withUsers(String users) {
        this.users = users;
        return this;
    }

    /**
     * 帐号。
     * @return users
     */
    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public MysqlSlowLogDetailsItem withQuerySample(String querySample) {
        this.querySample = querySample;
        return this;
    }

    /**
     * 执行语法。慢日志默认脱敏显示，如需明文显示，请联系客服人员添加白名单。
     * @return querySample
     */
    public String getQuerySample() {
        return querySample;
    }

    public void setQuerySample(String querySample) {
        this.querySample = querySample;
    }

    public MysqlSlowLogDetailsItem withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 语句类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MysqlSlowLogDetailsItem withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 发生时间，UTC时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public MysqlSlowLogDetailsItem withClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * IP地址。
     * @return clientIp
     */
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public MysqlSlowLogDetailsItem withLineNum(String lineNum) {
        this.lineNum = lineNum;
        return this;
    }

    /**
     * 日志单行序列号。
     * @return lineNum
     */
    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MysqlSlowLogDetailsItem mysqlSlowLogDetailsItem = (MysqlSlowLogDetailsItem) o;
        return Objects.equals(this.count, mysqlSlowLogDetailsItem.count)
            && Objects.equals(this.time, mysqlSlowLogDetailsItem.time)
            && Objects.equals(this.lockTime, mysqlSlowLogDetailsItem.lockTime)
            && Objects.equals(this.rowsSent, mysqlSlowLogDetailsItem.rowsSent)
            && Objects.equals(this.rowsExamined, mysqlSlowLogDetailsItem.rowsExamined)
            && Objects.equals(this.database, mysqlSlowLogDetailsItem.database)
            && Objects.equals(this.users, mysqlSlowLogDetailsItem.users)
            && Objects.equals(this.querySample, mysqlSlowLogDetailsItem.querySample)
            && Objects.equals(this.type, mysqlSlowLogDetailsItem.type)
            && Objects.equals(this.startTime, mysqlSlowLogDetailsItem.startTime)
            && Objects.equals(this.clientIp, mysqlSlowLogDetailsItem.clientIp)
            && Objects.equals(this.lineNum, mysqlSlowLogDetailsItem.lineNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count,
            time,
            lockTime,
            rowsSent,
            rowsExamined,
            database,
            users,
            querySample,
            type,
            startTime,
            clientIp,
            lineNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlSlowLogDetailsItem {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
        sb.append("    rowsSent: ").append(toIndentedString(rowsSent)).append("\n");
        sb.append("    rowsExamined: ").append(toIndentedString(rowsExamined)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    querySample: ").append(toIndentedString(querySample)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
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