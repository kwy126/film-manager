package com.circle.dao;

import com.circle.vo.WebSiteInfoModel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by keweiyang on 2017/6/4.
 */
@Repository
public interface WebSiteInfoDAO extends BaseDAO<WebSiteInfoModel> {

    List<WebSiteInfoModel> findWebSiteInfoList(String search, int i, int defaultLine);

    int findWebSiteInfoPage(String search);

    void save(WebSiteInfoModel model);

    void deleteWebSiteInfo(int id);

    WebSiteInfoModel getWebSiteInfoById(int id);

}
