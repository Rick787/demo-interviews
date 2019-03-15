package com.rick.demointerviews.IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOInputMainClass {

    public static void main(String[] args) throws IOException {

        File file = new File("D:\\Code\\stream.txt");
        InputStream inputStream = new FileInputStream(file);

        InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"GBK");
        BufferedReader bufferedreader = new BufferedReader(inputStreamReader);
        String line = null;
        List list = new ArrayList<>();
        while ((line = bufferedreader.readLine()) != null){
            list.add(line);
        }

        bufferedreader.close();
        System.out.println(list);

    }
}
