package com.learn.lambdaTest;

import java.util.ArrayList;

/**
 * @author Cedirc_Adie
 */
public class LambdaTest {

    public static void main(String[] args) {
        //创建对象，实现方法
        Converter converter = Integer::valueOf;
        Integer convert1 = converter.convert("124213");
        System.out.println(convert1);

        Converter con1 = "abc"::indexOf;
        Integer n1 = con1.convert("b");
        System.out.println(n1);

        System.out.println("abc".indexOf("a"));
    }
}


@FunctionalInterface
interface Converter{
    Integer convert(String form);
}
