package com.circle.vo;

public class WebSite {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column web_site.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column web_site.url
     *
     * @mbggenerated
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column web_site.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column web_site.id
     *
     * @return the value of web_site.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column web_site.id
     *
     * @param id the value for web_site.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column web_site.url
     *
     * @return the value of web_site.url
     *
     * @mbggenerated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column web_site.url
     *
     * @param url the value for web_site.url
     *
     * @mbggenerated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column web_site.name
     *
     * @return the value of web_site.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column web_site.name
     *
     * @param name the value for web_site.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}