package com.example.IOoperation.file;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilter {
    public static void main(String[] args) {
        File file = new File("D:\\xyz");
        String[] names = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".java")){
                    return true;
                }else {
                    return false;
                }
            }
        });
        for (String name : names){
            System.out.println(name);
        }
    }
}
