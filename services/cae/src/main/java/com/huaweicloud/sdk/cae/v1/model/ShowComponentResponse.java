package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowComponentResponse extends SdkResponse {

    /**
     * API版本。
     */
    public static final class ApiVersionEnum {

        /**
         * Enum V1 for value: "v1"
         */
        public static final ApiVersionEnum V1 = new ApiVersionEnum("v1");

        private static final Map<String, ApiVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApiVersionEnum> createStaticFields() {
            Map<String, ApiVersionEnum> map = new HashMap<>();
            map.put("v1", V1);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApiVersionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ApiVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ApiVersionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ApiVersionEnum(value);
            }
            return result;
        }

        public static ApiVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ApiVersionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApiVersionEnum) {
                return this.value.equals(((ApiVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_version")

    private ApiVersionEnum apiVersion;

    /**
     * 资源种类。
     */
    public static final class KindEnum {

        /**
         * Enum COMPONENT for value: "Component"
         */
        public static final KindEnum COMPONENT = new KindEnum("Component");

        private static final Map<String, KindEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KindEnum> createStaticFields() {
            Map<String, KindEnum> map = new HashMap<>();
            map.put("Component", COMPONENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KindEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static KindEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            KindEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new KindEnum(value);
            }
            return result;
        }

        public static KindEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            KindEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KindEnum) {
                return this.value.equals(((KindEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private KindEnum kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private MetadataResponse metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private ComponentSpec spec;

    public ShowComponentResponse withApiVersion(ApiVersionEnum apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * API版本。
     * @return apiVersion
     */
    public ApiVersionEnum getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(ApiVersionEnum apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ShowComponentResponse withKind(KindEnum kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 资源种类。
     * @return kind
     */
    public KindEnum getKind() {
        return kind;
    }

    public void setKind(KindEnum kind) {
        this.kind = kind;
    }

    public ShowComponentResponse withMetadata(MetadataResponse metadata) {
        this.metadata = metadata;
        return this;
    }

    public ShowComponentResponse withMetadata(Consumer<MetadataResponse> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new MetadataResponse();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public MetadataResponse getMetadata() {
        return metadata;
    }

    public void setMetadata(MetadataResponse metadata) {
        this.metadata = metadata;
    }

    public ShowComponentResponse withSpec(ComponentSpec spec) {
        this.spec = spec;
        return this;
    }

    public ShowComponentResponse withSpec(Consumer<ComponentSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new ComponentSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public ComponentSpec getSpec() {
        return spec;
    }

    public void setSpec(ComponentSpec spec) {
        this.spec = spec;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowComponentResponse showComponentResponse = (ShowComponentResponse) o;
        return Objects.equals(this.apiVersion, showComponentResponse.apiVersion)
            && Objects.equals(this.kind, showComponentResponse.kind)
            && Objects.equals(this.metadata, showComponentResponse.metadata)
            && Objects.equals(this.spec, showComponentResponse.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowComponentResponse {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
