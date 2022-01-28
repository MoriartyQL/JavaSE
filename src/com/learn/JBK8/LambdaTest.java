package com.learn.JBK8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class LambdaTest {

    @Test
    public void test1(){
        //正常形式
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };

        run.run();

        System.out.println("********************");
        //lambda表达式
        Runnable r1 = ()-> System.out.println("hello");
        r1.run();
    }

    @Test
    public void test2(){
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        System.out.println(com.compare(12,23));

        System.out.println("***********************");

        //原始
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        //lambda表达式
        Comparator<Integer> com2 = (o1,o2) -> {
            return Integer.compare(o1,o2);
        };

        Comparator<Integer> com3 = (o1,o2) -> Integer.compare(o1,o2);

        //方法引用
        Comparator<Integer> com4 = Integer::compare;



    }

    @Test
    public void test3(){

        Consumer<String> c1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        c1.accept("hello");


        //*****************************

        Consumer<String> c2 = (s) -> System.out.println(s);

        c2.accept("hello");


        Consumer<String> c3 = System.out::println;
        c3.accept("hello");

    }

    @Test
    public void test4(){
        List<Integer> list = Arrays.asList(12,4,1,3,5,7,2,4,6,7,8,6);

        list.stream().sorted(Integer::compare).forEach(System.out::print);


    }

    @Test
    public void test5(){

        List<Person> person = new ArrayList<>();
        person.add(new Person(12,"Jack"));
        person.add(new Person(13,"Tom"));
        person.add(new Person(11,"Colin"));
        person.add(new Person(21,"Knight"));

        person.stream().filter((p) -> p.getAge() > 12 ).forEach(System.out::println);

        List<String> name = person.stream().map(Person::getName).collect(Collectors.toList());

        name.stream().sorted(String::compareTo).forEach(System.out::println);

        System.out.println(person.get(1).getName().contains("T"));


    }



}
