package com.hspedu.Map_;

import java.util.*;

/**
 * @author jacky
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put("宋喆", "马蓉");
        map.put("刘令博", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");
        Set keyset = map.keySet();
        System.out.println("第一种方式");
        for (Object key : keyset) {
            System.out.println(key + "-" + map.get(key));
        }
        System.out.println("第二种方式");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        System.out.println("----------第一种方式-----------");
        Collection values = map.values();
        for (Object value : values) {
            System.out.println(value);
        }

        System.out.println("----------第二种方式-----------");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value = iterator1.next();
            System.out.println(value);
        }

        Set entryset = map.entrySet();//EntrySet<Map.Entry<k,v>>
        for (Object entry : entryset) {
            //向下转型
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        Iterator iterator3 = entryset.iterator();
        while (iterator3.hasNext()) {
            Object entry = iterator3.next();
            System.out.println(entry.getClass());
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }

    }
}
