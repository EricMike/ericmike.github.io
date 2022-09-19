package com.hspedu.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author jacky
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Collections_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Tom");
        list.add("simth");
        list.add("king");
        list.add("milan");
        Collections.reverse(list);
        System.out.println("list=" + list);
//        for (int i = 0; i < 5; i++) {
//            Collections.shuffle(list);
//            System.out.println("list=" + list);
//        }
        Collections.sort(list);
        System.out.println(list);
        try {
            Collections.sort(list, new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    return ((String)o2).length()-((String)o1).length();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(list);
        Collections.swap(list,0,1);
        System.out.println(list);
    }
}
