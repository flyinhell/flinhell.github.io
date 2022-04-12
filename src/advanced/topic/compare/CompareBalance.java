package advanced.topic.compare;

import advanced.topic.test.Account;

import java.util.Comparator;

public class CompareBalance implements Comparator<Account> {

    //用於Collections.sort

    public int compare(Account o1, Account o2) {
       
        return o2.getBalance()-o1.getBalance();  //由大到小
        // return o1.getBalance()-o2.getBalance();

    }


}
