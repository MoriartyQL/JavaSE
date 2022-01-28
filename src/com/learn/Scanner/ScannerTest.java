package com.learn.Scanner;

import java.util.Scanner;

/*
    Scanner的使用
    1.导包
    2.创建
    3.使用


 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //System.in 从键盘中输入
        int a = scanner.nextInt();
        String str = scanner.next();
        System.out.println("输入的数字是：" + a);
        System.out.println("输入是字符串是：" + str);

        System.out.printf("%1d,%1.2f",10,1.23);


    }


}
