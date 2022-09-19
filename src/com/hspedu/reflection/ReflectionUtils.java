package com.hspedu.reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public static void main(String[] args) {

    }

    //第一组方法API
    @Test
    public void api_01() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> personCls = Class.forName("com.hspedu.reflection.Person");
        Object o = personCls.newInstance();
        Method method = personCls.getMethod("m1");
        method.invoke(o);
        System.out.println(personCls.getName());
        System.out.println(personCls.getSimpleName());
        Field[] fields = personCls.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }
        Method[] methods = personCls.getMethods();
        for (Method method1 : methods) {
            System.out.println(method1.getName());
        }
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }
        Constructor<?>[] constructors = personCls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        Package aPackage = personCls.getPackage();
        System.out.println(aPackage.getName());
    }
}

class Person{
    //属性
    public String name;
    protected int age;
    String job;
    private double sal;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    //方法
    public void m1(){
        System.out.println("hello");
    }
    protected void m2(){

    }
    void m3(){

    }
    private void m4(){

    }
}
