package com.circle.vo;

import java.util.Date;
import java.util.List;

/**
 * Created by keweiyang on 2017/11/13.
 */
public class WebSiteInfoModel {
    private int id;
    private String info;
    private String url;
    private Date createTime;

    private FilmModel film;
    private WebSiteModel webSiteModel;

    public FilmModel getFilm() {
        return film;
    }

    public void setFilm(FilmModel film) {
        this.film = film;
    }

    public WebSiteModel getWebSiteModel() {
        return webSiteModel;
    }

    public void setWebSiteModel(WebSiteModel webSiteModel) {
        this.webSiteModel = webSiteModel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
