package com.learn.AbstractTest;
/*
    abstract关键字的使用
        1.abstract:抽象的

        2.可以用来修饰类、方法。

        3.abstract 修饰类：抽象类
            抽象类不能实例化(不能造对象)
            抽象类中一定有构造器，目的是：为了子类对象实例化时的调用
            子类继承抽象类以后，如果重写了所有的抽象方法，则此子类可以实例化。
            子类继承抽象类以后，如果没有重写所有的抽象方法，则此子类仍然是抽象类。


        4.abstract 修饰方法：抽象方法
            特点：没有方法体。此方法不能被任何结构调用
                 抽象方法所在的类一定是抽象类。

        5.abstract 的使用
            (1).不能用来修饰属性，构造器，代码块

            (2).abstract 不能与private final static 公用
 */



public class AbstractTest {
    public static void main(String[] args) {

    }

//   private abstract void method(){}   private 没法覆盖


}

abstract class Person{
    String name;
    int age;

    public Person(){}

//    public void eat(){
//        System.out.println("吃东西");
//    }


    //抽象类，没有方法 要加上 abstract
    public abstract void eat();
    public abstract void walk();


}

class Worder extends Person{
    public void eat(){
        System.out.println("eat");
    }

    @Override
    public void walk() {}

//    public abstract static void month(){};   静态方法可以通过 类.方法 调用而抽象方法不能用



}

//final abstract class A{}   final 表示类不能别继承



