package com.learn.AbstractTest;

public class TemplateTest {
    public static void main(String[] args) {
        Template t1 = new SubTemplate();
        t1.spendTime();
    }

}


abstract class Template {

    //计算某段代码执行，花费的时间
    public void spendTime() {

        long start = System.currentTimeMillis();

        code();

        long end = System.currentTimeMillis();

        System.out.println("执行code 的时间：" + (end - start));


    }

    //将不确定的部分暴露出去，声明为抽象方法，要求子类重写此方法，方可实例化
    public abstract void code();

}


class SubTemplate extends Template {
    public void code() {
        for (int i = 2; i <= 10000000; i++) {
            boolean f1 = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i%j == 0) {
                    f1 = false;
                    break;
                }
            }
            if (f1) {
                System.out.println(i);
            }
            f1 = true;
        }
    }
}