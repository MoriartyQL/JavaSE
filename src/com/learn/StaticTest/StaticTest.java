package com.learn.StaticTest;
/*
    static 关键字的使用
    1.static:静态的

    2.static 用修饰：属性、方法、代码块、内部类

    3.static 用来修饰属性
        3.1在类中声明的属性部分：static修饰的：静态变量，类变量
                             非static修饰的：实例变量
        3.2静态变量在内存中只有一份，被类的多个对象所共享。
           如果类的一个对象对共享的静态变了进行进行修改的的话，会导致其他多个对象调用此静态变量，也是被修改的
           对比：实例对象，在内存中每个对象一份，互相不影响。
        3.3实例变量：存储在堆空间
           静态变量：存储在静态域中
        3.4实例变量：随着对象在创建而加载，每个对象一份。
           静态变量：随着类的加载而加载，在内存中只有一份。
        3.5静态变量的加载是要早于对象的创建。

        3.6   静态变量         实例变量
        类：    yes             no
        对象：  yes             yse
     上述的解释都是从生命周期的角度来看，后出生的可以调用已经加载的。

       3.7 如何判断是否要加static?
            >是否需要当前类的多个对象共享唯一一个属性。如果是就使用static修饰
            >类中的常量习惯用static修饰。


     4.static用来修饰方法
               静态方法         实例方法
        类：    yes             no
        对象：  yes             yse

        在什么时候使用静态方法？
            >通常，工具类一般都是静态的
            >通常方法内如果操作静态变量，则此方法设为静态的


 */

public class StaticTest {
    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        Chinese c2 = new Chinese();
        c1.age = 30;
        c2.age = 20;
        c1.name = "lihua";
        c2.name = "liuqiang";
        c1.nation = "中国";   //静态方法
        c1.info();
        c1.show();
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        //类可以调用静态方法
        Chinese.info();
        //类不能调用非静态的方法  如：Chinese.show()   无法调用



    }



}

class Chinese {
    String name;
    int age;
    static String nation;


    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", nation=" + nation +
                '}';
    }
    public void show(){

        //非静态方法，可以调用静态方法
        eat();

        System.out.println("Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", nation=" + nation +
                '}');
    }

    public static void info(){
        System.out.println("我是中国人！");
        //静态方法内不能调用非静态的方法
        //静态方法可以调用别的静态方法
        eat();
    }

    public static void eat(){
        System.out.println("中国菜好吃！");
    }
}
