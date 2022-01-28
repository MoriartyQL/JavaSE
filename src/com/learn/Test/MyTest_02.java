package com.learn.Test;

import java.util.Arrays;

/**
 * @ClassName: MyTest_02
 * @Description: test2
 * @author: Colin
 * @date: 2022/1/16 18:12
 * @Version: 1.0
 */
public class MyTest_02 {

    public static void main(String[] args) {
        int[] a = new int[2];
        int[] b = new int[2];

        a[1] = 2;
        b[1] = 2;
        a[0] = 3;
        b[0] = 3;

        System.out.println(b.length);

        System.out.println(Arrays.equals(a, b));

    }

}
