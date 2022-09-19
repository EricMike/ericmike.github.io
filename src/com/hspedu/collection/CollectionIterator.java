package com.hspedu.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author jacky
 * @version 1.0
 */
public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义","罗贯中",10.1));
        col.add(new Book("小李飞刀","古龙",5.1));
        col.add(new Book("红楼梦","曹雪芹",34.6));

        System.out.println(col);
        Iterator iterator = col.iterator();
        //快捷键 control + j
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
        }
        //iterator = col.iterator();//把指针放回原来地方
        System.out.println("第二次遍历");
        try {
            while (iterator.hasNext()) {
                Object next =  iterator.next();
                System.out.println(next);
            }
            throw new RuntimeException("指针放置不对");
        } catch (Exception e) {
            e.getMessage();
        }

        String s = String.valueOf(12);
        System.out.println(s.getClass());

    }
}
class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
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
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
