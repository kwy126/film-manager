package com.circle.dao;

import com.circle.vo.TeModule;
import com.circle.vo.TeModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeModuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_module
     *
     * @mbggenerated
     */
    int countByExample(TeModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_module
     *
     * @mbggenerated
     */
    int deleteByExample(TeModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_module
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long moduleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_module
     *
     * @mbggenerated
     */
    int insert(TeModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_module
     *
     * @mbggenerated
     */
    int insertSelective(TeModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_module
     *
     * @mbggenerated
     */
    List<TeModule> selectByExample(TeModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_module
     *
     * @mbggenerated
     */
    TeModule selectByPrimaryKey(Long moduleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_module
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TeModule record, @Param("example") TeModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_module
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TeModule record, @Param("example") TeModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_module
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TeModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_module
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TeModule record);
}