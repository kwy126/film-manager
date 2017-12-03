package com.circle.service;

import com.circle.constant.PageConstant;
import com.circle.dao.WebSiteDAO;
import com.circle.util.json.JsonReturn;
import com.circle.util.pageutil.PageUtils;
import com.circle.vo.WebSiteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by keweiyang on 2017/11/15.
 */
@Transactional
@Service
public class WebSiteServiceImpl extends BaseService<WebSiteModel> implements IWebSiteService {

    @Autowired
    private WebSiteDAO dao = null;

    public JsonReturn findWebSiteList(String search, int page, String s) {
        List<WebSiteModel> webSiteModelList = dao.findWebSiteList(search, (page - 1) * PageConstant.DEFAULT_LINE, PageConstant.DEFAULT_LINE);
        if (CollectionUtils.isEmpty(webSiteModelList)) {
            return JsonReturn.buildFailure("未获取相关数据！");
        }
        return JsonReturn.buildSuccess(webSiteModelList);
    }

    public JsonReturn findWebSitePage(String search, int page, String s) {
        int count = dao.findWebSitePage(search);
        return JsonReturn.buildSuccess(PageUtils.calculatePage(page,count,PageConstant.DEFAULT_LINE));
    }

    public JsonReturn save(WebSiteModel webSiteModel) {

        dao.save(webSiteModel);
        return JsonReturn.buildSuccess("保存成功！");
    }

    public JsonReturn deleteWebSite(int id) {
        dao.deleteWebSite(id);
        return JsonReturn.buildSuccess("删除成功！");
    }

    public JsonReturn getWebSiteById(int id) {
        return JsonReturn.buildSuccess(dao.getWebSiteById(id));
    }

    @Override
    public void update(WebSiteModel webSiteModel) {
        dao.update(webSiteModel);
    }
}
