package basic.topic;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.io.IOException;

public class JavaB6 {


    public static void main(String[] args) {
/**
 * 在命令列給的參數值為112 , console印出來的值 122
 */

       // if (args.length == 0) {   //設定arguments若為空，則顯示args = null
            System.out.println("args = null");
        //} else {

            try {   //將程式帶入的arguments轉成Integer後加10
                int i = Integer.parseInt(args[0]);
                i = i + 10;
                System.out.println(i);
            } catch (Exception e) {
                e.printStackTrace();
                // System.out.println("參數不為數字");

            }
        }
    }
