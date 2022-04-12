package advanced.topic.sortTest;

import advanced.topic.compare.CompareBalance;
import advanced.topic.test.Account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;



public class SortTest {
     static Logger logger1 = Logger.getLogger("logger1");

    public static void main(String args[]) {
        new SortTest();

        Ball ball = new Ball("football");
        Ball notball = new Ball();

        logger1.info(ball.getName());
        logger1.info(notball.getName());

        Basketball basketball = new Basketball();
        logger1.info(basketball.getName());
        ball.setName("waterball");
        logger1.info(ball.getName());

    }

    public SortTest() {


        Account acct1 = new Account("APPLE", "001", 100);
        Account acct2 = new Account("BEN", "002", 200);
        Account acct3 = new Account("CHIS", "003", 300);
        List<Account> list = new ArrayList<Account>();
        list.add(acct1);
        list.add(acct2);
        list.add(acct3);


        try {
            for (Object a : list) {
                logger1.info(a.toString());
            }

            Collections.sort(list, new CompareBalance());
            //   Collections.sort(list, new CompareName());
            // Collections.sort(list, new CompareNumber());

            System.out.println("Collections.sort.....");

            for (Object a : list) {
                logger1.info(a.toString());
            }
        } catch (Exception e) {
            logger1.info("error");
        }


    }

}

