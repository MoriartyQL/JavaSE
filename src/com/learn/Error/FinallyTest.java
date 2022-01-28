package com.learn.Error;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class FinallyTest {
    public static void main(String[] args) {
        try {
            int i = 10;
            int j = 0;
            System.out.println(i/j);
        }catch (ArithmeticException e){
            System.out.println("出现异常....");
        }finally {
            System.out.println("一定会被执行！");
        }
        FinallyTest finallyTest = new FinallyTest();
        System.out.println(finallyTest.method());

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.close();  //资源一定要关
    }



    @Test
    public int method(){
        try {
            int[] arr3 = new int[10];
            System.out.println(arr3[10]);
            return 1;
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            return 2;
        }finally {
            System.out.println("最后的指令！");
            return 3;
        }

    }

    @Test
    public void Person1(){
        System.out.println("Person!");
        int  i = 0;
        i++;
        Assertions.assertEquals(6,i);
    }
}


