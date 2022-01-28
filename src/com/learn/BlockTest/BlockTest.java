package com.learn.BlockTest;
/*
    类的成员之：代码块

    1.作用：初始化类或对象的信息

    2.可以用static修饰代码块

    3.静态代码块只能在类创建时执行一次，非静态代码块在对象的创建时执行

    4.静态代码块内能够创建

 */
public class BlockTest {
    public static void main(String[] args) {
        Person p1 = new Person();  //随着对象的创建而执行
        Person.shwo();  //静态方法只能用类来调用
        Person p2 = new Person();
    }
}

class Person{
    int age;
    String name;
    public void eat(){
        System.out.println("吃饭！");
    }

    public static void shwo(){
        System.out.println("你好！");
    }

    //非静态代码块
    {
        System.out.println("我是非静态代码块");
    }

    //静态的代码块
    static{
        System.out.println("我是静态代码块");
    }

}


