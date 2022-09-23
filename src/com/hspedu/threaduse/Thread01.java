package com.hspedu.threaduse;

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        //创建一个Cat对象，可以当做线程使用
        Cat cat = new Cat();
        cat.start();//启动线程
        //说明：当main线程启动一个子线程 Thread-0，主线程不会阻塞，会继续执行
        //这时 主线程和子线程是交替执行..

        System.out.println("主线程继续执行"+Thread.currentThread().getName());//名字main
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程 i="+i);
            //让主线程休眠
            Thread.sleep(1000);
        }
    }
}

//1. 当一个类继承了Thread类，该类就可以当做线程使用
//2. 我们会重写run方法，写上自己的业务代码
//3. run Thread类 实现了Runnable接口的run方法
/*@Override
public void run() {
    if (target != null) {
        target.run();
    }
}*/
class Cat extends Thread{
    int times = 0;
    @Override
    public void run() {//重写run方法，写上自己的业务逻辑
        while (true){
            System.out.println("喵喵，我是小猫咪"+(++times)+" 线程名="+Thread.currentThread().getName());
            //让该线程休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times==8){
                break;//当times到8，退出while，这时线程也就退出..
            }
        }

    }
}