package com.hspedu.file.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) throws IOException {

        //PrintWriter printWriter = new PrintWriter(System.out);
        PrintWriter printWriter = new PrintWriter(new FileWriter("C:\\Users\\Eric小麦\\Desktop\\hello.txt"));
        printWriter.print("hi,北京你好~");
        printWriter.close();

    }
}
