package com.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 1. @description:
 * 2. @author: Dawn
 * 3. @time: 2022/6/9
 */
public class SimpleDate {
//    public void TimeConversion(long time){
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date1 = new Date(time);
//        String res = simpleDateFormat.format(date1);
//        System.out.println("时间戳转时间结果:" + res);
//    }

//    public static void main(String[] args) {
////        long time = System.currentTimeMillis();//获取当前时间精确到毫秒级的时间戳，例：1525849325942
////        System.out.println(time);
////        System.out.println(time);
//        long time = 1654743215000l;
//        System.out.println(timeStamp2Date(time));
//    }
    public static String timeStamp2Date(long time) {
        Long timeLong = Long.parseLong(String.valueOf(time));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//要转换的时间格式
        Date date;
        try {
            date = sdf.parse(sdf.format(timeLong));
            return sdf.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
