package com.learn.OBJECT;
/*
    一、java.lang.Object类
    1.Objec类是所有java类的根父类，包括数组
    2.Object类中定义的方法，在权限允许的情况下，可以被所有的java类、数组调用
 */

public class ObjectTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(arr instanceof Object);
        System.out.println(arr.getClass());

        String str = new String("hello");
        System.out.println(str.getClass());
        System.out.println(str.hashCode());
        String s1 = null;

    }
}
