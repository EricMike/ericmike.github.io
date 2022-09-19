package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp_ {
    public static void main(String[] args) {
        //假定，编写了爬虫，从百度页面得到如下文本
        /*String content = "1995年，互联网的蓬勃发展给了Oak机会。业界为了使死板、单调的" +
                "静态网页能够“灵活”起来，急需一种软件技术来开发一种程序，这种程序可以通过" +
                "网络传播并且能够跨平台运行。于是，世界各大IT企业为此纷纷投入了大量的人力、" +
                "物力和财力。这个时候，Sun公司想起了那个被搁置起来很久的Oak，并且重新审视了" +
                "那个用软件编写的试验平台，由于它是按照嵌入式系统硬件平台体系结构进行编写的" +
                "，所以非常小，特别适用于网络上的传输系统，而Oak也是一种精简的语言，程序非常" +
                "小，适合在网络上传输。Sun公司首先推出了可以嵌入网页并且可以随同网页在网络上" +
                "传输的Applet（Applet是一种将小程序嵌入到网页中进行执行的技术），并将Oak更" +
                "名为Java。5月23日，Sun公司在Sun world会议上正式发布Java和HotJava浏览器" +
                "。IBM、Apple、DEC、Adobe、HP、Oracle、Netscape和微软等各大公司都纷纷停" +
                "止了自己的相关开发项目，竞相购买了Java使用许可证，并为自己的产品开发了相应的Java平台。";*/
        String content = "<div class=\"header-wrapper pc-header-new\">\n" +
                "<div style=\"display:none;\" id=\"J-vars\" data-lemmaid=\"85979\" data-lemmatitle=\"Java\" data-lemmacategory=\"normal\" data-tk=\"9bd703ffdc9e1f0a0a6b05f44f41edd1\"></div>\n" +
                "<div class=\"topbar cmn-clearfix\">\n" +
                "<ul class=\"wgt-userbar wgt-userbar-n\" id=\"j-wgt-userbar\">\n" +
                "<li>\n" +
                "<a href=\"http://www.baidu.com/\">百度首页</a>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<div class=\"separator\"></div>\n" +
                "<div class=\"wiki-common-headTabBar\">\n" +
                "<a href=\"https://www.baidu.com/\" nslog=\"normal\" nslog-type=\"10600112\" data-href=\"https://www.baidu.com/s?ie=utf-8&fr=bks0000&wd=\">网页</a>\n" +
                "<a href=\"http://news.baidu.com/\" nslog=\"normal\" nslog-type=\"10600112\" data-href=\"http://news.baidu.com/ns?tn=news&cl=2&rn=20&ct=1&fr=bks0000&ie=utf-8&word=\">新闻</a>\n" +
                "<a href=\"https://tieba.baidu.com/\" nslog=\"normal\" nslog-type=\"10600112\" data-href=\"https://tieba.baidu.com/f?ie=utf-8&fr=bks0000&kw=\">贴吧</a>\n" +
                "<a href=\"https://zhidao.baidu.com/\" nslog=\"normal\" nslog-type=\"10600112\" data-href=\"https://zhidao.baidu.com/search?pn=0&&rn=10&lm=0&fr=bks0000&word=\">知道</a>\n" +
                "<a href=\"https://pan.baidu.com?from=1027327l\" nslog=\"normal\" nslog-type=\"10600112\" data-href=\"https://pan.baidu.com/disk/home#/search?from=1027327l&key=\">网盘</a>\n" +
                "<a href=\"http://image.baidu.com/\" nslog=\"normal\" nslog-type=\"10600112\" data-href=\"http://image.baidu.com/search/index?tn=baiduimage&ct=201326592&lm=-1&cl=2&nc=1&ie=utf-8&word=\">图片</a>\n" +
                "<a href=\"http://v.baidu.com/\" nslog=\"normal\" nslog-type=\"10600112\" data-href=\"https://www.baidu.com/sf/vsearch?pd=video&tn=vsearch&ie=utf-8&rsv_spt=17&wd=\">视频</a>\n" +
                "<a href=\"http://map.baidu.com/\" nslog=\"normal\" nslog-type=\"10600112\" data-href=\"http://map.baidu.com/m?ie=utf-8&fr=bks0000&word=\">地图</a>\n" +
                "<a href=\"https://wenku.baidu.com/\" nslog=\"normal\" nslog-type=\"10600112\" data-href=\"https://wenku.baidu.com/search?lm=0&od=0&ie=utf-8&fr=bks0000&word=\">文库</a>\n" +
                "<b class=\"baike\">百科</b>\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"header\">\n" +
                "<div class=\"layout\">\n" +
                "<div class=\"wgt-searchbar wgt-searchbar-new wgt-searchbar-main cmn-clearfix wgt-searchbar-large\">\n" +
                "<div class=\"logo-container\">\n" +
                "<a class=\"logo cmn-inline-block\" title=\"到百科首页\" href=\"/\">\n" +
                "<span class=\"cmn-baike-logo\">\n" +
                "<em class=\"cmn-icon cmn-icons cmn-icons_logo-bai\"></em>\n" +
                "<em class=\"cmn-icon cmn-icons cmn-icons_logo-du\"></em>\n" +
                "<em class=\"cmn-icon cmn-icons cmn-icons_logo-baike\"></em>\n" +
                "</span>\n" +
                "</a>\n" +
                "</div>";

        //提取文章中所有的英文单词
        //1. 传统方法，使用遍历方式，代码量大，效率不高
        //2. 正则表达式技术


        //1. 先创建一个Pattern对象，模式对象，可以理解成就是一个正则表达式对象
        //Pattern pattern = Pattern.compile("[a-zA-Z]+");
        //Pattern pattern = Pattern.compile("[0-9]+");
        //Pattern pattern = Pattern.compile("([0-9]+)|([a-zA-Z]+)");
        Pattern pattern = Pattern.compile("<a class=\"logo cmn-inline-block\" title=\"(\\S*)\"");
        //2. 创建一个匹配器对象
        //理解：就是matcher匹配器按照pattern（模式/样式），到content文本中去匹配
        //找到就返回true，否则就返回false
        Matcher matcher = pattern.matcher(content);
        //3. 可以开始循环匹配
        while (matcher.find()){
            //匹配内容，文本，放到m.group(0)
            System.out.println("找到："+matcher.group(1));
        }
    }
}
