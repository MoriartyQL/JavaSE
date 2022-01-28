package com.learn.OOP;
import java.util.Scanner;
/*
    值的传递
    1.对于基本数据类型：将数据值赋给另一个变量。

    2.对于引用数据类型：传递的是引用数据类型变量保存的对象（或数组）的地址值

    使用到的判别工具：
        ①：成员变量：存放到堆空间
           局部变量：声明在栈空间
        ②:基本数据类型变量：保存的就是其数据值
           引用数据类型变量：保存的是地址值
 */

public class ValueTransferTest {
    public static void main(String[] args){

        Data date = new Data();
        ValueTransferTest swap1 = new ValueTransferTest();
        System.out.println(date.a+" "+date.b);
        swap1.swap(date);
        System.out.println(date.a+" "+date.b);
    }



    public void swap(Data data){
        int temp = data.a;
        data.a = data.b;
        data.b = temp;
    }
}

class Data{
    public static Scanner scan = new Scanner(System.in);  //引用输入函数
    int a = scan.nextInt();
    int b = scan.nextInt();
}