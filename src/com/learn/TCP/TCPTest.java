package com.learn.TCP;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPTest {

    @Test
    public void test1() throws Exception{
        //客户端
        InetAddress address = InetAddress.getLocalHost();
        Socket socket = new Socket(address, 9090);
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        char[] buffer = new char[100];
        int len;
        while((len = isr.read(buffer)) != -1){
            String str = new String(buffer,0,len);
            System.out.println(str);
        }

        isr.close();
        socket.close();

    }


    @Test
    public void test2() throws Exception{
        //确认服务器
        ServerSocket serverSocket = new ServerSocket(9090);
        Socket socket = serverSocket.accept();

        //输出
        OutputStream os = socket.getOutputStream();
        FileReader fr = new FileReader("C:\\Users\\雪碧\\Desktop\\文件\\快递.txt");
        char[] chars = new char[100];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        int len;
        while((len = fr.read(chars)) != -1){
            bw.write(chars,0,len);
            bw.newLine();  //新开一行
        }
        System.out.println("传输完成");
        fr.close();
        bw.close();
        socket.close();

    }
}
