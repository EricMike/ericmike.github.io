package com.hspedu.file.exercise;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReader_ {
    public static void main(String[] args) throws Exception {
        String filePath = "C:\\Users\\Eric小麦\\Desktop\\hello.txt";
        //创建BufferedReader对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //读取
        String Line;//按行读取，效率高
        //1.bufferedReader.readLine()按行读取文件
        //2.当返回
        while ((Line = bufferedReader.readLine())!=null){
            System.out.println(Line);
        }

        //关闭流,这里注意，只需要关闭 BufferedReader，因为底层会自动的去关闭 节点流FileReader
        bufferedReader.close();
    }
}
