package com.hspedu.file;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile(){
        //创建 FileOutputStream对象
        String filePath = "C:\\Users\\Eric小麦\\Desktop\\hello.txt";
        FileOutputStream fileOutputStream = null;

        try {
            //得到FileOutputStream对象
            //老师说明
            //1. new FileOutputStream(filePath) 创建方式，当写入内容时，会覆盖原来的内容
            //2. new FileOutputStream(filePath,true) 创建方式,当写入内容时，是追加到文件后面
            fileOutputStream = new FileOutputStream(filePath,true);
            //写入一个字节
            //fileOutputStream.write('H');//char->int
            //写入字符串
            String str = "hsp.world";
            //str.getBytes()可以把字符串->字节数组
            //fileOutputStream.write(str.getBytes());
            fileOutputStream.write(str.getBytes(),0,3);




        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
