package com.example.base;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

    public static void main(String[] args) throws ParseException {
//获取当前时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);

        String time="2020-03-12 14:14:14";

//比当前日期小返回-1 	相等返回 0  比当前日期大 返回1
        int a=timeCompare(time,dateString);
        System.out.println(a);
    }

    /*时间比大小*/

    /**
     *  t1 大于 t2 ,就返回大于0
     * @param t1
     * @param t2
     * @return
     * @throws ParseException
     */
    public static int timeCompare(String t1,String t2) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        c1.setTime(formatter.parse(t1));
        c2.setTime(formatter.parse(t2));
        System.out.println(c1.getTime());
        int result = c1.compareTo(c2);
        return result;
    }
}
