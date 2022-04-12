package advanced.topic.test;

import static advanced.topic.JavaA2.intTest;


public class SpecialAccount extends Account implements InterfaceAccount, InterfaceAccount.VipIAccount {

        public SpecialAccount(String name, String number, Integer balance) {
            //特別帳戶
            super(name, number, balance);
        }
        public void addInterest(int intTest) {
            //給予紅利金
            balance=balance+intTest;
        }
        public String toString() { //Override
            // return String.format("Account(%s, %s, %d)",this.name, this.number, this.balance);
            addInterest(intTest) ;
            return String.format("Account(" + super.name+ "," + super.number + "," + super.balance + ")");
        }



    }

