package com.learn.Thread;

public class ThreadTest {
    public static void main(String[] args) {
        NewThread e1 = new NewThread();
        e1.start();
        for (int i = 0;i<=50;i++)
        System.out.println(Thread.currentThread().getName()+":"+i);
    }
}

class NewThread extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<=100;i+=2){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
