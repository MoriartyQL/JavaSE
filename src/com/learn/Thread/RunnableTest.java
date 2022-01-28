package com.learn.Thread;

public class RunnableTest {
    public static void main(String[] args) {
         method m1 = new method();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}


class method implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i<=50;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}