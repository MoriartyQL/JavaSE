package com.learn.Reflect;

public class Person {
    private int age;
    String name;

    public Person(){
        super();
    }


    private Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString(){
        return name+"="+age;
    }

    private void secret(){
        System.out.println("我有一个秘密");
    }

    private void secret(String s){
        System.out.println("我有一个秘密："+s);
    }



}
