package com.learn.Generic;



/*
    泛型

 */



public class GenericTest {
    public static void main(String[] args) {
        Person<Integer> p1 = new Person<Integer>(10);
        Integer i1 = p1.getType();
        System.out.println(i1);
    }


}

class Person<T> {
    String name;
    int age;

    private T type;

    public Person() {
    }

    public Person(T type) {
        this.type = type;
    }

    public T getType() {
        System.out.println(type);
        return type;
    }

    //泛型方法
    public <E> void formArrayToList(E[] arr){

    }
}
