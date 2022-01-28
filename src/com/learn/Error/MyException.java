package com.learn.Error;

public class MyException extends RuntimeException{
    //提供一个序列版本号：serialVersionUID，用于唯一标识当前的类
    static final long serialVersionUID = -7034897190745766939L;

    public MyException(){

    }

    public MyException(String massage){
        super(massage);
    }
}
