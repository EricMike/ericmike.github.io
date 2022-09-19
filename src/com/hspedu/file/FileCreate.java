package com.hspedu.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * 演示创建文件
 */
public class FileCreate {
    public static void main(String[] args) {

    }

    //方式1. new File(String pathname)
    @Test
    public void create01(){
        String filePath = "C:\\Users\\Eric小麦\\Desktop\\news1.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式2. new File(File parent,String child)//根据父目录文件+子路径构建
    @Test
    public void create02(){
        File parentFile = new File("C:\\Users\\Eric小麦\\Desktop\\");
        String fileName = "news2.txt";
        //这里的file对象，在Java程序中（内存），只是一个对象
        //只有执行了createNewFile方法，才会真正的，在磁盘创建该文件
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式3 new File(String parent,String child) //根据父目录+子路径构建
    @Test
    public void create03(){
        String parentPath = "C:/Users/Eric小麦/Desktop/";
        String filePath = "news.txt";
        File file = new File(parentPath, filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
