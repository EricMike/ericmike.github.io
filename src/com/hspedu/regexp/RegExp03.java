package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp03 {
    public static void main(String[] args) {
        String content = "a11c8abc ABC_  @";
        //String regStr = "[a-z]";//匹配 a-z之间任意一个字符
        //String regStr = "[A-Z]";//匹配 A-Z之间任意一个字符
        //String regStr = "abc";//匹配 adc字符串[默认区分大小写]
        //String regStr = "(?i)abc";//匹配 adc字符串[不区分大小写]
        //String regStr = "(?i)abc";//匹配 adc字符串[不区分大小写]
        //String regStr = "[0-9]";//匹配 0-9之间任意一个字符
        //String regStr = "[^a-z]{2}";//匹配不在a-z之间任意一个字符
        //String regStr = "[^0-9]{2}";//匹配不在0-9之间任意一个字符
        //String regStr = "[abcd]";//匹配在abcd之间任意一个字符
        //String regStr = "[\\D]";//匹配不在0-9之间任意一个字符
        //String regStr = "[\\w]";//匹配任意英文字符，数字和下划线
        //String regStr = "[\\W]";//匹配:等价于 [^a-zA-Z0-9_]
        //String regStr = "[\\s]";//匹配空白字符(空格、制表符)
        //String regStr = "[\\S]";//匹配非空白字符(空格、制表符)
        String regStr = ".";//匹配所有字符，除了\n


        //1. 当创建Pattern对象时，指定Pattern.CASE_INSENSITIVE，表示匹配是不区分字母大小写
        Pattern pattern = Pattern.compile(regStr,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()){
            System.out.println("找到："+matcher.group(0));
        }
    }
}
