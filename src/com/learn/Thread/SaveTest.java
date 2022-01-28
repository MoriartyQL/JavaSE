package com.learn.Thread;

public class SaveTest {
    public static void main(String[] args) {

        Bank b1 = new Bank();
        Bank b2 = new Bank();

        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b2);

        t1.setName("用户1");
        t2.setName("用户2");

        t1.start();
        t2.start();
    }
}

class Bank implements Runnable {
    static int count = 0;
    int t = 0;

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (Bank.class) {
                if (t < 3) {
                    count += 1000;
                    t++;
                    System.out.println(Thread.currentThread().getName() + ":" + count);
                } else {
                    break;
                }
            }
        }
    }
}
