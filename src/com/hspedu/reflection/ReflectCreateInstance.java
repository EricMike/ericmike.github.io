package com.hspedu.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //1. 先获取到User类的Class对象
        Class<?> userClass = Class.forName("com.hspedu.reflection.User");
        //2. 通过public的无参构造器创建实例
        Object o = userClass.newInstance();
        System.out.println(o);
        //3. 通过public的有参构造器创建实例
        //先得到对应的构造器
        Constructor<?> constructor = userClass.getConstructor(String.class);
        //创建实例，并传入实参
        Object hsp = constructor.newInstance("hsp");
        System.out.println(hsp);
        //4. 通过非public的有参构造器创建实例
        Constructor<?> declaredConstructor = userClass.getDeclaredConstructor(int.class, String.class);
        declaredConstructor.setAccessible(true);//爆破，使用反射可以访问private构造器
        Object hsp1 = declaredConstructor.newInstance(100, "张三丰");
        System.out.println(hsp1);
    }
}


class User{
    private int age = 10;
    private String name = "韩顺平教育";
    public User(){

    }//无参 public

    public User(String name){
        this.name = name;
    }

    private User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
