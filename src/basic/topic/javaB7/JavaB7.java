package basic.topic.javaB7;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.text.*;
import java.util.*;

import basic.topic.javaB7.subMonth;


public class JavaB7 {
    public static void main(String[] args) {
/**
 * 請建立一個代表2003/11/10 20:00:00的Calendar物件，並印出其自1970年1月1日經過的milli-seconds。
 */
        int millis;

        Calendar cal = Calendar.getInstance();
        Calendar calendar = new GregorianCalendar();
        cal.set(2003, 10, 10, 20, 00, 00); //月份從0開始,尾數不同是因為沒設置微秒

        cal.setTimeInMillis(50);//設置calander毫秒

        calendar.set(2003, 10, 10, 20, 00, 00);
        //System.out.println(cal);
        System.out.println("毫秒：" + calendar.get(Calendar.MILLISECOND));
        System.out.println(cal.getTimeInMillis());
        Date dt1 = cal.getTime();
        System.out.println(dt1);
        System.out.println(dt1.getTime());
        SimpleDateFormat newDateFormatter = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss.SSS");
        String date4 = newDateFormatter.format(dt1);
        System.out.println("date4:" + date4);


        //cal.clear(cal.MILLISECOND);  //將毫秒的部分無條件捨去
        cal.add(cal.MILLISECOND, 20); //毫秒數加20毫秒
        millis = cal.get(cal.MILLISECOND);
        System.out.println("millis:" + millis);

        //印出其自1970年1月1日經過的milli-seconds

        SimpleDateFormat dateFormatter = null;
        try {
            String inputTime2 = "2003/11/10 20:00:00";
            dateFormatter = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
            Date date3 = dateFormatter.parse(inputTime2);
            System.out.println(date3);
            long diff = date3.getTime();
            System.out.println("milli-seconds: " + diff);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //取得今天往前一個月的日期
        Date newTime = new Date();
        String formatDate = dateFormatter.format(newTime); //取得現在時間的字串
        subMonth month = new subMonth();
        String dateStr = month.subMonth(formatDate);
        System.out.println("Date of the previous month:" + dateStr);

    }


}