package com.circle.service;

import com.circle.util.json.JsonReturn;
import com.circle.vo.FilmModel;

/**
 * Created by keweiyang on 2017/11/14.
 */
public interface IFilmService extends IBaseService<FilmModel>{

    public JsonReturn save(FilmModel filmModel);

    JsonReturn findFilmList(String search, int page, String s);

    JsonReturn findFilmPage(String search, int page, String s);


    JsonReturn deleteFilm(int id);

    JsonReturn getFilmById(int id);
}
