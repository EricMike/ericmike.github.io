package com.hspedu.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {
        Animal animal = new Cat();//向上转型
        Object obj = new Cat();
        System.out.println("ok~~");
        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();
    }
}
