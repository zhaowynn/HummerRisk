package com.hummerrisk.base.mapper;

import com.hummerrisk.base.domain.TaskItemResource;
import com.hummerrisk.base.domain.TaskItemResourceExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

public interface TaskItemResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_item_resource
     *
     * @mbg.generated Wed Jul 13 17:40:49 CST 2022
     */
    long countByExample(TaskItemResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_item_resource
     *
     * @mbg.generated Wed Jul 13 17:40:49 CST 2022
     */
    int deleteByExample(TaskItemResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_item_resource
     *
     * @mbg.generated Wed Jul 13 17:40:49 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_item_resource
     *
     * @mbg.generated Wed Jul 13 17:40:49 CST 2022
     */
    int insert(TaskItemResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_item_resource
     * 插入数据时返回主键ID
     *
     * @mbg.generated Wed Jul 13 17:40:49 CST 2022
     */
    int insertSelective(TaskItemResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_item_resource
     *
     * @mbg.generated Wed Jul 13 17:40:49 CST 2022
     */
    List<TaskItemResource> selectByExample(TaskItemResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_item_resource
     *
     * @mbg.generated Wed Jul 13 17:40:49 CST 2022
     */
    TaskItemResource selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_item_resource
     *
     * @mbg.generated Wed Jul 13 17:40:49 CST 2022
     */
    int updateByExampleSelective(@Param("record") TaskItemResource record, @Param("example") TaskItemResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_item_resource
     *
     * @mbg.generated Wed Jul 13 17:40:49 CST 2022
     */
    int updateByExample(@Param("record") TaskItemResource record, @Param("example") TaskItemResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_item_resource
     *
     * @mbg.generated Wed Jul 13 17:40:49 CST 2022
     */
    int updateByPrimaryKeySelective(TaskItemResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_item_resource
     *
     * @mbg.generated Wed Jul 13 17:40:49 CST 2022
     */
    int updateByPrimaryKey(TaskItemResource record);
}
