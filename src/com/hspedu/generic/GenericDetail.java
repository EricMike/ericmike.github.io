package com.hspedu.generic;

import java.util.ArrayList;

/**
 * @author jacky
 * @version 1.0
 */
public class GenericDetail {
    public static void main(String[] args) {
        Pig<A> aPig = new Pig<A>(new A());
        Pig<A> aPig2 = new Pig<A>(new B());
        aPig.f();
        aPig2.f();

    }
}
class A{}
class B extends A{}

class Pig<E>{
    E e;

    public Pig(E e) {
        this.e = e;
    }
    public void f(){
        System.out.println(e.getClass());
    }
}