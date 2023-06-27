package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 执行shell命令请求体。
 */
public class RunShellCommandRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_ids")

    private List<String> phoneIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ids")

    private List<String> serverIds = null;

    public RunShellCommandRequestBody withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * ADB命令，固定填写shell。
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public RunShellCommandRequestBody withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 待执行的命令。  最大长度为1024字节，只支持大小写字母、数字、下划线（_）、点（.）、斜线（/）、冒号（:）、中划线（-）。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public RunShellCommandRequestBody withPhoneIds(List<String> phoneIds) {
        this.phoneIds = phoneIds;
        return this;
    }

    public RunShellCommandRequestBody addPhoneIdsItem(String phoneIdsItem) {
        if (this.phoneIds == null) {
            this.phoneIds = new ArrayList<>();
        }
        this.phoneIds.add(phoneIdsItem);
        return this;
    }

    public RunShellCommandRequestBody withPhoneIds(Consumer<List<String>> phoneIdsSetter) {
        if (this.phoneIds == null) {
            this.phoneIds = new ArrayList<>();
        }
        phoneIdsSetter.accept(this.phoneIds);
        return this;
    }

    /**
     * 云手机ID列表。 server_ids参数不存在时必选，同时存在只处理phone_ids。
     * @return phoneIds
     */
    public List<String> getPhoneIds() {
        return phoneIds;
    }

    public void setPhoneIds(List<String> phoneIds) {
        this.phoneIds = phoneIds;
    }

    public RunShellCommandRequestBody withServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }

    public RunShellCommandRequestBody addServerIdsItem(String serverIdsItem) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        this.serverIds.add(serverIdsItem);
        return this;
    }

    public RunShellCommandRequestBody withServerIds(Consumer<List<String>> serverIdsSetter) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        serverIdsSetter.accept(this.serverIds);
        return this;
    }

    /**
     * 云手机服务器ID列表。 phone_ids参数不存在时必选，同时存在只处理phone_ids。
     * @return serverIds
     */
    public List<String> getServerIds() {
        return serverIds;
    }

    public void setServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunShellCommandRequestBody runShellCommandRequestBody = (RunShellCommandRequestBody) o;
        return Objects.equals(this.command, runShellCommandRequestBody.command)
            && Objects.equals(this.content, runShellCommandRequestBody.content)
            && Objects.equals(this.phoneIds, runShellCommandRequestBody.phoneIds)
            && Objects.equals(this.serverIds, runShellCommandRequestBody.serverIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(command, content, phoneIds, serverIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunShellCommandRequestBody {\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    phoneIds: ").append(toIndentedString(phoneIds)).append("\n");
        sb.append("    serverIds: ").append(toIndentedString(serverIds)).append("\n");
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
