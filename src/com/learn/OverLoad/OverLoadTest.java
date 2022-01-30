package com.learn.OverLoad;/*
    方法的重载(overload)
        1.定义：在一个类中，允许存在一个以上的同名方法，只要它们的参数个数或参数类型的不同即可
            同一个类、同方法名；参数列表不同(它们的参数个数或参数类型的不同即可);

        2.还要方法满足“两同一不同”，则称这些方法彼此之间构成重载

        3.强调：方法的重载与权限修饰符、返回类型值、形参名、方法体没有关系

        4.如何确定到用的是指定的某个方法？
            ①对象只能调用所属类中声明的方法。
            ②通过方法名区分
            ③通过方法的形参列表区分


      可变个数的形参方法
      1.jdk 5.0新增的体现，可变的形参方法

      2.可变个数形参的格式为：数据类型 ... 变量名

      3.可变个数形参方法在调用的时，可以给可变个数形参赋值的变量个数为：0个，1个，2个，...

      4.可变个数形参方法定义时，必须作为最后一个形参

      5.最多定义一个可变形参
 */

public class OverLoadTest {
    public static void main(String[] args){
        int a = 9;
        int b= 2;

        double d1 = 1.2;
        double d2 = 1.1;
        OverLoadTest test = new OverLoadTest();
        test.getSum(a,b);
        test.getSum(d1,d2);
        test.show("aaa","bbb");
    }

    public void getSum(int i,int j){
        System.out.println(j+i);
    }

    public void getSum(double i,double j){
        System.out.println(j+i);
    }

    public void getSum(double d1,double d2,double d3){
        System.out.println(d1+d2+d3);
    }

    //可变个数的形参方法
    public void show(String ... str1){   //String ... str1 等同与 String[] str1 不能构成重载
        System.out.println(str1[1]);
    }
}
