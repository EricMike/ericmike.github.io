package com.hspedu.file.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        //C:\Users\Eric小麦\Desktop\hello.txt
        //1. 创建字符输入流 BufferedReader[处理流]
        //2. 使用BufferedReader对象读取hello.txt
        //3. 默认情况下，读取文件是按照utf-8编码
        String filePath = "C:\\Users\\Eric小麦\\Desktop\\hello.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String s = br.readLine();
        System.out.println("读取到的内容："+s);
        br.close();

    }
}
