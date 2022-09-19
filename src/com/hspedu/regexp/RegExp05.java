package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp05 {
    public static void main(String[] args) {
        String content = "1111111";
        //String regStr = "a{3}";
        String regStr = "1+";
        Pattern pattern = Pattern.compile(regStr, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("找到："+matcher.group(0));
        }
    }
}
