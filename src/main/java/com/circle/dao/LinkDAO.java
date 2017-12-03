package com.circle.dao;


import com.circle.vo.LinkModel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by keweiyang on 2017/6/4.
 */
@Repository
public interface LinkDAO extends BaseDAO<LinkModel> {

    List<LinkModel> findLinkList(String search, int i, int defaultLine);

    int findLinkPage(String search);

    void save(LinkModel model);

    void deleteLink(int id);

    LinkModel getLinkById(int id);
}
