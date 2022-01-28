package com.learn.OBJECT;
/*
    Object 类中tostring()的使用
        1.当我们打印一个对象的引用时，相当与调用了object类中的tostring方法
        2.Object类中tostring()定义如下
              public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
        3.像String Data File 包装类等类都重写了Object类中的toString()，用于返回当前对象的实体内容
        4.对于自定义类，也希望调用toString() 时返回各个属性
 */

public class ToStringTest {
    public static void main(String[] args) {
        User user1 = new User();
        System.out.println(user1.toString());   //未重写toString com.learn.OBJECT.User@3c1
        System.out.println(user1);              //重写toString User{age=0, name='null'}
        String str = new String("hello");
        System.out.println(str.toString());   //hello


    }
}
