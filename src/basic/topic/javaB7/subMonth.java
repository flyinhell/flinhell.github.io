package basic.topic.javaB7;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class subMonth {
    public String subMonth(String date) {
        /*
            使用Calendar API 去取得今天往前一個月的日期
         */
        String reStr =null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
            Date dt = sdf.parse(date);
            //新增Calendar物件rightNow
            Calendar rightNow = Calendar.getInstance();
            rightNow.setTime(dt);
            rightNow.add(Calendar.MONTH, -1);


            Date dt1 = rightNow.getTime();
             reStr = sdf.format(dt1);

        } catch (Exception e) {

            e.printStackTrace();
        }
        return reStr;
    }
}
