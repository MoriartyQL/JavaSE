package com.learn.IO.Writer;

import org.junit.jupiter.api.Test;

import java.io.*;

public class WriterTest {


    @Test
    public void OutputStreamTest1() throws IOException {
        File file1 = new File("C:\\Users\\雪碧\\Desktop\\Markdown\\java\\JavaSE_image\\网络协议.png");
        FileInputStream fis = new FileInputStream(file1);
        File file2 = new File("网络协议.png");
        OutputStream fos = new FileOutputStream(file2);
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte[] buffer = new byte[1024];
        int len;
        while((len = bis.read(buffer))!=-1){
            bos.write(buffer,0,len);
        }

        bis.close();
        bos.close();
        System.out.println("OK");


    }
}
