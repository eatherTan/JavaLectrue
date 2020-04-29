package com.example.IOoperation.stream;

import java.io.*;

public class DataStream1 {
    public static void main(String[] args) throws IOException {
        //二进制文件
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream("data.txt")));

        byte b = 3;
        int i = 12;
        char ch = 'a';
        float f = 3.3f;

        dos.writeByte(b);
        dos.writeChar(ch);
        dos.writeInt(i);
        dos.writeFloat(f);
        //注：这里写入的是入：writeByte 写入的不止是数据，还有类型byte
        dos.close();

        DataInputStream dis = new DataInputStream(new BufferedInputStream(
                new FileInputStream("data.txt")));

        //写入的数据顺序是什么，那么读数据的时候顺序也要一样。因为每种数据类型占用的字节是不同的
        System.out.println(dis.readByte());
        System.out.println(dis.readInt());
        System.out.println(dis.readChar());
        System.out.println(dis.readFloat());
    }
}
