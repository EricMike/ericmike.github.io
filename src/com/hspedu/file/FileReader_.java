package com.hspedu.file;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01(){
        String filePath = "C:\\Users\\Eric小麦\\Desktop\\hello.txt";
        FileReader fileReader = null;
        int data = 0;
        //1. 创建FileReader对象
        try {
            fileReader = new FileReader(filePath);
            //循环读取 使用read,单个字符读取
            while ((data = fileReader.read())!=-1){
                System.out.print((char) data);
            }

        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader!=null){
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Test
    public void readFile02(){
        String filePath = "C:\\Users\\Eric小麦\\Desktop\\hello.txt";
        FileReader fileReader = null;
        int readLen = 0;
        char[] buf= new char[8];


        //1. 创建FileReader对象
        try {
            fileReader = new FileReader(filePath);
            //循环读取 使用read(buf),返回的是实际读取到的字符数
            //如果返回-1,说明到文件结束
            while ((readLen = fileReader.read(buf))!=-1){
                System.out.print(new String(buf,0,readLen));
            }

        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader!=null){
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}