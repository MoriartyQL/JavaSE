package com.learn.Error;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionOverWriteTest {

}

class SuperClass{
    public void method1() throws IOException{

    }

    public void method2(){

    }
}

class SubClass extends SuperClass{


    //子类重写的方法的throws 的异常类型必须是父类 throws 的异常类的子类。
    @Override
    public void method1() throws FileNotFoundException{

    }

    @Override
    public void method2(){

    }
}
