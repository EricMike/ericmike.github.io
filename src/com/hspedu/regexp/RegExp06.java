package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp06 {
    public static void main(String[] args) {

        //tring content = "123-abc";
        String content = "hanshunping sphan nnhan";
        //String regStr = "^[0-9]+[a-z]*";
        //String regStr = "^[0-9]+-[a-z]+$";
        //表示匹配边界的han[这里的边界是指：被匹配的字符串最后，也可以是空格的子字符串的后面]
        //String regStr = "han\\b";
        //和\\b的含义刚刚相反
        String regStr = "han\\B";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("找到："+matcher.group(0));
        }
    }
}
