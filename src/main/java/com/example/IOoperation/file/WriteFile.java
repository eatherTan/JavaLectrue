package com.example.IOoperation.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFile {
    public static void main(String[] args) {
        File file =new File("D:\\ProjectCode\\sparseArray.txt");
        String data="888";
        try {
            Writer out =new FileWriter(file);
            out.write(data);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
