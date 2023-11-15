package com.qingchen.file;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author qingchen
 * @date 14/8/2023 上午 9:25
 */

public class FileUtils {
    public static String uploadToLocal(MultipartFile file){
        // 获取文件原本的名字
        String originName = file.getOriginalFilename();
        // 取出文件的后缀
        int count = originName.lastIndexOf(".");
        String endName = originName.substring(count); //取出文件类型
        String fileType = originName.substring(count + 1); //文件类型

        System.out.println("file type : " + endName);
        System.out.println("file type : " + fileType);
        // 创建保存路径
        //日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String format = sdf.format(new Date());
        String savePath = System.getProperty("user.dir") + "\\" + "files" +   "\\" + fileType + "\\" + format;
        // 保存文件的文件夹
        File folder = new File(savePath);
        // 判断路径是否存在,不存在则自动创建
        if(!folder.exists()){
            folder.mkdirs();
        }
        Date now = new Date();
        String saveName = now.getTime() + originName;
        try {
            file.transferTo(new File(folder,saveName));
            String filePath = savePath + "\\" + saveName;
            System.out.println("filePath : " + filePath);
            return new String("文件路径为:" + filePath);
        } catch (Exception e){
            return new String(e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
//        File file = new File("C:\\Users\\pc\\Desktop\\PL.AN.md");
//        FileInputStream fileInputStream = new FileInputStream(file);
//        MultipartFile multipartFile = new MultipartFileDto(file.getName(),file.getName(), null, fileInputStream);
//        uploadToLocal( multipartFile);

        Resource[] resources = new PathMatchingResourcePatternResolver().getResources("classpath:/**/*.properties");
        System.out.println(resources.length);
    }

}
