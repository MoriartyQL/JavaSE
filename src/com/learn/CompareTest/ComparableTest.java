package com.learn.CompareTest;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Cedirc_Adie
 */
public class ComparableTest implements Comparable<ComparableTest> {

    String name;
    int age;

    @Override
    public int compareTo(ComparableTest p) {
        return -this.name.compareTo(p.name);
    }

    public ComparableTest(String name,int age){
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "ComparableTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        ComparableTest[] p1 = new ComparableTest[5];
        p1[0] = new ComparableTest("Jack",12);
        p1[1] = new ComparableTest("Tom",13);
        p1[2] = new ComparableTest("Colin",16);
        p1[3] = new ComparableTest("Green",22);
        p1[4] = new ComparableTest("Blank",11);

        for (int i = 0; i < p1.length; i++) {
            System.out.println(p1[i]);
        
        }

        Arrays.sort(p1);

        System.out.println("\n");
        for (int i = 0; i < p1.length; i++) {
            System.out.println(p1[i]);
        }
    }
}


