package com.hspedu.threaduse.method;

public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        //如果我们希望main线程结束后，子线程自动结束
        //只需将子线程设为守护线程即可

        for (int i = 0; i < 10; i++) {//main线程
            System.out.println("宝强在辛苦的工作...");
            Thread.sleep(1000);
        }
    }
}


class MyDaemonThread extends Thread{
    @Override
    public void run() {
        for (; ; ) {
            try {
                Thread.sleep(1000);//休眠1000秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("马蓉和宋喆快乐聊天，哈哈哈~~~");
        }
    }
}