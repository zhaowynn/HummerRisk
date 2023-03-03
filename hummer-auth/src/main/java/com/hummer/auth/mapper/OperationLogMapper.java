package com.hummer.auth.mapper;

import com.hummer.common.core.domain.OperationLog;
import com.hummer.common.core.domain.OperationLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OperationLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Mon Nov 28 00:41:09 CST 2022
     */
    long countByExample(OperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Mon Nov 28 00:41:09 CST 2022
     */
    int deleteByExample(OperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Mon Nov 28 00:41:09 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Mon Nov 28 00:41:09 CST 2022
     */
    int insert(OperationLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Mon Nov 28 00:41:09 CST 2022
     */
    int insertSelective(OperationLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Mon Nov 28 00:41:09 CST 2022
     */
    List<OperationLog> selectByExampleWithBLOBs(OperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Mon Nov 28 00:41:09 CST 2022
     */
    List<OperationLog> selectByExample(OperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Mon Nov 28 00:41:09 CST 2022
     */
    OperationLog selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Mon Nov 28 00:41:09 CST 2022
     */
    int updateByExampleSelective(@Param("record") OperationLog record, @Param("example") OperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Mon Nov 28 00:41:09 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") OperationLog record, @Param("example") OperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Mon Nov 28 00:41:09 CST 2022
     */
    int updateByExample(@Param("record") OperationLog record, @Param("example") OperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Mon Nov 28 00:41:09 CST 2022
     */
    int updateByPrimaryKeySelective(OperationLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Mon Nov 28 00:41:09 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(OperationLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Mon Nov 28 00:41:09 CST 2022
     */
    int updateByPrimaryKey(OperationLog record);
}
