package com.learn.OOP;

import java.util.Scanner;
 /*
    一、面向对象的核心：对类的设计   (创建是为了使用)
        设计类：即设计类的成员：属性、方法；

        属性 = 成员属性 = 成员变量 = field = 字段 = 域
        方法 = 成员方法 = 函数 = 成员函数 = method
        对象 = 实例
        创建类的对象 = 创建类的对象

    二、类的实例化
        面向对象思想落地实现
        第一步：创建类(即创建类的对象)
        第二步：创建类的对象
        第三步：通过”对象.属性“或”对象.方法“的方式，完成相应的功能。
    三、说明
        不同对象的类的属性是相对独立的
 */

public class Person {
    public static void main(String[] args) {

        /*属性(或成员变量)
        成员变量：  直接声明在类的内部
           ①实例变量 ： 不使用Static修饰
           ②全局变量 ： 使用static修饰

        局部变量：
            方法内声明的变量
            方法的形参、构造器的形参
            代码块内声明的遍历

         两者的不同：
         1.声明的位置不同，作用域不同
         2.权限修饰符的使用
            >成员变量可以在声明的类型前，指明权限修饰符
                如：public、private、protected、缺省(即不写，为默认权限)
            >局部变量，不可以加修饰符 权限与方法前面的权限相同
         3.默认初始值
            >成员变量，在声明时，没有赋值，则为默认初始值。
            >局部变量，在使用前一定要赋值，不会默认初始化。

         4.在内存中加载的位置不同
            成员变量：声明在堆空间中
            局部变量：声明在栈空间

         */

        // 类名 对象 = new 类名(方法)
        Scanner scan = new Scanner(System.in);
        Person1 p1 = new Person1();  //创建对象  有创建的类的方法


        //通过对象，调用其属性和方法:“对象.属性,对象.方法”
        //对象.属性
        p1.name = "李华";
        p1.age = 20;
        p1.isMale = true;

        //对象.方法
        p1.eat();
        p1.sleep();
        p1.talk("中文");


    }
}

class Person1 {   //类
    //设计类的成员：属性
    String name;
    int age;
    boolean isMale;

    //设计类的成员：方法
    /*
        方法的使用：
        1.举例：
        public void eat(){}
        public void String geName(){}
        public void sleep (int hour)

        2.定义方法的格式
        权限修饰符 返回值类型 方法名(形参列表){
            方法体;
        }
        3.1 权限修饰符：指明方法被调用时可见性的大小

        3.2 返回类型：
            >分类：有具体的返回值类型 VS 没有放回值

        3.3 方法名：是标识符，要符合命名规则，要见名知意

        3.4 形参列表：一个方法可以声明形式参数，属于局部变量。
            >声明时，只需要指明形参的类型和形参名即可，在调用方法是，形参赋值
            >形参列表的格式：形参类型1 形参名1，形参类型2, 形参名2…………
        3.5 调用一个方法要执行的操作
            >方法体内可以调用其他的方法   类似于C中函数内可以调用函数


     */
    public void eat() {  //方法
        System.out.println("人要吃饭。");
    }

    public void sleep() {
        System.out.println("人要睡觉。");
    }

    public void talk(String language) {
        System.out.println("人可以说话，使用" + language + "语言。");
    }

}
