package com.hspedu.file.exercise;

import java.io.*;

public class BufferedCopy_ {
    public static void main(String[] args) {

        //1. bufferedReader和bufferedWriter是按照字符操作
        //2. 不要去操作二进制文件，可能造成文件损坏
        
        String srcFilePath = "C:\\Users\\Eric小麦\\Desktop\\hello.txt";
        String destFilePath = "C:\\Users\\Eric小麦\\Desktop\\hello1.txt";
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        String line;
        try {
            bufferedReader = new BufferedReader(new FileReader(srcFilePath));
            bufferedWriter = new BufferedWriter(new FileWriter(destFilePath));

            //readLine 读取一行内容，但是没有换行
            while ((line = bufferedReader.readLine())!=null){
                //每读取一行，就写入
                bufferedWriter.write(line);
                //插入一个换行
                bufferedWriter.newLine();
            }
            System.out.println("拷贝完毕");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if (bufferedReader!=null){
                    bufferedReader.close();
                }
                if (bufferedWriter!=null){
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
