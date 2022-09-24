package com.hspedu.file.exercise;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception {
        //序列化后，保存的文件格式，不是存文本，而是按照他的格式来保存
        String filePath = "C:\\Users\\Eric小麦\\Desktop\\data.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        //序列化数据到C:\Users\Eric小麦\Desktop\data.dat
        oos.write(100);//int -> Integer(实现了 Serializable)
        oos.writeBoolean(true);//boolean -> Boolean(实现了 Serializable)
        oos.writeChar('a');//char -> Character(实现了 Serializable)
        oos.writeDouble(9.5);//double -> Double(实现了 Serializable)
        oos.writeUTF("韩顺平教育");//String
        //保存一个dog对象
        oos.writeObject(new Dog("旺财",10));
        oos.close();
        System.out.println("数据保存完毕(序列化形式)");
    }
}

//如果需要序列化某个类的对象，必须实现 Serializable
class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}