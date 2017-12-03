package com.circle.vo;

import java.util.Date;

/**
 * Created by keweiyang on 2017/11/13.
 * 电影实体
 */
public class FilmModel {
    private int id;
    private String name;//电影名称
    private String title;//电影标题
    private String content;//内容
    private String imageName;//图片名称
    private int isHot;//是否是热门电影
    private Date createTime;//发布日期

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public int getIsHot() {
        return isHot;
    }

    public void setIsHot(int isHot) {
        this.isHot = isHot;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
