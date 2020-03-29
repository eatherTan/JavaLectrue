package com.example.IOoperation.file;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class FileSeperator {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/xyz" + File.separator + "hello.txt");
        file.createNewFile();
    }
}
