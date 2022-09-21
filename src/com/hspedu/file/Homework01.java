package com.hspedu.file;

public class Homework01 {
    public static void main(String[] args) {
        String content = "hsp@shu.com.org";
        String regStr = "^[\\w-]+@([a-zA-Z]+\\.)+[a-zA-Z]+$";

        //1.String的matches是整体匹配
        if(content.matches(regStr)){
            System.out.println("匹配成功");
        }else {
            System.out.println("匹配失败");
        }
    }

}
