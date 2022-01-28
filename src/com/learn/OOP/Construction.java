package com.learn.OOP;
/*
    类的成员之三：构造器(构造方法，Constructor)的使用
        1.作用：创建类的对象

        2.说明：
            ①当我们在类中没有显示的定义的构造器时，系统会默认提供一个空参的构造器
            ②构造器的定义格式：限制修饰符 类名 (形参列表){}
            ③当我们声明了一个构造器，系统就不再提供默认的空参构造器
        3.可以通过构造器给类中属性赋值，也可以通过set函数给属性赋值
            赋值的先后顺序：
                默认 - 显示赋值 - 构造器赋值 - 通过对象.属性 或 对象.方法 的方式，对属性赋值
                    显示赋值：如在类中定义 int i = 1;

 */
public class Construction {
    public static void main(String[] args){

        PlayGame play = new PlayGame("王者");

    }

}

class PlayGame{
    String gameName;
    int gameTime;

    public PlayGame(){
        System.out.println("Which game did you want to play");
    }

    public PlayGame(String l){
        gameName = l;
        System.out.println("I'd like to pley"+gameName);
    }
}
