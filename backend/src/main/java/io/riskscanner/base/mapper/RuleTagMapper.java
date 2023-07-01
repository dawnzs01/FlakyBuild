package io.riskscanner.base.mapper;

import io.riskscanner.base.domain.RuleTag;
import io.riskscanner.base.domain.RuleTagExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RuleTagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_tag
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    long countByExample(RuleTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_tag
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int deleteByExample(RuleTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_tag
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int deleteByPrimaryKey(String tagKey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_tag
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int insert(RuleTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_tag
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int insertSelective(RuleTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_tag
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    List<RuleTag> selectByExample(RuleTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_tag
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    RuleTag selectByPrimaryKey(String tagKey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_tag
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int updateByExampleSelective(@Param("record") RuleTag record, @Param("example") RuleTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_tag
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int updateByExample(@Param("record") RuleTag record, @Param("example") RuleTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_tag
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int updateByPrimaryKeySelective(RuleTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_tag
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int updateByPrimaryKey(RuleTag record);
}