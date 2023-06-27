package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateNotificationTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateNotificationTemplateRequestBody body;

    public UpdateNotificationTemplateRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 账号id，获取方式请参见：获取账号ID、项目ID、日志组ID、日志流ID（https://support.huaweicloud.com/api-lts/lts_api_0006.html）。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public UpdateNotificationTemplateRequest withBody(CreateNotificationTemplateRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateNotificationTemplateRequest withBody(Consumer<CreateNotificationTemplateRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateNotificationTemplateRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateNotificationTemplateRequestBody getBody() {
        return body;
    }

    public void setBody(CreateNotificationTemplateRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateNotificationTemplateRequest updateNotificationTemplateRequest = (UpdateNotificationTemplateRequest) o;
        return Objects.equals(this.domainId, updateNotificationTemplateRequest.domainId)
            && Objects.equals(this.body, updateNotificationTemplateRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNotificationTemplateRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
