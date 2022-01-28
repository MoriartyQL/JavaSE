package com.learn.JBK8;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class ToUpper implements Function<String,Integer> {

    @Test
    @Override
    public Integer apply(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        //箭头函数
        Function<String, String> function = s->s.toUpperCase();
        String aab = function.apply("aab");
        System.out.println(aab);

        Consumer<String> consumer = c -> {
            System.out.println("hello");
        };
        consumer.accept("hello");

        //实现函数接口的对象，并定义方法，采用函数式表达
        Consumer<String> con = System.out::println;
        con.accept("hello");

        //小括号只能在有一个参数是省略
        Supplier<Integer> stringSupplier = () -> 100;
        System.out.println(stringSupplier.get());

        //断言
        Predicate<String> predicate = p -> p.contains("a");
        System.out.println(predicate.test("abc"));



    }
}



