package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateCustomPropsTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CustomPropsTaskData body;

    public CreateCustomPropsTaskRequest withBody(CustomPropsTaskData body) {
        this.body = body;
        return this;
    }

    public CreateCustomPropsTaskRequest withBody(Consumer<CustomPropsTaskData> bodySetter) {
        if (this.body == null) {
            this.body = new CustomPropsTaskData();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CustomPropsTaskData getBody() {
        return body;
    }

    public void setBody(CustomPropsTaskData body) {
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
        CreateCustomPropsTaskRequest createCustomPropsTaskRequest = (CreateCustomPropsTaskRequest) o;
        return Objects.equals(this.body, createCustomPropsTaskRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCustomPropsTaskRequest {\n");
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
