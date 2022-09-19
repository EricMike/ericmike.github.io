package com.hspedu.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        //1. 得到Boss类对应的Class对象
        Class<?> bossCls = Class.forName("com.hspedu.reflection.Boss");
        //2. 创建对象
        Object o = bossCls.newInstance();
        //3. 调用public的hi方法
        //Method hi = bossCls.getMethod("hi");
        Method hi = bossCls.getDeclaredMethod("hi",String.class);
        //调用
        hi.invoke(o,"韩顺平教育");

        //4. 调用private static 方法
        //得到say方法对象
        Method say = bossCls.getDeclaredMethod("say", int.class, String.class, char.class);
        //因为say方法是private，所以需要爆破，原理和前面讲的构造器和属性一样
        say.setAccessible(true);
        System.out.println(say.invoke(o,12,"韩顺平",'男'));
        //因为say方法是static的，还可以这样调用
        System.out.println(say.invoke(null,200,"韩顺平",'女'));

        //5. 在反射中，如果方法有返回值，统一返回Object,但是运行类型和方法定义的返回类型一致
        Object reVal = say.invoke(null, 300, "汪汪", '男');
        System.out.println(reVal.getClass());

    }
}

class Boss {
    public int age;
    private static String name;

    public Boss() {
    }

    private static String say(int n, String s, char c) {
        return n + " " + s + " " + c;
    }

    public void hi(String s) {
        System.out.println("hi " + s);
    }
}