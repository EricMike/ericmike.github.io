package com.hspedu.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings({"all"})
public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jacky");
        list.add(10);
        list.add(true);
        System.out.println(list);
        //list.remove(0);
        list.remove(true);
        System.out.println(list);
        System.out.println(list.contains("jacky"));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list);

        ArrayList list2 = new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演义");
        list.addAll(list2);
        System.out.println(list);
        System.out.println(list.containsAll(list2));
        list.add("聊斋志异");
        list.removeAll(list2);
        System.out.println(list);

        Collection col = new ArrayList();
        col.add(new Books("三国演义", "罗贯中", 10.1));
        col.add(new Books("小李飞刀", "古龙", 5.1));
        col.add(new Books("红楼梦", "曹雪芹", 34.6));

//        Iterator iterator = col.iterator();
//        while (iterator.hasNext()) {
//            Object next =  iterator.next();
//            System.out.println(next);
//        }
//
//        iterator = col.iterator();
//        while (iterator.hasNext()) {
//            Object next =  iterator.next();
//            System.out.println(next);
//        }

        //增强for循环
        for (Object book : col) {
            System.out.println(book);
        }

        //增强for,也可以直接在数组使用
        int[] nums = {1, 8, 10, 90};
        for (int i : nums) {
            System.out.println(i);
        }
    }
}

class Books {
    private String name;
    private String author;
    private double price;

    public Books(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
