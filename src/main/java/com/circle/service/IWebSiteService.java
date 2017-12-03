package com.circle.service;

import com.circle.util.json.JsonReturn;
import com.circle.vo.WebSiteModel;


/**
 * Created by keweiyang on 2017/6/4.
 */
public interface IWebSiteService extends IBaseService<WebSiteModel> {


    JsonReturn findWebSiteList(String search, int page, String s);

    JsonReturn findWebSitePage(String search, int page, String s);

    JsonReturn save(WebSiteModel webSiteModel);

    JsonReturn deleteWebSite(int id);

    JsonReturn getWebSiteById(int id);



}
