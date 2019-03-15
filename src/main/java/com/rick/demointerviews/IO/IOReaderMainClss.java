package com.rick.demointerviews.IO;

import java.io.*;

public class IOReaderMainClss {

    public static void main(String[] args) throws IOException {

        File file = new File("D:"+File.separator+"code"+File.separator+"stream.txt");
        Reader reader = new FileReader(file);

        char[] chars = new char[1024];
        int i = reader.read(chars);
        System.out.println("字符数: "+i);


        if (i == -1){
            System.out.println("文件中没有内容！！");
        }else {
            System.out.println(new String(chars,0,i));
        }

    }

}
