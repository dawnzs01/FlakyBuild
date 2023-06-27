package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListEntitiesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "child_id")

    private String childId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ListEntitiesRequest withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父节点（根或组织单元）的唯一标识符（ID）。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public ListEntitiesRequest withChildId(String childId) {
        this.childId = childId;
        return this;
    }

    /**
     * 子节点（根或组织单元）的唯一标识符（ID）。
     * @return childId
     */
    public String getChildId() {
        return childId;
    }

    public void setChildId(String childId) {
        this.childId = childId;
    }

    public ListEntitiesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 页面中最大结果数量。
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListEntitiesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页标记。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEntitiesRequest listEntitiesRequest = (ListEntitiesRequest) o;
        return Objects.equals(this.parentId, listEntitiesRequest.parentId)
            && Objects.equals(this.childId, listEntitiesRequest.childId)
            && Objects.equals(this.limit, listEntitiesRequest.limit)
            && Objects.equals(this.marker, listEntitiesRequest.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentId, childId, limit, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEntitiesRequest {\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    childId: ").append(toIndentedString(childId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
