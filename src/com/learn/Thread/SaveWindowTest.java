package com.learn.Thread;

public class SaveWindowTest {
    public static void main(String[] args) {
        Window w1 = new Window();

        Thread t2= new Thread(w1);
        Thread t1= new Thread(w1);
        Thread t3= new Thread(w1);


        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.setName("1");
        t2.setName("2");
        t3.setName("3");

        t1.start();
        t2.start();
        t3.start();
    }

}
//同步代码块解决线程安全问题
class Window implements Runnable{
    int ticket = 100;
    final Object o1 = new Object();
    @Override
    public void run() {
        show();
    }

    private synchronized void show() {
        while(true){
//            synchronized (o1) {
                if (ticket > 0) {
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println(Thread.currentThread().getName()+":"+ticket);
                    ticket--;
                }
//            }
        }
    }
}