package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class PushPortalInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private PushPortalInfoResponseModel data;

    public PushPortalInfoResponse withData(PushPortalInfoResponseModel data) {
        this.data = data;
        return this;
    }

    public PushPortalInfoResponse withData(Consumer<PushPortalInfoResponseModel> dataSetter) {
        if (this.data == null) {
            this.data = new PushPortalInfoResponseModel();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public PushPortalInfoResponseModel getData() {
        return data;
    }

    public void setData(PushPortalInfoResponseModel data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PushPortalInfoResponse pushPortalInfoResponse = (PushPortalInfoResponse) o;
        return Objects.equals(this.data, pushPortalInfoResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PushPortalInfoResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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