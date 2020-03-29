package com.example.IOoperation.file;

import java.io.File;
import java.io.IOException;

public class FileCreateTest {
    public static void main(String[] args) throws IOException {
        File file = new File("D:");
        File file1 = new File(file,"xyz/test.txt");
        //1.创建文件,文件所在的目录一定是要存在的才不会报错
        file1.createNewFile();
        File file2 =  new File("D:/xyz/hello");
        //2.创建文件夹:如果前面的文件夹都不存在，则会一起创建
        file2.mkdirs();
        //3.遍历文件和文件夹（只会列出当前文件夹层级的，不会列出文件夹的子文件内容）
        File file3 = new File("D:/FautoTest");
//        File[] files = file3.listFiles();  与上面的语句效果相似
        String[] names = file3.list();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println();
        //4. 获取File数组，遍历File
        File[] files = file3.listFiles();
        for (File f : files){
            System.out.println(f.getName());
        }
        System.out.println("系统默认编码：" + System.getProperty("file.encoding"));
    }
}
