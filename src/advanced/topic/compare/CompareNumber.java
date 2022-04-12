package advanced.topic.compare;

import advanced.topic.test.Account;

import java.util.Comparator;

public class CompareNumber implements Comparator<Account> {
    //用於Collections.sort

        @Override
        public int compare(Account o1, Account o2) {
            int intAccountNum1 = Integer.parseInt(o1.getNumber());
            int intAccountNum2 = Integer.parseInt(o2.getNumber());

           // return intAccountNum1-intAccountNum2; //由小到大
            return intAccountNum2-intAccountNum1; //由大到小


        }
    }

