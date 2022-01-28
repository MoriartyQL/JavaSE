package com.learn.WrapperTest;
/*
    包装类的使用
    1.why
        为了使得基本数据类型的变量具有类的特征，我们给每一个基本数据类型都对应一个包装类

    2.八个基本数据类型及其对于的包装
        实际上，包装类就是对基本数据类型变量的封装，我们在包装类的源码中，可以找到对于基本数据类型的变量

    3.掌握如何实现基本数据类型、对应的包装类、String三者之间的转换

 */

import java.net.Inet4Address;

public class WrapperTest {
    public static void main(String[] args) {
        WrapperTest t1 = new WrapperTest();
        t1.test1();
        t1.test3();
    }
    /*
        基本数据类型----->包装类：使用包装类的构造器
        jbk 5.0 针对基本数据类型与包装类之间的转换可以使用：自动装箱，自动开箱
     */

    public void test1(){
        int num = 123;
        Integer i1 = new Integer(123);
        System.out.println(i1.intValue());
        int value = i1.intValue();
        System.out.println(i1);


        Float f1 = new Float(1.1f);
        System.out.println(f1.floatValue());

        double d1 = 123.4;
        double d2 = new Double("123.3");
        double d3 = new Double(d1);
//        double d4 = new Double("123.3ab");  NumberFormatException

        Boolean b1 = new Boolean(true);
        System.out.println(b1);  //true

        Boolean b2 = new Boolean("true");
        System.out.println(b2);  //true

        //只要不是true就为false
        Boolean b3 = new Boolean("true123");
        System.out.println(b3);    //false

        Boolean b4 = new Boolean("tRuE");
        System.out.println(b2);   //ture



    }

    public void test3(){
        int num = 10;
        Integer it = num;   //自动装箱
        System.out.println(it.toString());

        int num1 = it;      //自动拆箱

        System.out.println(num1 + 123);
        System.out.println(it * 4);   //自动拆箱


        Boolean b1 = true;   //自动装箱
        boolean b2 = b1;     //自动拆箱

        Order o = new Order();
        System.out.println(o.falg );   //null  未初始化

    }

    class Order{
        Boolean falg;
    }

}
