package advanced.topic;

import java.util.*;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class JavaA1 {
    private static Logger logger2 = Logger.getLogger("logger2");
    /*
    假設一個String中，存放的是一篇英文文章，請統計出此篇文章中每個單字出現的頻率
    (不區分大小寫，不統計標點符號，文章中會出現的標點符號只有: 「,」、「.」及空白符號)，
    最後依出現頻率由大到小的順序列印出來。輸出單字時，第一個字母大寫，之後小寫，
    例如：String str=” This is a book. That is a pencil.This is good, and that is bad.”
     */

    public static void main(String[] args) {
        // PropertyConfigurator.configure("C:\\Users\\zhenfuliao\\IdeaProjects\\Project_2\\src\\advanced\\topic\\Log4j_A1.properties");

        logger2.info("Program JavaA1 Start...");
         new JavaA1();
        logger2.info("Program JavaA1 End...");
    }

    public JavaA1() {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        String str = " This is a book. That is a pencil.This is good, and that is bad.";
        String[] lineworks = str.trim().split("[^a-zA-Z]+");   //非單詞符

        for (String linework:lineworks) { //用於儲存將words首字母轉成大寫

            linework = linework.substring(0, 1).toUpperCase() + linework.substring(1);

        }


        Set<String> wordSet = hashMap.keySet();
       // System.out.println(wordSet);
        for (int i = 0; i < lineworks.length; i++) {

            if (wordSet.contains(lineworks[i])) {
                Integer number = hashMap.get(lineworks[i]);
                number++;
                hashMap.put(lineworks[i], number);
            } else {
                hashMap.put(lineworks[i], 1);
            }
        }

        List<Map.Entry<String, Integer>> list_Data =
                new ArrayList<Map.Entry<String, Integer>>(hashMap.entrySet());


        Collections.sort(list_Data, new Comparator<Map.Entry<String, Integer>>() {
                    public int compare(Map.Entry<String, Integer> entry1,
                                       Map.Entry<String, Integer> entry2) {
                        return (entry2.getValue() - entry1.getValue());  //依照Value 做排序(由大到小)
                       // return (entry1.getKey().compareTo(entry2.getKey()));   //依照KEY做正向排序(由a到z)
                    }
                }
        );
        for (Map.Entry<String, Integer> entry : list_Data) {
            System.out.println(entry.getKey() + ":" + entry.getValue() + "次");
        }



    }




}
