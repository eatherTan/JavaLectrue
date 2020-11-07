package com.serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableTest {
    public static void main(String[] args) {
        write();
    }

    public static void write(){
        try {
            User user1 = new User();
            user1.setUserId("123");
            user1.setUserName("巧克力");
            user1.setAge(20);
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("D:\\hello.txt"));
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read(){

    }
}
