package advanced.topic;

import advanced.topic.test.Account;
import advanced.topic.test.SpecialAccount;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.io.Console;
import java.util.Scanner;

public class JavaA2 {
    /*
    請自行設定情境以定義2個class及1個interface
    A. private, default, protected, public之屬性及方法。
    B. extends, implements, override, overload
     */


    public static int intTest = 0;
    private static Logger logger1 = Logger.getLogger("logger1");



    public static void main(String[] args) {


        try {
            Account acct = new Account("Java", "001", 100);
            acct.deposit(500); //存款500元
            acct.withdraw(200);//取款200元
            logger1.info(acct);

            logger1.info("-------------------------------");
            SpecialAccount acct2 = new SpecialAccount("Pathon", "002", 100);


            acct2.deposit(500);  //存款500元
            acct2.withdraw(300);    //取款300元
            acct2.show(); //算利息

            logger1.info(acct2); //Override

            acct2.show(002);//Overload
            acct2.addInterest(intTest);
        } catch (Exception e) {
            logger1.error(e.getMessage(),e);
        }


    }

}

