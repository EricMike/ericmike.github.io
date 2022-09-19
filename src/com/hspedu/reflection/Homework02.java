package com.hspedu.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Homework02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1. Class类的forName方法得到File类的class对象
        Class<?> fileCls = Class.forName("java.io.File");
        //2. 得到所有的构造器
        Constructor<?>[] declaredConstructors = fileCls.getDeclaredConstructors();
        //遍历输出
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("File构造器"+declaredConstructor);
        }
        //3. 单独得到 public java.io.File(java.lang.String)
        Constructor<?> declaredConstructor = fileCls.getDeclaredConstructor(String.class);
        String fileAllPath = "C:\\Users\\Eric小麦\\Desktop\\mynew2.txt";
        Object file = declaredConstructor.newInstance(fileAllPath);//创建file对象

        //4. 得到createNewFile 的方法对象
        Method createNewFile = fileCls.getMethod("createNewFile");
        createNewFile.invoke(file);

        //file的运行类型就是File
        System.out.println(file.getClass());
        System.out.println("创建文件成功"+fileAllPath);

    }
}
