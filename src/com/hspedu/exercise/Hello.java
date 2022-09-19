package com.hspedu.exercise;

public class Hello {
    private static int age=12;
    private String name = "韩顺平";

    public Hello(String name) {
        this.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Hello.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void n1(){
        System.out.println("我是Hello "+ age);
    }
    public void n2(){
        System.out.println("name="+name);
    }
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("age="+age);
        n1();
        Hello hello = new Hello("西伯利亚");
        System.out.println(hello.name);
        hello.n2();
    }
    abstract class A{
        abstract int a();
    }
    class B extends A{
        @Override
        int a() {
            return 3;
        }
    }
    static {
        System.out.println("你好");
    }
}
interface U{
    int i = 2;
    public void cry();
}
interface R{
    public void eat();
}

class W implements U,R{

    @Override
    public void cry() {
        System.out.println("你好吗");
    }

    @Override
    public void eat() {
        System.out.println("我刚刚吃饭");
    }
}
