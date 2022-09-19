package com.hspedu.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        //完成文件拷贝，将C:\Users\Eric小麦\Desktop\hsp.png 拷贝到 C:\Users\Eric小麦\Desktop\demo02\a\b\c
        //思路分析
        //1. 创建的文件的输入流 将文件读入到程序
        //2. 创建文件的输出流 将读取到的文件数据，写入到指定的文件
        String filePath = "C:\\Users\\Eric小麦\\Desktop\\hsp.png";
        String srcFilePath = "C:\\Users\\Eric小麦\\Desktop\\demo02\\a\\b\\c\\hsp.png";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(filePath);
            fileOutputStream = new FileOutputStream(srcFilePath);
            //定义一个字节数组，提高读取效果
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = fileInputStream.read(buf)) != -1) {
                //读取到后就写入到文件 fileOutputStream
                fileOutputStream.write(buf, 0, readLen);//一定要使用这个方法
            }
            System.out.println("拷贝ok~");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOutputStream!=null){
                    fileOutputStream.close();
                }
                if (fileInputStream!=null){
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}