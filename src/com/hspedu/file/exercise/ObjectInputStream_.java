package com.hspedu.file.exercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //指定反序列化的文件
        String filePath = "C:\\Users\\Eric小麦\\Desktop\\data.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        //读取
        //1. 读取(反序列化)的顺序需要和保存数据(序列化)的顺序一致
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Object dog = ois.readObject();
        System.out.println("运行类型="+dog.getClass());
        System.out.println("dog信息="+dog);

        Dog dog2 = (Dog)dog;
        System.out.println(dog2.getName());

        //关闭流，外层流即可
        ois.close();
    }
}

