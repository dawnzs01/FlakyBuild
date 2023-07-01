package io.riskscanner.base.mapper;

import io.riskscanner.base.domain.MessageOrderItem;
import io.riskscanner.base.domain.MessageOrderItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageOrderItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order_item
     *
     * @mbg.generated Thu Mar 11 14:08:10 CST 2021
     */
    long countByExample(MessageOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order_item
     *
     * @mbg.generated Thu Mar 11 14:08:10 CST 2021
     */
    int deleteByExample(MessageOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order_item
     *
     * @mbg.generated Thu Mar 11 14:08:10 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order_item
     *
     * @mbg.generated Thu Mar 11 14:08:10 CST 2021
     */
    int insert(MessageOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order_item
     *
     * @mbg.generated Thu Mar 11 14:08:10 CST 2021
     */
    int insertSelective(MessageOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order_item
     *
     * @mbg.generated Thu Mar 11 14:08:10 CST 2021
     */
    List<MessageOrderItem> selectByExample(MessageOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order_item
     *
     * @mbg.generated Thu Mar 11 14:08:10 CST 2021
     */
    MessageOrderItem selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order_item
     *
     * @mbg.generated Thu Mar 11 14:08:10 CST 2021
     */
    int updateByExampleSelective(@Param("record") MessageOrderItem record, @Param("example") MessageOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order_item
     *
     * @mbg.generated Thu Mar 11 14:08:10 CST 2021
     */
    int updateByExample(@Param("record") MessageOrderItem record, @Param("example") MessageOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order_item
     *
     * @mbg.generated Thu Mar 11 14:08:10 CST 2021
     */
    int updateByPrimaryKeySelective(MessageOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order_item
     *
     * @mbg.generated Thu Mar 11 14:08:10 CST 2021
     */
    int updateByPrimaryKey(MessageOrderItem record);
}