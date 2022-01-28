package com.learn.Test;

import java.io.*;
import java.util.Scanner;

public class Test {


    @org.junit.jupiter.api.Test
    public void test1() throws Exception{
        File file = new File("hello.txt");
        if(file.createNewFile()) {
            System.out.println("文件创建成功！");
        }

        FileInputStream fis = new FileInputStream("C:\\Users\\雪碧\\Desktop\\文件\\快递.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream(file,true);  //append拓展，在原有的基础上拓展文件。为false是，对于原文件进行覆盖
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int len;
        byte[] buffer = new byte[20];
        while ((len = bis.read(buffer)) != -1){
            bos.write(buffer,0,len);
        }

        bos.close();
        bis.close();



    }
}


class MyTest{


    public static void main(String[] args){
//        y = ax + bx +c

        System.out.println("hello");



//        System.out.println("第一个根："+((-b+d)/2)+"，第二个根："+((-b-d)/2));

    }


    @org.junit.jupiter.api.Test
    public void test4(){
        System.out.println("hello");
    }

    @org.junit.jupiter.api.Test
    public void test1(){

    }





}


