package com.learn.Interface;
/*
    1.接口，其实可以看做关于具体问题的一套规范
    2.接口，可以体现多态性
        接口多态性的应用
            //建立接口的匿名对象
            USB 为接口
            USB usb1 = new USB(){
                方法的重写
            }
 */

public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Printer printer = new Printer();
        //1.创建了借口的实现类Printer的对象printer
        computer.transferData(printer);

        //2.创建了接口的实现类Flash的匿名对象
        computer.transferData(new Flash());

        //3.创建了接口的匿名实现类    匿名实现类
        USB usb1 = new USB() {
            public void start() {
                System.out.println("mp4开始工作");
            };

            public void stop() {
                System.out.println("mp4停止工作");
            };
        };
        computer.transferData(usb1);


        //创建了接口的匿名实现类的匿名对象

        computer.transferData(new USB() {

           @Override
            public void start() {
                System.out.println("电子书开始工作");
            }

            @Override
            public void stop() {
                System.out.println("电子书结束工作");
            }
        });
    }
}

class Computer {
    public void transferData(USB usb) {  //多态性 : USB usb = new Printer();
        usb.start();
        System.out.println("其他细节");
        usb.stop();

    }
}

interface USB {
    void start();

    void stop();
}

class Printer implements USB {

    @Override
    public void start() {
        System.out.println("打印机开始工作。");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止工作");
    }


}

class Flash implements USB {

    @Override
    public void start() {
        System.out.println("U盘开始工作。");
    }

    @Override
    public void stop() {
        System.out.println("U盘停止工作");
    }
}