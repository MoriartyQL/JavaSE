package com.learn.Singleton;


/*
    单例(Singleton)设计模式
        设计模式：
            在大量实践中总结和理论优化之后的代码结构、编辑风格、以及解决问题的思考套路
        单例设计模式：
        饿汉式 vs 懒汉式
        区别：创建对象的时间不同
        比较：饿汉式：advantage: 不存在线程安全
             懒汉式：advantage: 延迟对象的创建
                    disadvantage: 存在线程安全问题
 */
public class Singleton {
    public static void main(String[] args) {
        Bank b1 = Bank.getInstance();
        Bank b2 = Bank.getInstance();
        System.out.println(b1);
        System.out.println(b2);

        Application app1 = Application.getInstance();
        Application app2 = Application.getInstance();
        System.out.println(app1);  //com.learn.Singleton.Application@4eec7777
        System.out.println(app2);  //com.learn.Singleton.Application@4eec7777
    }
}


//单例设计模式
//饿汉式
class Bank{
    //1.私有化的构造器  无法创建类的对象
    private Bank(){
    }

    //2.在类的内部创建对象  类加载时就创建了对象
    private static Bank bank = new Bank();

    //3.通过公共的方法，获取Bank的实例  及静态方法
    public static Bank getInstance(){
        return bank;
    }
}

//懒汉式
class Application{
    //1.私有化的构造器  无法创建类的对象
    private Application(){}

    //2.
    private static Application app = null;

    //3.
    public static Application getInstance(){   //调方法时创建对象
        if(app == null){
            app = new Application();
        }
        return app;
    }


}