package basic.topic;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.text.*;
import java.util.*;

/**
 * 2019-10-25 10:09:00.860
 */

public class JavaB5 {
    public static void main(String[] args) {

        /**
         * 使用SimpleDateFormat，將執行當下的時間印在Console
         */
        try {
            Date newTime = new Date();
            SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd hh:mm.ss.sss");
            String formatDate = dateFormatter.format(newTime);

            System.out.println(formatDate);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}