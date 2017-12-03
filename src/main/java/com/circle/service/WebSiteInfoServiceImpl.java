package com.circle.service;

import com.circle.constant.PageConstant;
import com.circle.dao.WebSiteInfoDAO;
import com.circle.util.json.JsonReturn;
import com.circle.util.pageutil.PageUtils;
import com.circle.vo.WebSiteInfoModel;
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
public class WebSiteInfoServiceImpl extends BaseService<WebSiteInfoModel> implements IWebSiteInfoService {

    @Autowired
    private WebSiteInfoDAO dao = null;

    public JsonReturn findWebSiteInfoList(String search, int page, String s) {
        List<WebSiteInfoModel> webSiteInfoModelList = dao.findWebSiteInfoList(search, (page - 1) * PageConstant.DEFAULT_LINE, PageConstant.DEFAULT_LINE);
        if (CollectionUtils.isEmpty(webSiteInfoModelList)) {
            return JsonReturn.buildFailure("未获取相关数据！");
        }
        return JsonReturn.buildSuccess(webSiteInfoModelList);
    }

    public JsonReturn findWebSiteInfoPage(String search, int page, String s) {
        int count = dao.findWebSiteInfoPage(search);
        return JsonReturn.buildSuccess(PageUtils.calculatePage(page,count,PageConstant.DEFAULT_LINE));
    }

    public JsonReturn save(WebSiteInfoModel webSiteInfoModel) {

        dao.save(webSiteInfoModel);
        return JsonReturn.buildSuccess("保存成功！");
    }

    public JsonReturn deleteWebSiteInfo(int id) {
        dao.deleteWebSiteInfo(id);
        return JsonReturn.buildSuccess("删除成功！");
    }

    public JsonReturn getWebSiteInfoById(int id) {
        return JsonReturn.buildSuccess(dao.getWebSiteInfoById(id));
    }

    @Override
    public void update(WebSiteInfoModel webSiteInfoModel) {
        dao.update(webSiteInfoModel);
    }
}
