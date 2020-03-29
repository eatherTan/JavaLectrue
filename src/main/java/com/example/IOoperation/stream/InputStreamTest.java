package com.example.IOoperation.stream;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamTest {

    public static void main(String[] args) throws IOException {
        //1-打开文件
        FileInputStream fileInputStream = new FileInputStream("D:\\xyz\\hello.txt");
        //定义一个字节数组，长度自定义
        byte[] buffer = new byte[200];
        //实际读取字节的长度
        int length = 0;
        //2-当more information时
        //3-读取信息
        //当读取的字节长度不等于-1时，继续读取；当读取的字节长度等于-1时，说明文件内容已读取完毕
        while (-1 != (length = fileInputStream.read(buffer, 0, 200))){
            //把字节转化成字符
            String str = new String(buffer, 0, length);
            System.out.println(str);
        }
        //4-关闭流
        fileInputStream.close();
    }
}
