package com.hspedu.homework;

public class MemberinnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();
        Outer08.Inner08 inner08 = outer08.new Inner08();
        Outer08.Inner08 instance = outer08.getInstance();
        instance.say();
    }
}

class Outer08{
    private int n1 = 10;
    public String name = "张三";
    class Inner08{//成员内部类
        private int n1 = 66;
        public void say(){
            System.out.println("Outer08 的 n1 = "+Outer08.this.n1+" Outer08 的 name = "+name+"Inner08 的 n1 = "+n1);
        }
    }

    public Inner08 getInstance(){
        return new Inner08();
    }

    //写方法
    public void t1(){
        //使用成员内部类
        Inner08 inner08 = new Inner08();
        inner08.say();
    }
}