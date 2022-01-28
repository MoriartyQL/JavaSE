package com.learn.Interface;
/*
    接口(interface)的使用   接口的本质是：规范，契约，标准
    1.我们用 interface 关键字来定义接口
    2.接口，是和类并列的一个结构

    3.接口中只能定义抽象方法和全局常量。   ------jbk7及以前的版本
        抽象方法：声明为 public abstract 的
        全局常量：声明为 public static final 的

    4.  类与类之间可以体现：继承关系(extends)
        类与接口之间体现：实现关系(implements)
            >当类实现接口后，需要重写抽象方法，进而可以实例化此实现类
            >当类实现接口后，并咩有重写接口中的所有方法，此是实现类就是抽象类，要用abstract修饰 不能实例化

    5.类可以实现多个接口，一定程度上就解决了类的单继承的局限性。

    6.接口与接口之间体现继承关系，接口与接口之间可以多继承

    7.接口的应用：代理模式(Proxy)

    8.jbk8/jbk9
       可以在接口中添加静态方法和默认方法。
          静态方法：public static 修饰的方法，为静态方法，(public可以不写)
          默认方法： 声明为 public default的
            如果父类和接口中定义里同名同参数的方法，子类在没有重写方法，调用该方法时，调用的是父类的方法。(类优先原则)
            如果是多个接口中有同名参数的方法，编译器无法判断调用的是哪个方法。编译不通过
               为了编译通过，实现类必须重写此方法

     9.抽象类和接口的区别
        共同点：①都可以定义抽象方法、常量
               ②二者都不能直接实例化，都必须提供子类(或实现类)重写所有的抽象方法后方法可以实例化
        不同点：①声明的方式不同
               ②抽象类：一定有构造器 接口 没有构造器
               ③类的单继承性与接口的多继承性
               ④类和接口之间是实现关系，并且多实现类

 */


public class InterfaceTest {
    public static void main(String[] args) {
//        Flyable.MAX_SPEED = 1;   不能修改


        Plane plane = new Plane();
        plane.method3();  //实现类调用接口中的默认方法。
    }
}

interface Flyable {
    //全局常量    默认为public static final  权限
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1;

    //默认为抽象方法 public abstract   不可改
    void fly();

    public default void method3() {     //不是静态的，实现类的对象可以调用这个方法
        System.out.println("默认方法");
    }

}

interface Attackable {
    void attack();

    public static void method1() {
        System.out.println("接口中的静态方法！");
    }
}


class Plane implements Flyable {


    @Override
    public void fly() {
        System.out.println("飞机靠引擎飞行");
    }


    //重写接口中的方法
    public void method3() {
        System.out.println("重写的接口中的默认方法");
    }


}

//多接口
class Buttet implements Flyable, Attackable {

    @Override
    public void fly() {
        System.out.println("子弹发射");
    }

    @Override
    public void attack() {
        System.out.println("子弹伤害很大");
    }
}

interface A {
    //声明n个抽象方法
    public default void method3() {
        System.out.println("A中的mmethod3方法");
    }
}

interface B {
    //声明m个抽象方法
}

//接口可以多继承
interface C extends A, B {
    //继承n+m个抽象方法
}

//先继承在写写实现

class Passengers extends Plane implements Flyable, A {
    public void method3() {
        System.out.println("类中的重写");
    }

    //调用父类和接口中的方法   --jbk 8/9
    public void mothed4() {
        super.method3();   //父类中的方法
        A.super.method3();   //调用接口A中定义的方法。
    }

}

class Y {
    public static void main(String[] args) {
        System.out.println("你好！~");

    }
}
