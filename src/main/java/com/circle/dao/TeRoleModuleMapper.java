package com.circle.dao;

import com.circle.vo.TeRoleModule;
import com.circle.vo.TeRoleModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeRoleModuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_role_module
     *
     * @mbggenerated
     */
    int countByExample(TeRoleModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_role_module
     *
     * @mbggenerated
     */
    int deleteByExample(TeRoleModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_role_module
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_role_module
     *
     * @mbggenerated
     */
    int insert(TeRoleModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_role_module
     *
     * @mbggenerated
     */
    int insertSelective(TeRoleModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_role_module
     *
     * @mbggenerated
     */
    List<TeRoleModule> selectByExample(TeRoleModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_role_module
     *
     * @mbggenerated
     */
    TeRoleModule selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_role_module
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TeRoleModule record, @Param("example") TeRoleModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_role_module
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TeRoleModule record, @Param("example") TeRoleModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_role_module
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TeRoleModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_role_module
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TeRoleModule record);
}