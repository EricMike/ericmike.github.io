package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp11 {
    public static void main(String[] args) {

        String content = "https://search.bilibili.com/all?keyword=韩顺平&from_source=大力水手&spm_id_from=333.1007&search_source=5";
        String regStr = "^((http|https)://)([\\w-]+\\.)+[\\w-]+(\\/[\\w-?=&/%.#[\\u0391-\\uffe5]+]*)?$";//注意：[.]表示匹配就是.本身

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()){
            System.out.println("满足格式"+matcher.group(0));
        }else {
            System.out.println("不满足格式");
        }
    }
}
