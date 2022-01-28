package com.learn.Final;

/*
    1.final 最终的

    2.final 用来修饰类，方法、变量

    3.用来修饰类，表示此方法不能重写

    4.final 修饰方法，方法不能被重写。

    5.用来修饰变量，表示这个变量是一个常量。
        5.1 final 修饰的属性(只能赋值一次)
            在哪些位置可以赋值：显示赋值；代码块赋值；构造器赋值(每个构造器都要赋值变量)
            特别的：static final 共同修饰一个属性，全局常量：比如：Math的PI
        5.2 final 修饰局部变量
 */
public class FinalTest {
    final int MY_NUMBER1 = 1;
    final int MY_NUMBER2;
    final int MY_NUMBER3;

    {
        MY_NUMBER2 = 1;
        System.out.println(MY_NUMBER2);
    }

    //构造器
    public FinalTest() {
        MY_NUMBER3 = 3;
        System.out.println(MY_NUMBER3);
    }

    public FinalTest(int number) {
        MY_NUMBER3 = number;
    }

    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest();
        System.out.println("-----------------------");
        FinalTest finalTest1 = new FinalTest(4);
    }


    public void shou(){
        final int num = 10;
    }

    public void show(final int number){
        System.out.println(number);
        int num = number;
//        number++(不能修改)
    }

}
