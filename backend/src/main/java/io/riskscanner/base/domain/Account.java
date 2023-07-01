package io.riskscanner.base.domain;

import java.io.Serializable;

public class Account implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_account.id
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_account.name
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_account.plugin_id
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    private String pluginId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_account.plugin_name
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    private String pluginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_account.plugin_icon
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    private String pluginIcon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_account.status
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_account.create_time
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_account.update_time
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    private Long updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_account.creator
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    private String creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_account.proxy_id
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    private Integer proxyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_account
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_account.id
     *
     * @return the value of cloud_account.id
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_account.id
     *
     * @param id the value for cloud_account.id
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_account.name
     *
     * @return the value of cloud_account.name
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_account.name
     *
     * @param name the value for cloud_account.name
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_account.plugin_id
     *
     * @return the value of cloud_account.plugin_id
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    public String getPluginId() {
        return pluginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_account.plugin_id
     *
     * @param pluginId the value for cloud_account.plugin_id
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    public void setPluginId(String pluginId) {
        this.pluginId = pluginId == null ? null : pluginId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_account.plugin_name
     *
     * @return the value of cloud_account.plugin_name
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    public String getPluginName() {
        return pluginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_account.plugin_name
     *
     * @param pluginName the value for cloud_account.plugin_name
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    public void setPluginName(String pluginName) {
        this.pluginName = pluginName == null ? null : pluginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_account.plugin_icon
     *
     * @return the value of cloud_account.plugin_icon
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    public String getPluginIcon() {
        return pluginIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_account.plugin_icon
     *
     * @param pluginIcon the value for cloud_account.plugin_icon
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    public void setPluginIcon(String pluginIcon) {
        this.pluginIcon = pluginIcon == null ? null : pluginIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_account.status
     *
     * @return the value of cloud_account.status
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_account.status
     *
     * @param status the value for cloud_account.status
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_account.create_time
     *
     * @return the value of cloud_account.create_time
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_account.create_time
     *
     * @param createTime the value for cloud_account.create_time
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_account.update_time
     *
     * @return the value of cloud_account.update_time
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_account.update_time
     *
     * @param updateTime the value for cloud_account.update_time
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_account.creator
     *
     * @return the value of cloud_account.creator
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_account.creator
     *
     * @param creator the value for cloud_account.creator
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_account.proxy_id
     *
     * @return the value of cloud_account.proxy_id
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    public Integer getProxyId() {
        return proxyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_account.proxy_id
     *
     * @param proxyId the value for cloud_account.proxy_id
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2021
     */
    public void setProxyId(Integer proxyId) {
        this.proxyId = proxyId;
    }
}