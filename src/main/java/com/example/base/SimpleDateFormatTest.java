package com.example.base;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        SimpleDateFormat format3 = new SimpleDateFormat("yyyy年MM月dd日 一年中的第 D 天 一年中第w个星期 一月中第W个星期");
        System.out.println(format1.format(now));
        System.out.println(format2.format(now));
        System.out.println(format3.format(now));
    }
}
