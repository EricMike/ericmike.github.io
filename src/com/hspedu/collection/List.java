package com.hspedu.collection;

import java.util.ArrayList;

/**
 * @author jacky
 * @version 1.0
 */
public class List {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("红楼梦");
        list.add("三国演义");

        ArrayList list1 = new ArrayList();
        list1.addAll(list);
        System.out.println(list1);
        list1.add("封神榜");
        System.out.println(list1);
        System.out.println(list);
        System.out.println(list1.containsAll(list));
        System.out.println(list1.contains("红楼梦"));
        list1.removeAll(list);
        System.out.println(list1);


    }
}
