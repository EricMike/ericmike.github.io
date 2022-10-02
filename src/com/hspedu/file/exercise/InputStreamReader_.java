package com.hspedu.file.exercise;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_ {

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Eric小麦\\Desktop\\hello.txt";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "gbk");
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        System.out.println("读取内容="+s);
        br.close();
    }
}
