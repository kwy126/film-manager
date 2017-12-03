package com.circle.service;

import com.circle.constant.PageConstant;
import com.circle.dao.FilmDAO;
import com.circle.util.json.JsonReturn;
import com.circle.util.pageutil.PageUtils;
import com.circle.vo.FilmModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by keweiyang on 2017/11/14.
 */
@Service
@Transactional
public class FilmServiceImpl extends BaseService<FilmModel> implements IFilmService {

    @Autowired
    private FilmDAO filmDAO = null;

    public JsonReturn save(FilmModel filmModel) {
        filmDAO.save(filmModel);
        return JsonReturn.buildSuccess("保存成功！");
    }


    public JsonReturn findFilmList(String search, int page, String s) {
        List<FilmModel> filmModelList = filmDAO.findFilmList(search, (page - 1) * PageConstant.DEFAULT_LINE, PageConstant.DEFAULT_LINE);
        if (CollectionUtils.isEmpty(filmModelList)) {
            return JsonReturn.buildFailure("未获取相关数据！");
        }
        return JsonReturn.buildSuccess(filmModelList);
    }

    public JsonReturn findFilmPage(String search, int page, String s) {
        int count = filmDAO.findFilmPage(search);
        return JsonReturn.buildSuccess(PageUtils.calculatePage(page,count,PageConstant.DEFAULT_LINE));
    }



    public JsonReturn deleteFilm(int id) {
        filmDAO.deleteFilm(id);
        return JsonReturn.buildSuccess("删除成功！");
    }

    public JsonReturn getFilmById(int id) {
        return JsonReturn.buildSuccess(filmDAO.getFilmById(id));
    }

    @Override
    public void update(FilmModel filmModel) {
        filmDAO.update(filmModel);
    }

}
