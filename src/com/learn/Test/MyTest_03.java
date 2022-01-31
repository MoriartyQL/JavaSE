package com.learn.Test;

public class MyTest_03 {
}

class A{
    int i;
    int b;

    public void a(){
        System.out.println(i + b);
    }

}

class s extends A{
    public static void main(String[] args) {
        A a = new A();
       a.b = 10;
       a.i = 5;

       a.a();

    }
}
