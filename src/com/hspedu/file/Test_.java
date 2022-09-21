package com.hspedu.file;

public class Test_ {
    public static void main(String[] args) {

        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader01_());
        bufferedReader_.readFiles(10);

        //这次希望通过 BufferedReader_ 多次读取字符串
        BufferedReader_ bufferedReader_1 = new BufferedReader_(new StringReader_());
        bufferedReader_1.readStrings(10);
    }
}
