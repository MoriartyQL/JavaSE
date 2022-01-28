package com.learn.OOP;

/*
    面对对象的特征一：封装性
    1. 可以通 对象.属性 或 对象.方法 调用类的内部结构。 而属性有类型和储值范围要求，使得我们在赋值时要格外小心。
        因此用private 来限制属性，现在方法

    2.封装性的体现：
    >小结：我们可以私有化(private)类的属性同时提供公共(public)的方法，对类的属性调用
    >封装性的体现2：私有化方法，只能在类内调用，不对外暴露

    3.权限修饰符的使用：使用不同的权限修饰符来修饰及类的内部，体现这些结构的可见性大小
        3.1 java 规范的权限修饰符有
            private < 缺省 <protected < public
            private:类内能用
            缺省:同一个包
            protected:不同包的子类
            public:同一个工程

        3.2 可以使用4种权限修饰符来修饰类的内部结构：属性、方法、构造器、内部类
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        String n = "熊猫";
        a1.setName(n);
//        a1.age = 2;
//        a1.legs = 2;
        a1.setAge(3);
        a1.setLegs(-4);
        a1.getLegs();
        a1.eat();
        a1.sleep();
        a1.show();
    }
}

class Animal {
    private String name;
    private int age;
    private int legs; //腿的个数   //用了private后属性不能直接调用，在方法中调用

    //防止数据非法
    //对属性赋值
    public void setLegs(int l) {
        if (l >= 0 && l <= 100) {
            legs = l;
        } else {
            System.out.println("数据非法！");
        }
    }
    public void setAge(int l) {
        if (l >= 0 && l <= 100) {
            legs = l;
        } else {
            System.out.println("数据非法！");
        }
    }
    public void setName(String n){
        name = n;
    }
    //获得属性的值
    public int getLegs() {
        System.out.println(legs);
        return legs;
    }
    public int setAge(){
        System.out.println(age);
        return age;
    }
    public String setname(){
        return name;
    }

    public void eat() {
        System.out.println("动物进食");
    }


    public void sleep() {
        System.out.println("动物睡觉");
    }

    public void show() {
        System.out.println("名字：" + name + " 年龄：" + age + " 腿的条数：" + legs);
    }
}
