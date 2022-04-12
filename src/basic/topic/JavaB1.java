package basic.topic;

import java.io.*;
import java.util.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class JavaB1 {

    public static void main(String[] args) {


        try {
            boolean booleanContains;
            String stringTmp = "";
            int numberA=0;
            String stringA = "我是誰誰";   //新增A字串
            String stringB = "是誰";          //新增B字串
            String stringTest = "abcd123456789";//新增Test字串
            String stringTest2 = " abcd123456789 ";//新增Test2字串

            booleanContains = stringA.contains(stringB);

            System.out.println("a是否包含b字串:" + booleanContains);

            //2.	indexOf(String, int)和indexOf(String)的差別
            numberA = stringA.indexOf("誰");             //在字串裡搜尋指定字串(ch/str)第一次出現的位置。
            System.out.println("numberA:" + numberA);
            numberA = stringTest.indexOf("3", 4);
            System.out.println("numberA:" + numberA);
            //3.	lastIndexOf(String)和indexOf(String)的差別
            numberA = stringA.lastIndexOf("誰");    //在字串裡搜尋指定字串(ch/str)最後一次出現的位置。
            System.out.println("numberA:" + numberA);
            //4.去掉字串前後空白
            stringTmp = stringTest2.trim();
            System.out.println(stringTmp);
            //5.startsWith ,endsWith 確認開始字元是否為設定的變數
            System.out.println(stringA.startsWith("我"));
            System.out.println(stringA.startsWith("是"));
            System.out.println(stringA.startsWith("是", 1));
            System.out.println(stringA.endsWith("誰"));

            // 6.	substring(int)和substring(int,int)的差別
            System.out.println(stringA.substring(0, 2));
            //7.  equals
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}






