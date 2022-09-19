package com.hspedu.homework;

import java.util.*;

/**
 * @author jacky
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework03 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("jack",650);//int->Integer 自动装箱
        map.put("tom",1200);//int->Integer 自动装箱
        map.put("simth",2900);//int->Integer 自动装箱
        System.out.println(map);

        map.put("jack",2600);
        System.out.println(map);
        Set keyset = map.keySet();
        for (Object key :keyset) {
           map.put(key,(Integer)map.get(key)+100);
        }
        System.out.println(map);
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =  (Map.Entry)iterator.next();
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
        Collection values = map.values();
        for (Object o :values) {
            System.out.println("工资="+o);
        }

    }
}
