package com.learn.MainTest;
/*
    main() 总结
    1.main() 是程序的入口
    2.main() 也可以作为类中普通的静态方法
    3.main() 也可以作为从键盘获取数据的一种方法 (之前使用Scanner)
 */

public class MainTest {
    public static void main(String[] args) {
        String info = show();
        System.out.println(info);


        System.out.println(args.length);
    }

    public static String show(){
        return "hello";
    }


    
}
