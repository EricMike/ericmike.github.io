package com.hspedu.list_;

import java.util.*;

/**
 * @author jacky
 * @version 1.0
 */
public class List_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("hsp");
        list.add("tom");
        System.out.println(list);
        List list3 = list.subList(0, 2);//截取集合 索引位前闭后开
        System.out.println(list3);
        System.out.println(list.get(3));
        list.add(1, "sd");
        List list2 = new ArrayList();
        list2.add("mary");
        list2.add("hsp");
        list.addAll(2, list2);
        System.out.println(list);
        list.indexOf(2);


        List list1 = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list1.add("hello" + i);
        }
        System.out.println(list1);

        list1.add(1, "韩顺平教育");
        System.out.println(list1);

        System.out.println(list1.get(4));
        list1.remove(5);
        System.out.println(list1);

        list1.set(6, "三国演义");
        System.out.println(list1);

        Iterator iterator = list1.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        //List list5 = new ArrayList();
        //List list5 = new Vector();
        List list5 = new LinkedList();
        list5.add(new Book("红楼梦", "曹雪芹", 100));
        list5.add(new Book("西游记", "吴承恩", 10));
        list5.add(new Book("水浒传", "施耐庵", 19));
        list5.add(new Book("三国", "罗贯中", 80));
        //list5.add(new Book("西游记","吴承恩",10));

        //如何对集合进行排序


        //遍历
        for (Object o : list5) {
            System.out.println(o);
        }

        //冒泡排序
        sort(list5);
        System.out.println("===排序后===");

        for (Object o : list5) {
            System.out.println(o);
        }

    }

    //静态方法
    public static void sort(List list5) {

        int size = list5.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                //取出对象Book
                Book book1 = (Book) list5.get(j);
                Book book2 = (Book) list5.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {//交换
                    list5.set(j, book2);
                    list5.set(j + 1, book1);
                }
            }
        }

    }
}
