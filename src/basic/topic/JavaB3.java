package basic.topic;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.util.*;

public class JavaB3 {

    public static void main(String[] args) {
        /*
        寫出在一個HashMap放入以下key及對應的value的程式
         */
        try {
            Map<String, Integer> map = new HashMap<String, Integer>();

            map.put("one", 1);
            map.put("two", 2);
            map.put("three", 3);

            System.out.println(map.get("two"));
            System.out.println(map.get("four"));
            boolean flag;

            flag = map.containsKey("one");
            System.out.println(flag);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

