package com.rick.demointerviews.IO;

import java.io.File;

public class IOTestMainClass {

    public static void main(String[] args) {

        String fileName = "D:"+ File.separator + "Code";
        File file = new File(fileName);

        if (file.exists() && file.isDirectory()){
            System.out.println(file.getPath()+"是一个文件夹\n");

            File[] files = file.listFiles();
            File subFile = files[0];
            System.out.println(subFile.getAbsolutePath());
            System.out.println(subFile.isDirectory()?"是一个文件夹":"不是一个文件夹");
            System.out.println(subFile.isFile()?"是一个文件":"不是一个文件");
            System.out.println(subFile.canExecute()?"可以执行":"不可以执行");
            System.out.println(subFile.canRead()?"可以读":"不可以读");
            System.out.println(subFile.canWrite()?"可以写":"不可以写");
        }
    }
}
