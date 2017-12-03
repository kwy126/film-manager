package com.circle.service;

import com.circle.util.json.JsonReturn;
import com.circle.vo.WebSiteInfoModel;


/**
 * Created by keweiyang on 2017/6/4.
 */
public interface IWebSiteInfoService extends IBaseService<WebSiteInfoModel> {


    JsonReturn findWebSiteInfoList(String search, int page, String s);

    JsonReturn findWebSiteInfoPage(String search, int page, String s);

    JsonReturn save(WebSiteInfoModel webSiteInfoModel);

    JsonReturn deleteWebSiteInfo(int id);

    JsonReturn getWebSiteInfoById(int id);



}
