package io.riskscanner.base.domain;

import java.io.Serializable;

public class MessageOrder implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_order.id
     *
     * @mbg.generated Thu Mar 25 18:38:06 CST 2021
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_order.account_id
     *
     * @mbg.generated Thu Mar 25 18:38:06 CST 2021
     */
    private String accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_order.account_name
     *
     * @mbg.generated Thu Mar 25 18:38:06 CST 2021
     */
    private String accountName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_order.status
     *
     * @mbg.generated Thu Mar 25 18:38:06 CST 2021
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_order.create_time
     *
     * @mbg.generated Thu Mar 25 18:38:06 CST 2021
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_order.send_time
     *
     * @mbg.generated Thu Mar 25 18:38:06 CST 2021
     */
    private Long sendTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table message_order
     *
     * @mbg.generated Thu Mar 25 18:38:06 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_order.id
     *
     * @return the value of message_order.id
     *
     * @mbg.generated Thu Mar 25 18:38:06 CST 2021
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_order.id
     *
     * @param id the value for message_order.id
     *
     * @mbg.generated Thu Mar 25 18:38:06 CST 2021
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_order.account_id
     *
     * @return the value of message_order.account_id
     *
     * @mbg.generated Thu Mar 25 18:38:06 CST 2021
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_order.account_id
     *
     * @param accountId the value for message_order.account_id
     *
     * @mbg.generated Thu Mar 25 18:38:06 CST 2021
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_order.account_name
     *
     * @return the value of message_order.account_name
     *
     * @mbg.generated Thu Mar 25 18:38:06 CST 2021
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_order.account_name
     *
     * @param accountName the value for message_order.account_name
     *
     * @mbg.generated Thu Mar 25 18:38:06 CST 2021
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_order.status
     *
     * @return the value of message_order.status
     *
     * @mbg.generated Thu Mar 25 18:38:06 CST 2021
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_order.status
     *
     * @param status the value for message_order.status
     *
     * @mbg.generated Thu Mar 25 18:38:06 CST 2021
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_order.create_time
     *
     * @return the value of message_order.create_time
     *
     * @mbg.generated Thu Mar 25 18:38:06 CST 2021
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_order.create_time
     *
     * @param createTime the value for message_order.create_time
     *
     * @mbg.generated Thu Mar 25 18:38:06 CST 2021
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_order.send_time
     *
     * @return the value of message_order.send_time
     *
     * @mbg.generated Thu Mar 25 18:38:06 CST 2021
     */
    public Long getSendTime() {
        return sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_order.send_time
     *
     * @param sendTime the value for message_order.send_time
     *
     * @mbg.generated Thu Mar 25 18:38:06 CST 2021
     */
    public void setSendTime(Long sendTime) {
        this.sendTime = sendTime;
    }
}