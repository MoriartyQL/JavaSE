package com.learn.InnerClass;
/*
*   类的成员5：：内部类
*       1.在类中声明的另一个类，
*       2.内部类的分类：成员内部类(直接声明在类的内部，与属性、方法并列)  vs 局部内部类(方法内、代码块内、构造器内)
*
*          >成员内部类：静态的成员的内部类 vs 非静态的成员内部类
*
*          >
*
*       3.内部类的了解
*           一方面：作为外部类成员
*               >四种权限修饰符修饰
*               >可以使用static修饰
*               >可以调用外部类的结构、属性、方法
*
*
*           另一方面：作为类的角色
*               >内部可以声明属性、方法、构造器、代码块、内部类........
*               >可以被final修饰，不能被继承
*               >可以被abstract修饰，不能实例化
*/

import java.sql.SQLOutput;

public class InnerClassTest
{
    String name = "Tom";
    public static void main(String[] args) {
        Dog d1 = new InnerClassTest.Dog();   //创建静态内部类的对象
        d1.bark();


        //创建非静态的内部类的对象
        InnerClassTest t1 = new InnerClassTest();
        InnerClassTest.cat c1 = t1.new cat();
        c1.bark();
        c1.Name("Jack");
    }


    static class Dog{
        public void bark(){
            System.out.println("汪汪汪！");
        }
    }

    class cat{
        String name = "黄鹂";
        public void bark(){
            System.out.println("喵喵喵！");
        }

        void Name(String name){
            System.out.println(name);   //形参的name
            System.out.println(this.name);   //内部类的name
            System.out.println(InnerClassTest.this.name);  //外部类的name
        }
    }

    //方法内部声明一个实现了接口的类
    public Comparable getComparable(){
        class MyComparabel implements Comparable{

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new MyComparabel();   //返回一个局部内部类。
    }
}
