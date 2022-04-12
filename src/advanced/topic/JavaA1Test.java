package advanced.topic;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class JavaA1Test {
    private static Logger logger1 = Logger.getLogger("logger1");

    private HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

    public static void main(String[] args) {


        logger1.info("Program JavaA1Test Start...");
        new JavaA1Test();

        logger1.info("Program JavaA1Test End...");
    }

    public JavaA1Test() {
        String str;
        String[] lineworks;
        int oldValue;  //用於hashmap中的value

        try {
            str = " This is a book. That is a pencil.This is good, and that is bad.";
            lineworks = str.trim().split("[^a-zA-Z]+");   //非單詞符
            for (int i = 0; i < lineworks.length; i++) { //用於儲存將words首字母轉成大寫
                lineworks[i] = lineworks[i].substring(0, 1).toUpperCase() + lineworks[i].substring(1);
                //     System.out.println(lineworks[i]);
            }


            for (int i = 0; i < lineworks.length; i++) {
                if (hashMap.containsKey(lineworks[i])) {
                    oldValue = hashMap.get(lineworks[i]);
                    hashMap.put(lineworks[i], oldValue + 1);
                } else {
                    hashMap.put(lineworks[i], 1);
                }
            }
            //System.out.println(hashMap.get("Is"));


            List<Map.Entry<String, Integer>> list_Data =
                    new ArrayList<>(hashMap.entrySet());


            Collections.sort(list_Data, new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> entry1,
                                   Map.Entry<String, Integer> entry2) {
                    return (entry2.getValue() - entry1.getValue());
                }
            });


            for (Map.Entry<String, Integer> entry : list_Data) {
               // System.out.println(entry.getKey() + ":" + hashMap.get(entry.getKey()) + "次");
            }
            String[] id;
            for (int i = 0; i < list_Data.size(); i++) {
               id = list_Data.get(i).toString().split("=");
                System.out.println(id[0]+":"+id[1]+"次");
            }
        } catch (Exception e) {
            logger1.error(e.getMessage(),e);
        }

    }

}
