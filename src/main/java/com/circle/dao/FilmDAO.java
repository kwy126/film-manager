package com.circle.dao;
import com.circle.vo.FilmModel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by keweiyang on 2017/6/4.
 */
@Repository
public interface FilmDAO extends BaseDAO<FilmModel> {

    public void save(FilmModel filmModel);

    List<FilmModel> findFilmList(String search, int i, int defaultLine);

    int findFilmPage(String search);

    void deleteFilm(int id);

    FilmModel getFilmById(int id);
}
