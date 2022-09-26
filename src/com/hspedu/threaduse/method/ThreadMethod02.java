package com.hspedu.threaduse.method;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.start();
        for (int i = 1; i <= 20; i++) {
            Thread.sleep(1000);
            System.out.println("主线程 吃了 "+i+" 包子");
            if (i==5){
                System.out.println("主线程(小弟) 让子线程(老大)先吃");
                //join线程插队
                //t2.join();//这里相当于让t2先执行完毕
                Thread.yield();//礼让，不一定成功..
                System.out.println("子线程(老大) 吃完了 主线程(小弟) 接着吃..");
            }
        }
    }
}

class T2 extends Thread{//自定义的线程类
    @Override
    public void run() {

            for (int i = 0; i < 20; i++) {
                //Thread.currentThread().getName()获取当前线程的名称

                try {
                    Thread.sleep(1000);//休眠1秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("子线程 吃了 "+i+" 包子");
            }
    }
}
