//array 数组   引用数据类型
package com.learn.Array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

//一维数组
public class ArrayBase {

    public static void main(String[] args) {
        int num = 10;
        String str = "hello";
        //1.数组的定义  数据类型[] 数组名

        //①静态初始化：
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        double[] prices = {12.3, 32.4, 54.3, 34.2};   //类型推断

        //动态初始化    new String[x]  长度为x
        //数组变量的初始化与数组元素的赋值分开进行。
        String[] foods = new String[5];

        //2.数组元素的调用
        foods[0] = "宫保鸡丁";
        System.out.println(foods[0]);

        //3.数组的属性：length;
        System.out.println(nums.length);
        System.out.println(foods.length);
//        boolean[] flags;   未初始化
//        System.out.println(flags.length);
        //4.数组的遍历
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println("");

        //5.数组元素的默认初始化类型
        //5.1整形 初始值为0
        int[] arr1 = new int[3];
        System.out.println(arr1[0]);  //0

        double[] arr2 = new double[3];
        System.out.println(arr2[0]);   //0.0

        char[] arr3 = new char[3];
        System.out.println(arr3[2]);   //为空

        boolean[] arr4 = new boolean[3];
        System.out.println(arr4[0]);  //false

        //引用数据类型的默认初始化值为null
        String[] arr5 = new String[5];
        System.out.println(arr5[0]);    //null

        //二维数组
        //1.二维数组的声明和初始化
        int[] arr6 = new int[]{1, 2, 3};  //一维
        //二维数组的静态初始化
        int[][] arr7 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //动态初始化1
        int[][] arr8 = new int[4][3];
        //动态初始化2 //可以用变量定义二维空间大小
        int[][] arr9 = new int[4][];
        arr9[0] = new int[4];
        arr9[1] = new int[3];
        arr9[2] = new int[]{2, 3, 4, 5};
        arr9[3] = new int[1];


        //数组的调用
        System.out.println(arr9[2][2]);

        //二维数组的属性 length
        System.out.println(arr9.length);   //4
        System.out.println(arr9[1].length); //3

        //4.数组的遍历
        for (int[] ints : arr9) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println("");
        }

        //数组的默认初始值
        //arr9[] 外层元素存储内层数组的地址  若内层数组没有初始化则arr[3][] = null
        System.out.println(arr9[0]); //[I@776ec8df    @前为数据类型，@后为地址
        System.out.println(arr9[1]); //[I@4eec7777
        System.out.println(arr9[2]); //[I@3b07d329
        System.out.println(arr9[3]); //[I@41629346

//        int[][] arr10 = new int[3][];
//        arr10 =arr9;
        int[][] arr10;
        arr10 = arr9;  //将arr9的地址给arr10;类似于两个指针，指向同一个地方


    }


    @Test
    public void arrTest(){

        int[] arrn = new int[]{1,2,3,4,5,6,2};
        for(int i : arrn){
            System.out.print(i);
        }
        System.out.println("\n");

        //通过流来实现数组的遍历，使代码更加优雅
        Arrays.stream(arrn).forEach(System.out::print);
    }
}
