package com.learn.Reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@SuppressWarnings("unchecked")
public class ReflectTest {

    @Test
    public void test1() throws Exception {


        Class<Person> clazz = (Class<Person>) Class.forName("com.learn.Reflect.Person");

        //获取一个对象。通过获取类的构造器定义一个对象
        Person p = clazz.getDeclaredConstructor().newInstance();

        //获取私有属性
        Field age = clazz.getDeclaredField("age");
        age.setAccessible(true);
        age.set(p, 12);


        Field name = clazz.getDeclaredField("name");
        name.set(p, "Jack");

        //获取私有方法
        Method secret = clazz.getDeclaredMethod("secret", String.class);//带参数的构造器
        secret.setAccessible(true);
        secret.invoke(p, "你好");//传入参数。
        System.out.println(p);
    }
}
