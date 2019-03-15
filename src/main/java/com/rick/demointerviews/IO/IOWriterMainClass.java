package com.rick.demointerviews.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOWriterMainClass {


    public static void main(String[] args) throws IOException {

         File file = new File("D:\\Code\\stream.txt");
         Writer fileWriter = new FileWriter(file);

         fileWriter.append("hahaha");
         fileWriter.flush();
    }
}
