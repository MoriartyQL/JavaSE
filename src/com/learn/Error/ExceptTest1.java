package com.learn.Error;

/*异常处理的方法：
    1.try.catch.finally
    2.throws + 异常类型

    Java处理的方法：抓抛模型
        1.”抛“:当执行代码是，产生一个异常类型的对象，将其抛出
            抛出后，若没有处理，就不会再向下执行了。

        2.“抓”：异常处理的方式
            ①.try.catch.finally
            ②.throws + 异常类型

 */
public class ExceptTest1 {
    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException  数组角标越界
        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);

            int[][] arr1 = new int[4][];
            System.out.println(arr1[0][0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();   //打印错误栈的信息
        } catch (NullPointerException e) {
            System.out.println("出现空指针.....");
        } catch (Exception e) {   //无法判断的异常
            System.out.println(e.getMessage());
        }
    }
}