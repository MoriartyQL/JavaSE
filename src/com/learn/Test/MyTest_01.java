package com.learn.Test;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName: MyTest_01
 * @Description: test
 * @author: Colin
 * @date: 2022/1/16 18:03
 * @Version: 1.0
 */
public class MyTest_01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        MyTest_01 test_01 = new MyTest_01();

        System.out.print("请输入一个数：");
        String str1 = scan.nextLine();
        System.out.print("请输入另一个数：");
        String str2 = scan.nextLine();



        test_01.similarityNumber(str1,str2);

    }


    public void similarityNumber(String str1,String str2){
        int[] a = new int[10];
        int[] b = new int[10];
        int A = Integer.parseInt(str1);
        int B = Integer.parseInt(str2);
        int temp = 0;

        int ex = 0;

        for (int i = 0; i < str1.length(); i++) {
            ex = A%10;
            A = A/10;
            a[ex]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            ex = B%10;
            B = B/10;
            b[ex]++;
        }



        if(Arrays.equals(a,b)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

    public int minSimilarityNumber(int[] b){
        int minNumber = 0;
        int temp = 1;

        for (int i = b.length-1; i >=0 ; i--) {
            if(b[i] != 0){
                minNumber += i*(temp==1?1:10*temp);
                temp =  temp+1;
            }
        }

        return minNumber;
    }

    @Test
    public void test1() {
        MyTest_01 myTest_01 = new MyTest_01();

        int[] b = {2, 3};
        System.out.println(myTest_01.minSimilarityNumber(b));
    }




}
