package com.circle.controller.admin;

import com.circle.controller.AbstractController;
import com.circle.service.IWebSiteInfoService;
import com.circle.util.json.JsonReturn;
import com.circle.vo.WebSiteInfoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;


/**
 * Created by keweiyang on 2017/11/14.
 */
@Controller
@RequestMapping(value="admin/web_site_info")
public class WebSiteInfoAdminController extends AbstractController {

    @Autowired
    private IWebSiteInfoService webSiteInfoService = null;


    @ResponseBody
    @RequestMapping(value = "findWebSiteInfoList")
    public JsonReturn findWebSiteInfoList(@RequestParam String search, @RequestParam int page, HttpServletRequest request) {
        return webSiteInfoService.findWebSiteInfoList(search, page, acctName(request));
    }

    @ResponseBody
    @RequestMapping(value = "findWebSiteInfoPage")
    public JsonReturn findWebSiteInfoPage(@RequestParam String search, @RequestParam int page, HttpServletRequest request) {
        return webSiteInfoService.findWebSiteInfoPage(search, page, acctName(request));
    }

    @ResponseBody
    @RequestMapping(value = "save")
    public JsonReturn save(WebSiteInfoModel webSiteInfoModel) {
        webSiteInfoModel.setCreateTime(new Date());
        return webSiteInfoService.save(webSiteInfoModel);
    }

    @ResponseBody
    @RequestMapping(value = "update")
    public JsonReturn update(WebSiteInfoModel webSiteInfoModel) {
        webSiteInfoService.update(webSiteInfoModel);
        return JsonReturn.buildSuccess("更新成功！");
    }

    @ResponseBody
    @RequestMapping(value = "deleteWebSiteInfo")
    public JsonReturn deleteWebSiteInfo(@RequestParam String  id) {
        return webSiteInfoService.deleteWebSiteInfo(Integer.valueOf(id));
    }

    @RequestMapping(value = "getWebSiteInfoById")
    @ResponseBody
    public JsonReturn getWebSiteInfoById(@RequestParam String id) {
        return webSiteInfoService.getWebSiteInfoById(Integer.valueOf(id));
    }

}
