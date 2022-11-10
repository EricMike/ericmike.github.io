package com.hspedu.threaduse.demo2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class MyTest01 {
    public static void main(String[] args) {
        //test1();
        test2();

    }

    private static void test1() {
        //1.使用工厂类获取线程池对象
        ExecutorService executorService = Executors.newCachedThreadPool();
        //2.提交任务
        for (int i = 1; i <=10 ; i++) {
            executorService.submit(new MyRunnable(i));
        }
    }

    private static void test2() {

        //1.使用工厂类获取线程池对象
        ExecutorService executorService = Executors.newCachedThreadPool(new ThreadFactory() {
            int n=1;
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r,"自定义的线程名称"+(n++));
            }
        });
        //2.提交任务
        for (int i = 1; i <=10 ; i++) {
            executorService.submit(new MyRunnable(i));
        }
    }
}

class MyRunnable implements Runnable{
    private int id;

    public MyRunnable(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        //获取线程的名称，打印一句话
        String name = Thread.currentThread().getName();
        System.out.println(name+"执行了任务..."+id);
    }
}