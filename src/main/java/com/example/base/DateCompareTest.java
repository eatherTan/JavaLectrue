package com.example.base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCompareTest {

    public static void main(String[] args) throws ParseException {
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
//
//        String strNow = format.format(new Date());
//        Date now = format.parse(strNow);
//        System.out.println(now);
//
//        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
//        String stringDate = "2020-03-18 ";  //Date时间，格式：Sun Jan 12 11:15:31 CST 2020
//        Date date = (Date) format1.parse(stringDate);
//        System.out.println(date);
//
//        System.out.println(date.compareTo(now));

//        System.out.println("------------");
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String stringDate = "2020-03-11 12:12:11";
//        Date date = (Date) format.parse(stringDate);  //yyyy-mm-dd格式的Date
//        Date time = new Date();
//
//        long timeStamp1 = date.getTime();
//        long timeStamp2 = date.getTime();
//        System.out.println(timeStamp1);
//        System.out.println(timeStamp1 > timeStamp2);

//        System.out.println("------------");
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String stringDate = "2020-03-11 12:12:11";
        Date date = (Date) format.parse(stringDate);
        Date time = new Date();

        System.out.println(date.after(time));
        System.out.println(date.before(time));
    }
}
