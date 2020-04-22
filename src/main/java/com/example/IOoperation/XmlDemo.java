package com.example.IOoperation;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class XmlDemo {
    public static void main(String[] args) {
        try {
            // 创建SAXReader
            SAXReader reader = new SAXReader();
            //从xml文件获取数据
            File file = new File("D:\\TestProject\\JavaLectrue\\src\\main\\resources\\read.xml");
            System.out.println(file.getAbsolutePath());
            Document document = reader.read(new File(file.getAbsolutePath()));
            // 获取根节点 emps
            Element root = document.getRootElement();
            // 查找指定节点名称QName的所有子节点elements
            List<Element> list = root.elements("emp");  //得到所有emp元素
            System.out.println("list==>"+list);

            for (Element element : list) { //循环输出全部emp的相关信息
                System.out.println("element.getName()==>"+element.getName());

                List<Element> list2 = element.elements(); //得到emp元素下的子元素

                for (Element e : list2) {  //遍历emp元素下的子元素
                    System.out.print(e.getName()+":");  //获取子元素名称
                    System.out.print(e.getText()+" ");  //获取子元素的文本值
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
