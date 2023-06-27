package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowImageWatermarkByAddressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watermark")

    private String watermark;

    public ShowImageWatermarkByAddressResponse withWatermark(String watermark) {
        this.watermark = watermark;
        return this;
    }

    /**
     * 暗水印内容，长度不超过32个字节
     * @return watermark
     */
    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowImageWatermarkByAddressResponse showImageWatermarkByAddressResponse =
            (ShowImageWatermarkByAddressResponse) o;
        return Objects.equals(this.watermark, showImageWatermarkByAddressResponse.watermark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(watermark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImageWatermarkByAddressResponse {\n");
        sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
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