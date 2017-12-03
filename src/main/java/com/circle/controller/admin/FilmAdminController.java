package com.circle.controller.admin;

import com.circle.controller.AbstractController;
import com.circle.service.IFilmService;
import com.circle.util.date.DateTimeUtil;
import com.circle.util.json.JsonReturn;
import com.circle.vo.FilmModel;
import com.circle.vo.LinkModel;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by keweiyang on 2017/11/14.
 */
@Controller
@RequestMapping(value="admin/film")
public class FilmAdminController extends AbstractController {

    private final static String FILEPATH = "";

    @Autowired
    private IFilmService filmService = null;


    @RequestMapping(value = "save")
    @ResponseBody
    public JsonReturn save(FilmModel filmModel ,@RequestParam("imageFile") MultipartFile file,HttpServletRequest request){

        if (request instanceof MultipartHttpServletRequest) {

            if (!file.isEmpty()) {
                //1. 首先判断文件后缀
                String originalFilename = file.getOriginalFilename();
                String prefix = null;
                int prefixIndex = originalFilename.lastIndexOf(".");
                if (prefixIndex != -1) {
                    prefix = originalFilename.substring(prefixIndex + 1);
                    prefix = prefix.toLowerCase();

                }

                String imageRoot = request.getSession().getServletContext().getRealPath("/")+"static/image";
                String renameImage = UUID.randomUUID().toString();
                // 可以使用日期作为文件夹的名字
                Date nowDate = new Date();
                String folderName = new SimpleDateFormat("yyyyMMdd").format(nowDate);
                File folderFile = new File(imageRoot + "/" + folderName);
                // 如果不存在这个目录则进行创建。
                // 为了保证高并发时不会重复创建目录，要进行线程锁定
                // 使用悲观锁就行了
                if (!folderFile.exists()) {
                    synchronized (FilmAdminController.class) {
                        while (!folderFile.exists()) {
                            folderFile.mkdirs();
                        }
                    }
                }


                // 以下就是这个即将创建的文件的完整路径了
                String relativePath = folderName + "/" + renameImage + "." + prefix;
                String fullImagePath = imageRoot + "/" + relativePath;

                try {
                    FileUtils.copyInputStreamToFile(file.getInputStream(), new File(fullImagePath));
                } catch (IOException e) {
                    e.printStackTrace();
                    return JsonReturn.buildFailure(e.getMessage());
                }
                filmModel.setImageName(request.getContextPath()+"/static/image/"+relativePath );

            }
        }
        else {
            System.out.println("123123123123=-----------------");
            // other logic
        }

        filmModel.setCreateTime(new Date());

        filmService.save(filmModel);
        return JsonReturn.buildSuccess("保存成功！");
    }

    @RequestMapping(value = "ckeditorUpload")
    @ResponseBody
    public String ckeditorUpload(@RequestParam("upload") MultipartFile file, String CKEditorFuncNum,HttpServletRequest request) {
        //1. 首先判断文件后缀
        String originalFilename = file.getOriginalFilename();
        String prefix = null;
        int prefixIndex = originalFilename.lastIndexOf(".");
        if (prefixIndex != -1) {
            prefix = originalFilename.substring(prefixIndex + 1);
            prefix = prefix.toLowerCase();

        }

        String imageRoot = request.getSession().getServletContext().getRealPath("/")+"static/image";
        String renameImage = UUID.randomUUID().toString();
        // 可以使用日期作为文件夹的名字
        Date nowDate = new Date();
        String folderName = new SimpleDateFormat("yyyyMMdd").format(nowDate);
        File folderFile = new File(imageRoot + "/" + folderName);
        // 如果不存在这个目录则进行创建。
        // 为了保证高并发时不会重复创建目录，要进行线程锁定
        // 使用悲观锁就行了
        if (!folderFile.exists()) {
            synchronized (FilmAdminController.class) {
                while (!folderFile.exists()) {
                    folderFile.mkdirs();
                }
            }
        }


        // 以下就是这个即将创建的文件的完整路径了
        String relativePath = folderName + "/" + renameImage + "." + prefix;
        String fullImagePath = imageRoot + "/" + relativePath;

        try {
            FileUtils.copyInputStreamToFile(file.getInputStream(), new File(fullImagePath));

        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuffer sb = new StringBuffer();
        sb.append("<script type=\"text/javascript\">");
        sb.append("window.parent.CKEDITOR.tools.callFunction(" + CKEditorFuncNum + ",'" +request.getContextPath()+"/static/image/"+relativePath  + "','')");
        sb.append("</script>");
        return sb.toString();
    }


    @ResponseBody
    @RequestMapping(value = "update")
    public JsonReturn update(FilmModel filmModel) {
        filmService.update(filmModel);
        return JsonReturn.buildSuccess("更新成功！");
    }

    @ResponseBody
    @RequestMapping(value = "deleteFilm")
    public JsonReturn deleteFilm(@RequestParam String  id) {
        return filmService.deleteFilm(Integer.valueOf(id));
    }

    @RequestMapping(value = "getFilmById")
    @ResponseBody
    public JsonReturn getFilmById(@RequestParam String id) {
        return filmService.getFilmById(Integer.valueOf(id));
    }


    @ResponseBody
    @RequestMapping(value = "findFilmList")
    public JsonReturn findFilmList(@RequestParam String search, @RequestParam int page, HttpServletRequest request) {
        return filmService.findFilmList(search, page, acctName(request));
    }

    @ResponseBody
    @RequestMapping(value = "findFilmPage")
    public JsonReturn findFilmPage(@RequestParam String search, @RequestParam int page, HttpServletRequest request) {
        return filmService.findFilmPage(search, page, acctName(request));
    }
}
