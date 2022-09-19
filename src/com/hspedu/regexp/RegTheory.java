package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTheory {
    public static void main(String[] args) {
        String content = "1998年12月8日，第二代Java平台的企业版J2EE发布。" +
                "1999年6月，Sun公司发布了第二代Java平台（简称为Java2）的3个版" +
                "本：J2ME（Java2 Micro Edition，Java2平台的微型版），应用于" +
                "移动、无线及有限资源的环境；J2SE（Java 2 Standard Edition" +
                "，Java 2平台的标准版），应用于桌面环境；J2EE（Java 2Enterpr" +
                "ise Edition，Java 2平台的企业版），应用3443于基于Java的应用服务" +
                "器。Java 2平台的发布，是Java发展过程中最重要的一个里程碑，标志着Java的应用开始普及9889。";

        //目标: 匹配所有四个数字
        //1. \\d 表示一个任意的数字
        String regStr = "\\d\\d\\d\\d";
        //2. 创建模式对象[正则表达式对象]
        Pattern pattern = Pattern.compile(regStr);
        //3. 创建匹配器
        //创建匹配器matcher,按照正则表达式的规则 去匹配 content字符串
        Matcher matcher = pattern.matcher(content);

        //4. 开始匹配
        while (matcher.find()){
            System.out.println("找到："+matcher.group(0));
        }
    }

}
