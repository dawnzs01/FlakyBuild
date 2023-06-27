package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateVariableResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "json")

    private CreateVariableResultJson json;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public UpdateVariableResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * code
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public UpdateVariableResponse withJson(CreateVariableResultJson json) {
        this.json = json;
        return this;
    }

    public UpdateVariableResponse withJson(Consumer<CreateVariableResultJson> jsonSetter) {
        if (this.json == null) {
            this.json = new CreateVariableResultJson();
            jsonSetter.accept(this.json);
        }

        return this;
    }

    /**
     * Get json
     * @return json
     */
    public CreateVariableResultJson getJson() {
        return json;
    }

    public void setJson(CreateVariableResultJson json) {
        this.json = json;
    }

    public UpdateVariableResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * message
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateVariableResponse updateVariableResponse = (UpdateVariableResponse) o;
        return Objects.equals(this.code, updateVariableResponse.code)
            && Objects.equals(this.json, updateVariableResponse.json)
            && Objects.equals(this.message, updateVariableResponse.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, json, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVariableResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    json: ").append(toIndentedString(json)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
