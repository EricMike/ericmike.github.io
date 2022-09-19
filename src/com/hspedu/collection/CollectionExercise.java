package com.hspedu.collection;

import java.util.*;
import java.util.List;

/**
 * @author jacky
 * @version 1.0
 */
public class CollectionExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("大黄",15));
        list.add(new Dog("小黑",150));
        list.add(new Dog("；绿箭侠",23));
        System.out.println(list);
        for (Object o :list) {  //快捷键I
            System.out.println(o);
        }
        System.out.println("使用迭代器");
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
