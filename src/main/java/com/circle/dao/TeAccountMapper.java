package com.circle.dao;

import com.circle.vo.TeAccount;
import com.circle.vo.TeAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_account
     *
     * @mbggenerated
     */
    int countByExample(TeAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_account
     *
     * @mbggenerated
     */
    int deleteByExample(TeAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_account
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long acctid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_account
     *
     * @mbggenerated
     */
    int insert(TeAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_account
     *
     * @mbggenerated
     */
    int insertSelective(TeAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_account
     *
     * @mbggenerated
     */
    List<TeAccount> selectByExample(TeAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_account
     *
     * @mbggenerated
     */
    TeAccount selectByPrimaryKey(Long acctid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_account
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TeAccount record, @Param("example") TeAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_account
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TeAccount record, @Param("example") TeAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_account
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TeAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_account
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TeAccount record);
}