package com.learn.Error;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsTest {
    public static void main(String[] args) {
        methods2();

    }

    public static void methods2(){
        try {
            methods1();
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void methods1()throws FileNotFoundException,IOException{
        methods();
    }

    public static void methods() throws FileNotFoundException,IOException{
                //编译时异常
        File file = new File("hello.txt");   //FileNotFoundException
        FileInputStream fis = new FileInputStream(file);

        byte[] buffer = new byte[1024];
        int len;
        while((len = fis.read(buffer)) != -1){
            String str = new String(buffer,0,len);
            System.out.print(str);
        }

        fis.close();
    }
}
