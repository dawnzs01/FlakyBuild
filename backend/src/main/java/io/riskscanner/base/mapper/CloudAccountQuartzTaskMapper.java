package io.riskscanner.base.mapper;

import io.riskscanner.base.domain.CloudAccountQuartzTask;
import io.riskscanner.base.domain.CloudAccountQuartzTaskExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CloudAccountQuartzTaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task
     *
     * @mbg.generated Tue Jun 15 10:42:15 CST 2021
     */
    long countByExample(CloudAccountQuartzTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task
     *
     * @mbg.generated Tue Jun 15 10:42:15 CST 2021
     */
    int deleteByExample(CloudAccountQuartzTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task
     *
     * @mbg.generated Tue Jun 15 10:42:15 CST 2021
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task
     *
     * @mbg.generated Tue Jun 15 10:42:15 CST 2021
     */
    int insert(CloudAccountQuartzTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task
     *
     * @mbg.generated Tue Jun 15 10:42:15 CST 2021
     */
    int insertSelective(CloudAccountQuartzTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task
     *
     * @mbg.generated Tue Jun 15 10:42:15 CST 2021
     */
    List<CloudAccountQuartzTask> selectByExample(CloudAccountQuartzTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task
     *
     * @mbg.generated Tue Jun 15 10:42:15 CST 2021
     */
    CloudAccountQuartzTask selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task
     *
     * @mbg.generated Tue Jun 15 10:42:15 CST 2021
     */
    int updateByExampleSelective(@Param("record") CloudAccountQuartzTask record, @Param("example") CloudAccountQuartzTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task
     *
     * @mbg.generated Tue Jun 15 10:42:15 CST 2021
     */
    int updateByExample(@Param("record") CloudAccountQuartzTask record, @Param("example") CloudAccountQuartzTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task
     *
     * @mbg.generated Tue Jun 15 10:42:15 CST 2021
     */
    int updateByPrimaryKeySelective(CloudAccountQuartzTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task
     *
     * @mbg.generated Tue Jun 15 10:42:15 CST 2021
     */
    int updateByPrimaryKey(CloudAccountQuartzTask record);
}