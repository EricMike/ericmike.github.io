package com.hspedu.object;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a==c);
        System.out.println(b==c);
        B bObj = a;//向上转型
        System.out.println(bObj==c);
        "hello".equals("abc");
        //Object
        Integer integer = new Integer(5);
        System.out.println(a.hashCode()+"\t"+a.toString());

    }
}
class B{}
class A extends B{}
