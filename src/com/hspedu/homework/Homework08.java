package com.hspedu.homework;

import java.util.ArrayList;
import java.util.HashMap;
@SuppressWarnings({"all"})
public class Homework08 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("我在响铃了...");
            }
        });

        String str = "abcdef";
        System.out.println("===交换前===");
        System.out.println(str);
        try {
            str = reverse(str, 0, 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("===交换后===");
        System.out.println(str);

        ArrayList arrayList = new ArrayList();
        arrayList.add("jacky");
        arrayList.add("tom");
        System.out.println(arrayList);

        HashMap hashMap = new HashMap();
        hashMap.put("NO1","上海");
        hashMap.put("NO2","北京");
        System.out.println(hashMap);
    }

    public static String reverse(String str, int start, int end) {


        //对输入的参数做一个验证
        if (!(str!=null&&start>=0&&end>start&&end<str.length())){
            throw new RuntimeException("参数不正确");
        }
        char[] chars = str.toCharArray();
        char temp = ' ';//交换辅助变量
        for (int i = start,j = end; i <j ; i++,j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        //使用chars重新构建一个String 返回即可
        return new String(chars);
    }
}

interface Bell {
    void ring();
}

class CellPhone {
    public void alarmClock(Bell bell) {
        bell.ring();
        System.out.println(bell.getClass());
    }
}