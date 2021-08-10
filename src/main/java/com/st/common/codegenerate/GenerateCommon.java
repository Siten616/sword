package com.st.common.codegenerate;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.ClasspathResourceLoader;

import java.io.*;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shent
 */
public class GenerateCommon {
    /**
     * 修改 BASE_NAME 来生成想要的文件名
     */
    final static String BASE_NAME = "Sys";
    final static String ROOT_PATH = "\\src\\main\\java\\com\\st";
    final static String BASE_NAME_U = BASE_NAME.toLowerCase().charAt(0) + BASE_NAME.substring(1);
    final static String SERVICE_TEMPLATE = "/ServiceTemplate.java";
    final static String SERVICEIMPL_TEMPLATE = "/ServiceImplTemplate.java";
    final static String CONTROLLER_TEMPLATE = "/ControllerTemplate.java";

    public static void main(String[] args) throws IOException {
        String s1 = getTemplate(SERVICE_TEMPLATE);
        String s2 = getTemplate(SERVICEIMPL_TEMPLATE);
        String s3 = getTemplate(CONTROLLER_TEMPLATE);
        String realPath = getRealPath();
        String p1 = realPath + ROOT_PATH + "\\service\\" + BASE_NAME + "Service.java";
        String p2 = realPath + ROOT_PATH + "\\service\\impl\\" + BASE_NAME + "ServiceImpl.java";
        String p3 = realPath + ROOT_PATH + "\\controller\\" + BASE_NAME + "Controller.java";
        List<FileCommon> files = new ArrayList<>();
        files.add(new FileCommon(s1, p1));
        files.add(new FileCommon(s2, p2));
        files.add(new FileCommon(s3, p3));
        //createFile(files);
    }

    private static String getTemplate(String str) throws IOException {
        ClasspathResourceLoader resourceLoader = new ClasspathResourceLoader("/template");
        Configuration cfg = Configuration.defaultConfiguration();
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
        Template t = gt.getTemplate(str);
        t.binding("baseName", BASE_NAME);
        if (!str.equals(SERVICE_TEMPLATE)) {
            t.binding("baseName_u", BASE_NAME_U);
        }
        return t.render();
    }

    private static void createFile(List<FileCommon> files) throws IOException {
        for (FileCommon file : files) {
            File newFile = new File(file.getPath());
            if (newFile.exists()) {
                System.out.println(file.getPath() + " 文件已存在!");
                //newFile.delete();文件存在则删除重新创建
                return;
            }
            newFile.createNewFile();
            FileWriter fileWriter = new FileWriter(newFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(file.getContent());
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        }
    }

    public static String getRealPath() throws UnsupportedEncodingException {
        String realPath = GenerateCommon.class.getClassLoader().getResource("").getFile();
        File file = new File(realPath);
        realPath = file.getParentFile().getParentFile().getAbsolutePath();
        realPath = URLDecoder.decode(realPath, "utf-8");
        return realPath;
    }

}
