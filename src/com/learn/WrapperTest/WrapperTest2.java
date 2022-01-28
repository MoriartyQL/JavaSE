package com.learn.WrapperTest;
/*
    基本数据类型---->String  1.使用连接运算  2.使用valueof()
 */


public class WrapperTest2 {
    public static void main(String[] args) {
        //方法一：
        int num = 10;
        String str1 = 10+"";
        System.out.println(str1);


        //方法二：
        String str2 = String.valueOf(num);
        System.out.println(str2);

        Float f1 = 1.23f;
        String str3 = String.valueOf(f1);
        System.out.println(str3);



    }

    public void test1(){
        String str1 = "123";
//        int num = (int)str1;   不行

        //转换方法：
        int num = Integer.parseInt(str1);


    }

}
