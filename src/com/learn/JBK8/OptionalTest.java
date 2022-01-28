package com.learn.JBK8;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        User u1 = new User("jack",10);

        Optional<User> o1 = Optional.of(u1);
        u1 = null;

        User u2 = o1.orElse(new User());
        System.out.println(u2.getName());

        User u3 = o1.orElseGet(User::new);
//      User u3 = o1.orElseGet(() -> {
//      return new User();
//      });

        o1.ifPresent(System.out::println);

        User u4 = o1.orElseThrow(() -> {
            return new RuntimeException("hhh");
        });
        System.out.println(u4.getName());


    }

    @Test
    public void test1(){
        String star = null;
        Optional<String> s = Optional.ofNullable(star);
        String other = "Tom";
        String s1 = s.orElse(other);
        System.out.println(s1);
    }

    @Test
    public void test2(){
        String star = null;
        Optional<String> s = Optional.ofNullable(star);
        s.ifPresent(System.out::println);

//        s.ifPresentOrElse();

    }


}


class User{
    int age;
    String name;

    User(){}

    User(String name,int age){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}