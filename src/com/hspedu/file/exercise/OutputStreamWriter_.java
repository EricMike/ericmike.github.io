package com.hspedu.file.exercise;

import java.io.*;

public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Eric小麦\\Desktop\\hello.txt";
        String charSet = "utf8";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), charSet);
        osw.write("hi,韩顺平教育");
        osw.close();
        System.out.println("按照"+charSet+"保存文件成功~");
    }
}
