package io.riskscanner.base.domain;

import java.io.Serializable;

public class Rule implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.id
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.name
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.status
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    private Boolean status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.severity
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    private String severity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.description
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.script
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    private String script;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.parameter
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    private String parameter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.plugin_id
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    private String pluginId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.plugin_name
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    private String pluginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.plugin_icon
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    private String pluginIcon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.last_modified
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    private Long lastModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.flag
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    private Boolean flag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.scan_type
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    private String scanType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.id
     *
     * @return the value of rule.id
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.id
     *
     * @param id the value for rule.id
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.name
     *
     * @return the value of rule.name
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.name
     *
     * @param name the value for rule.name
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.status
     *
     * @return the value of rule.status
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.status
     *
     * @param status the value for rule.status
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.severity
     *
     * @return the value of rule.severity
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.severity
     *
     * @param severity the value for rule.severity
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public void setSeverity(String severity) {
        this.severity = severity == null ? null : severity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.description
     *
     * @return the value of rule.description
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.description
     *
     * @param description the value for rule.description
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.script
     *
     * @return the value of rule.script
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public String getScript() {
        return script;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.script
     *
     * @param script the value for rule.script
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public void setScript(String script) {
        this.script = script == null ? null : script.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.parameter
     *
     * @return the value of rule.parameter
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public String getParameter() {
        return parameter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.parameter
     *
     * @param parameter the value for rule.parameter
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public void setParameter(String parameter) {
        this.parameter = parameter == null ? null : parameter.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.plugin_id
     *
     * @return the value of rule.plugin_id
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public String getPluginId() {
        return pluginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.plugin_id
     *
     * @param pluginId the value for rule.plugin_id
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public void setPluginId(String pluginId) {
        this.pluginId = pluginId == null ? null : pluginId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.plugin_name
     *
     * @return the value of rule.plugin_name
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public String getPluginName() {
        return pluginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.plugin_name
     *
     * @param pluginName the value for rule.plugin_name
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public void setPluginName(String pluginName) {
        this.pluginName = pluginName == null ? null : pluginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.plugin_icon
     *
     * @return the value of rule.plugin_icon
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public String getPluginIcon() {
        return pluginIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.plugin_icon
     *
     * @param pluginIcon the value for rule.plugin_icon
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public void setPluginIcon(String pluginIcon) {
        this.pluginIcon = pluginIcon == null ? null : pluginIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.last_modified
     *
     * @return the value of rule.last_modified
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public Long getLastModified() {
        return lastModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.last_modified
     *
     * @param lastModified the value for rule.last_modified
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public void setLastModified(Long lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.flag
     *
     * @return the value of rule.flag
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public Boolean getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.flag
     *
     * @param flag the value for rule.flag
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.scan_type
     *
     * @return the value of rule.scan_type
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public String getScanType() {
        return scanType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.scan_type
     *
     * @param scanType the value for rule.scan_type
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public void setScanType(String scanType) {
        this.scanType = scanType == null ? null : scanType.trim();
    }
}