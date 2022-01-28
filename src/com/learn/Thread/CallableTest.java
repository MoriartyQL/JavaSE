package com.learn.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

//创建Callable的实现类
public class CallableTest implements Callable<Integer> {

    //重写call方法，将此线程要执行的命令输入来call中
    @Override
    public Integer call() throws Exception {

        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                ;
            }
        }
        return i;
    }
}

class ThreadNew {
    public static void main(String[] args) {
        //创建对象
        CallableTest callableTest = new CallableTest();
        //通过参加Future对象，实现Callable的调用
        FutureTask<Integer> futureTask = new FutureTask<Integer>(callableTest);

        //创建Thread对象，使用start(),实现call()的调用
        Thread thread = new Thread(futureTask);
        thread.start();

        //接受返回值，通过get()，获取返回值
        try {
            Object o = futureTask.get();
            System.out.println("总和为：" + o);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

