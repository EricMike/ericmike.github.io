package com.hspedu.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author jacky
 * @version 1.0
 */
public class CollectionFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义","罗贯中",10.1));
        col.add(new Book("小李飞刀","古龙",5.1));
        col.add(new Book("红楼梦","曹雪芹",34.6));
        //增强for循环
        for(Object book:col){
            System.out.println(book);
        }
        for (Object o : col) {
            System.out.println(o);
        }

    }
}
