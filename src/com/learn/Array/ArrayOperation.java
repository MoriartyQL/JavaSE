package com.learn.Array;

import java.util.Arrays;

public class ArrayOperation {

    public static void main(String[] args) {
        String[] arr1 = new String[]{"AA", "CC", "KK", "MM", "DD", "JJ", "GG", "ZZ"};

        //1.数组的复制
        String[] arr2 = new String[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr2[i];
        }

        //2.遍历数组
        System.out.println("遍历arr1");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        //arr1数组的反转
        for (int i = 0; i < arr1.length / 2; i++) {
            String temp = arr1[i];
            arr1[i] = arr1[arr1.length - 1];
            arr1[arr1.length - 1] = temp;
        }

        //遍历arr1
        System.out.println("遍历反转后的arr1");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        //查找
        //线性查找
        String word = "DD";
        int i;
        for (i = 0; i < arr1.length; i++) {
            if (word.equals(arr1[i])) {
                System.out.println("找到了word，索引为" + i);
                break;
            }
        }
        if (i == arr1.length) {
            System.out.println("没找到");
        }

        //二分法查找  数组得先有序
        int[] arr3 = new int[]{2, 3, 6, 8, 10, 15, 24, 38, 46, 78, 99, 102};
        int dest = 6;
        int head = 0;
        int end = arr3.length;
        while (head <= end) {
            if (arr3[(head + end) / 2] == dest) {
                System.out.println("找到了，索引为" + head);
                break;
            } else if (arr3[(head + end) / 2] > dest) {
                end = (head + end) / 2;
                continue;
            } else {
                head = (head + end) / 2;
                continue;
            }
        }
        if(head > end){
            System.out.println("没找到");
        }

        //array 类的方法
        //1.boolean equals(int[] a,int[] b) 判断是否相同 要完全相同
        int [] ar1 = {1,2,3,4,5};
        int [] ar2 = {1,2,3,4,5};
        boolean isEquals = Arrays.equals(ar1,ar2);
        System.out.println(isEquals);

        //2.Strint toString(int[] a)   将数组打出来
        System.out.println(ar1);  //[I@7699a589
        System.out.println(Arrays.toString(ar1));  //[1, 2, 3, 4, 5]

        //3.void fill(int[] a,int val)  //将数组每个元素用val 替换
        Arrays.fill(ar1,10);
        System.out.println(Arrays.toString(ar1));  //[10, 10, 10, 10, 10]

        //4.void sort(int[] a)   //排列数组
        int[] ar3 = new int[]{12,2,3,1,4,26,2,2,6,62,8,6,4};
        Arrays.sort(ar3);  //底层使用快排
        System.out.println(Arrays.toString(ar3));  //[1, 2, 2, 2, 3, 4, 4, 6, 6, 8, 12, 26, 62]

        //5.int binarySearch(int[] a,int key);
        int ar4[] = new int[]{1,2,3,4};
        int index = Arrays.binarySearch(ar4,3);
        System.out.println(index);  //2


    }
}
