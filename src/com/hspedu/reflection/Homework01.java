package com.hspedu.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Homework01 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        //1. 得到PrivateTest类对应的Class对象
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        //2. 创建对象实例
        PrivateTest privateTestObj = privateTestClass.newInstance();
        //3. 得到name属性对象
        Field name = privateTestClass.getDeclaredField("name");
        //4. 爆破name
        name.setAccessible(true);
        name.set(privateTestObj,"天龙八部");
        //5. 得到getName方法对象
        Method getName = privateTestClass.getMethod("getName");
        //6. 因为getName()是public，直接调用
        Object invoke = getName.invoke(privateTestObj);
        System.out.println("name属性值="+invoke);

    }
}


class PrivateTest{
    private String name = "hellokitty";

    public String getName() {
        return name;
    }
}