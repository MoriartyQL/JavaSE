package com.learn.StreamTest;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
//        List<String> list = Arrays.asList("a","b","c");
//        String join = String.join("-", list);
//        System.out.println(join);


//        OptionalInt max = new Random().ints(5).peek(System.out::println).max();
//        //避免空指针
//        max.ifPresent(System.out::println);
//
//

        Integer reduce = Stream.of(1, 2, 3, 4, 5).reduce(1, (n1, n2) -> n1 * n2);
        System.out.println(reduce);

        String str1 = Stream.of("a","b","c").collect(Collectors.joining("-"));







    }


}

class Person{
    int age;
    String name;
}
