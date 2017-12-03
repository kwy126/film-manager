package com.circle.vo;

import java.util.Date;

public class TeModule {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_module.moduleId
     *
     * @mbggenerated
     */
    private Long moduleid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_module.moduleName
     *
     * @mbggenerated
     */
    private String modulename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_module.moduleCode
     *
     * @mbggenerated
     */
    private String modulecode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_module.moduleSuperCode
     *
     * @mbggenerated
     */
    private String modulesupercode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_module.modulePage
     *
     * @mbggenerated
     */
    private String modulepage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_module.moduleLevel
     *
     * @mbggenerated
     */
    private Integer modulelevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_module.timestamp
     *
     * @mbggenerated
     */
    private Date timestamp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_module.moduleId
     *
     * @return the value of te_module.moduleId
     *
     * @mbggenerated
     */
    public Long getModuleid() {
        return moduleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_module.moduleId
     *
     * @param moduleid the value for te_module.moduleId
     *
     * @mbggenerated
     */
    public void setModuleid(Long moduleid) {
        this.moduleid = moduleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_module.moduleName
     *
     * @return the value of te_module.moduleName
     *
     * @mbggenerated
     */
    public String getModulename() {
        return modulename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_module.moduleName
     *
     * @param modulename the value for te_module.moduleName
     *
     * @mbggenerated
     */
    public void setModulename(String modulename) {
        this.modulename = modulename == null ? null : modulename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_module.moduleCode
     *
     * @return the value of te_module.moduleCode
     *
     * @mbggenerated
     */
    public String getModulecode() {
        return modulecode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_module.moduleCode
     *
     * @param modulecode the value for te_module.moduleCode
     *
     * @mbggenerated
     */
    public void setModulecode(String modulecode) {
        this.modulecode = modulecode == null ? null : modulecode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_module.moduleSuperCode
     *
     * @return the value of te_module.moduleSuperCode
     *
     * @mbggenerated
     */
    public String getModulesupercode() {
        return modulesupercode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_module.moduleSuperCode
     *
     * @param modulesupercode the value for te_module.moduleSuperCode
     *
     * @mbggenerated
     */
    public void setModulesupercode(String modulesupercode) {
        this.modulesupercode = modulesupercode == null ? null : modulesupercode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_module.modulePage
     *
     * @return the value of te_module.modulePage
     *
     * @mbggenerated
     */
    public String getModulepage() {
        return modulepage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_module.modulePage
     *
     * @param modulepage the value for te_module.modulePage
     *
     * @mbggenerated
     */
    public void setModulepage(String modulepage) {
        this.modulepage = modulepage == null ? null : modulepage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_module.moduleLevel
     *
     * @return the value of te_module.moduleLevel
     *
     * @mbggenerated
     */
    public Integer getModulelevel() {
        return modulelevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_module.moduleLevel
     *
     * @param modulelevel the value for te_module.moduleLevel
     *
     * @mbggenerated
     */
    public void setModulelevel(Integer modulelevel) {
        this.modulelevel = modulelevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_module.timestamp
     *
     * @return the value of te_module.timestamp
     *
     * @mbggenerated
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_module.timestamp
     *
     * @param timestamp the value for te_module.timestamp
     *
     * @mbggenerated
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}