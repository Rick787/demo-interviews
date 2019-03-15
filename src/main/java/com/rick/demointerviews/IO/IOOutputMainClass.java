package com.rick.demointerviews.IO;

import java.io.*;

public class IOOutputMainClass {

    public static void main(String[] args) throws IOException {

        File file = new File("D:\\Code\\stream.txt");
        OutputStream outputStream = new FileOutputStream(file);
        byte[] bytes = "Hello World世界!!".getBytes();
        outputStream.write(bytes);
    }
}
