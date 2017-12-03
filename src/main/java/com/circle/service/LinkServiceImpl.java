package com.circle.service;

import com.circle.constant.PageConstant;
import com.circle.dao.LinkDAO;
import com.circle.util.json.JsonReturn;
import com.circle.util.pageutil.PageUtils;
import com.circle.vo.LinkModel;
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
public class LinkServiceImpl extends BaseService<LinkModel> implements ILinkService {

    @Autowired
    private LinkDAO dao = null;

    public JsonReturn findLinkList(String search, int page, String s) {
        List<LinkModel> linkModelList = dao.findLinkList(search, (page - 1) * PageConstant.DEFAULT_LINE, PageConstant.DEFAULT_LINE);
        if (CollectionUtils.isEmpty(linkModelList)) {
            return JsonReturn.buildFailure("未获取相关数据！");
        }
        return JsonReturn.buildSuccess(linkModelList);
    }

    public JsonReturn findLinkPage(String search, int page, String s) {
        int count = dao.findLinkPage(search);
        return JsonReturn.buildSuccess(PageUtils.calculatePage(page,count,PageConstant.DEFAULT_LINE));
    }

    public JsonReturn save(LinkModel linkModel) {

        dao.save(linkModel);
        return JsonReturn.buildSuccess("保存成功！");
    }

    public JsonReturn deleteLink(int id) {
        dao.deleteLink(id);
        return JsonReturn.buildSuccess("删除成功！");
    }

    public JsonReturn getLinkById(int id) {
        return JsonReturn.buildSuccess(dao.getLinkById(id));
    }

    @Override
    public void update(LinkModel linkModel) {
        dao.update(linkModel);
    }
}
