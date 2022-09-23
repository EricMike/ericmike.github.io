package com.hspedu.file.exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Eric小麦\\Desktop\\hello.txt";
        //创建BufferedWriter对象
        //1.new FileWriter(filePath,true)表示以追加的方式写入
        //1.new FileWriter(filePath)表示以覆盖的方式写入
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        bufferedWriter.write("hello,韩顺平教育！");
        bufferedWriter.newLine();//插入一个和系统相关的换行
        bufferedWriter.write("hello,韩顺平教育！");
        bufferedWriter.newLine();
        bufferedWriter.write("hello,韩顺平教育！");
        bufferedWriter.newLine();
        //插入一个换行

        //关闭外层流即可，传入的new FileWriter(filePath)，会在底层关闭
        bufferedWriter.close();
    }
}
