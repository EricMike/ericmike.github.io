package com.hspedu.file;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01(){
        String filePath = "C:\\Users\\Eric小麦\\Desktop\\hello.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建FileInputStream对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);
            while ((readData = fileInputStream.read())!=-1){
                System.out.print((char) readData);//转成char显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void readFile02(){
        String filePath = "C:\\Users\\Eric小麦\\Desktop\\hello.txt";
        //字节数组
        byte[] buf = new byte[8];//一次读取8个字节
        int readLen = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建FileInputStream对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);
            while ((readLen = fileInputStream.read(buf))!=-1){
                System.out.print(new String(buf,0,readLen));//构建字符串显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
