package com.circle.dao;

import com.circle.vo.WebSiteModel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by keweiyang on 2017/6/4.
 */
@Repository
public interface WebSiteDAO extends BaseDAO<WebSiteModel> {

    List<WebSiteModel> findWebSiteList(String search, int i, int defaultLine);

    int findWebSitePage(String search);

    void save(WebSiteModel model);

    void deleteWebSite(int id);

    WebSiteModel getWebSiteById(int id);
}
