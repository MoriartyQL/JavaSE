package com.learn.Thread;

import java.util.concurrent.locks.ReentrantLock;

public class LockTest extends Object{

}

class LockThread extends Thread {
    int ticket = 100;
    //1.lock 的实例化
    private final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            try {
                //2.上锁
                lock.lock();

                if (ticket > 0) {
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println(Thread.currentThread().getName() + ":" + ticket);
                    ticket--;
                }else{
                    break;
                }
            } finally {
                //3.解锁
                lock.unlock();
            }
            //2.上锁
        }
    }
}