package com.learn.Random;
/*
    Random类：用来生成随机数字
 */

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        int b = random.nextInt();
        int a = random.nextInt(1000);
        System.out.println(a);
        System.out.println(b);
    }
}
