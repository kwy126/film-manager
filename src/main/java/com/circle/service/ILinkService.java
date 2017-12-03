package com.circle.service;

import com.circle.util.json.JsonReturn;
import com.circle.vo.LinkModel;


import javax.servlet.http.HttpServletRequest;


/**
 * Created by keweiyang on 2017/6/4.
 */
public interface ILinkService extends IBaseService<LinkModel> {


    JsonReturn findLinkList(String search, int page, String s);

    JsonReturn findLinkPage(String search, int page, String s);

    JsonReturn save(LinkModel linkModel);

    JsonReturn deleteLink(int id);

    JsonReturn getLinkById(int id);



}
