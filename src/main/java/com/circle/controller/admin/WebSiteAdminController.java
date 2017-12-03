package com.circle.controller.admin;

import com.circle.controller.AbstractController;
import com.circle.service.IWebSiteService;
import com.circle.util.json.JsonReturn;
import com.circle.vo.WebSiteModel;
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
@RequestMapping(value="admin/web_site")
public class WebSiteAdminController extends AbstractController {

    @Autowired
    private IWebSiteService webSiteService = null;


    @ResponseBody
    @RequestMapping(value = "findWebSiteList")
    public JsonReturn findWebSiteList(@RequestParam String search, @RequestParam int page, HttpServletRequest request) {
        return webSiteService.findWebSiteList(search, page, acctName(request));
    }

    @ResponseBody
    @RequestMapping(value = "findWebSitePage")
    public JsonReturn findWebSitePage(@RequestParam String search, @RequestParam int page, HttpServletRequest request) {
        return webSiteService.findWebSitePage(search, page, acctName(request));
    }

    @ResponseBody
    @RequestMapping(value = "save")
    public JsonReturn save(WebSiteModel webSiteModel) {
        return webSiteService.save(webSiteModel);
    }

    @ResponseBody
    @RequestMapping(value = "update")
    public JsonReturn update(WebSiteModel webSiteModel) {
        webSiteService.update(webSiteModel);
        return JsonReturn.buildSuccess("更新成功！");
    }

    @ResponseBody
    @RequestMapping(value = "deleteWebSite")
    public JsonReturn deleteWebSite(@RequestParam String  id) {
        return webSiteService.deleteWebSite(Integer.valueOf(id));
    }

    @RequestMapping(value = "getWebSiteById")
    @ResponseBody
    public JsonReturn getWebSiteById(@RequestParam String id) {
        return webSiteService.getWebSiteById(Integer.valueOf(id));
    }

}
