package com.circle.controller.admin;

import com.alibaba.fastjson.JSON;
import com.circle.controller.AbstractController;
import com.circle.service.ILinkService;
import com.circle.util.json.JsonReturn;
import com.circle.vo.LinkModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by keweiyang on 2017/11/14.
 */
@Controller
@RequestMapping(value="admin/link")
public class LinkAdminController extends AbstractController {

    @Autowired
    private ILinkService linkService = null;


    @ResponseBody
    @RequestMapping(value = "findLinkList")
    public JsonReturn findLinkList(@RequestParam String search, @RequestParam int page, HttpServletRequest request) {
        return linkService.findLinkList(search, page, acctName(request));
    }

    @ResponseBody
    @RequestMapping(value = "findLinkPage")
    public JsonReturn findLinkPage(@RequestParam String search, @RequestParam int page, HttpServletRequest request) {
        return linkService.findLinkPage(search, page, acctName(request));
    }

    @ResponseBody
    @RequestMapping(value = "save")
    public JsonReturn save(LinkModel linkModel) {
        return linkService.save(linkModel);
    }

    @ResponseBody
    @RequestMapping(value = "update")
    public JsonReturn update(LinkModel linkModel) {
        linkService.update(linkModel);
        return JsonReturn.buildSuccess("更新成功！");
    }

    @ResponseBody
    @RequestMapping(value = "deleteLink")
    public JsonReturn deleteLink(@RequestParam String  id) {
        return linkService.deleteLink(Integer.valueOf(id));
    }

    @RequestMapping(value = "getLinkById")
    @ResponseBody
    public JsonReturn getLinkById(@RequestParam String id) {
        return linkService.getLinkById(Integer.valueOf(id));
    }

}
