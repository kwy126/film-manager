package com.circle.dao;

import com.circle.vo.WebSiteInfo;
import com.circle.vo.WebSiteInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebSiteInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_site_info
     *
     * @mbggenerated
     */
    int countByExample(WebSiteInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_site_info
     *
     * @mbggenerated
     */
    int deleteByExample(WebSiteInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_site_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_site_info
     *
     * @mbggenerated
     */
    int insert(WebSiteInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_site_info
     *
     * @mbggenerated
     */
    int insertSelective(WebSiteInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_site_info
     *
     * @mbggenerated
     */
    List<WebSiteInfo> selectByExample(WebSiteInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_site_info
     *
     * @mbggenerated
     */
    WebSiteInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_site_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") WebSiteInfo record, @Param("example") WebSiteInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_site_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") WebSiteInfo record, @Param("example") WebSiteInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_site_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(WebSiteInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_site_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(WebSiteInfo record);
}