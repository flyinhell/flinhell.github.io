package basic.topic;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.util.*;


public class JavaB4 {
    public static void main(String[] args) {
        /**
         宣告一個Map型態的變數，並自行放入數個key和value後印出所有的key和value
         */

        try {
            Map<String, Integer> map = new HashMap<String, Integer>();

            map.put("one", 1);   //放入數個key和value
            map.put("two", 2);
            map.put("three", 3);

            for (String key:map.keySet()) { //在Map中取所有的值
            Integer value = map.get(key);
                System.out.println(key+" "+value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        /**
         Iterator<String> iter = map.keySet().iterator();
         while (iter.hasNext()) {
         String key = iter.next();
         Integer value = map.get(key);
         System.out.println(key + " " + value);
         }
         */

    }


}


