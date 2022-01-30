package com.learn.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPool {

    public static void main(String[] args) {
        //1. 提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;


        //2. 执行指定的先擦操作。需要提供实现 Runnable 接口或者Callable 接口的实现类的对象
        //execute(Runnable runnable)  使用于Runnable
        service.execute(new NumberThread());
        service.execute(new NumberThread1());

        //submit(Callable callable)   适用于Callable


        //关闭线程池
        service.shutdown();

    }
}

class NumberThread implements Runnable {



    @Override
    public void run() {
        Thread.currentThread().setName("线程1");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+"："+i);
            }
        }
    }
}

class NumberThread1 implements Runnable {

    @Override
    public void run() {
        Thread.currentThread().setName("线程2");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(Thread.currentThread().getName()+"："+i);
            }
        }
    }
}