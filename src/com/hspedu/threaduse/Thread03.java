package com.hspedu.threaduse;

public class Thread03 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();//启动第一个线程
        thread2.start();//启动第二个线程
        while (true){
            System.out.println("我是主线程"+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class T1 implements Runnable{
    int count = 0;
    @Override
    public void run() {
        while (true){
            //每嗝1秒输出"hello,world",输出10次
            System.out.println("hello,world"+(++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count==60){
                break;
            }
        }

    }
}

class T2 implements Runnable{
    int count = 0;
    @Override
    public void run() {
        while (true){
            //每嗝1秒输出"hi",输出5次
            System.out.println("hi"+(++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count==20){
                break;
            }
        }

    }
}