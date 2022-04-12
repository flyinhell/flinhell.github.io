package advanced.topic.compare;

import advanced.topic.test.Account;
import java.util.Comparator;

public class CompareName implements Comparator<Account> {
    //用於Collections.sort

    @Override
    public int compare(Account o1, Account o2) {
       // return o1.getName().compareTo(o2.getName()); //由A~Z
        return o2.getName().compareTo(o1.getName()); //由Z到A

    }
}

