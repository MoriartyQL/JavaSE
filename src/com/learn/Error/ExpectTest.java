package com.learn.Error;
/*
    java.lang.Throwable:
        |---java.lang.Error:错误
        |---java.lang.Exception:异常，需要处理
            |---编译时出现异常(checked异常)：在执行javac.exe时可能出现的问题
                FileNotFoundException
                IOException
            |---运行时出现的异常(RuntimeException、unchecked异常)：在执行java.exe时可能出现的异常
    Exception：其它因编写错误或偶然的外在因数导致的一般性问题，可以使用针对性的代码进行处理
 */


import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

public class ExpectTest {
    public static void main(String[] args) {

       /* //编译时异常
        File file = new File("hello.txt");   //FileNotFoundException
        FileInputStream fis = new FileInputStream(file);

        byte[] buffer = new byte[1024];
        int len;
        while((len = fis.read(buffer)) != -1){
            String str = new String(buffer,0,len);
            System.out.print(str);
        }

        fis.close();*/




/*
        ArrayIndexOutOfBoundsException  数组角标越界
        int[] arr = new int[10];
        System.out.println(arr[10]);

        NullPointerException   空指针
        int[][] arr1 = new int[4][];
        System.out.println(arr1[0][0]);

        ClassCastException   //类转换异常 一般在类转化前面加上if(args instanceof 类型) 判断是否能够转化
        Object obj = new Date();
        String str = (String)obj;


        NumberFormatException   //数字形式异常
        String str = "123a";
        int num = Integer.parseInt(str);

        ArithmeticException   //算术异常
        int i = 1;
        int j = 0;
        double b = i/j;
*/
    }

}
