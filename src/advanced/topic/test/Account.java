package advanced.topic.test;


import static advanced.topic.JavaA2.intTest;

public class Account implements InterfaceAccount {
    /*
    定義一個帳戶包含存款與取款以及顯示剩餘金額功能
    特別帳戶 有帳戶所有的功能，以及新增紅利金功能
     */
    protected String name;
    public String number;
    public Integer balance;


    public Account(String name, String number, Integer balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public Integer getBalance() {
        return balance;
    }

    public String getNumber() {
        return number;
    }

    public void deposit(Integer amount) {

        if (amount <= 0) {
            System.out.println("存入金額不應小於0");
        } else {
            this.balance += amount;
        }
    }


    public void withdraw(Integer amount) {
        if (amount > this.balance) {
            System.out.println("取款金額不應大於存款金額");
        } else {
            this.balance -= amount;
        }
    }

    public String toString() {
        // return String.format("Account(%s, %s, %d)",this.name, this.number, this.balance);

        return String.format("Account(" + this.name + "," + this.number + "," + this.balance + ")");
    }

    public void show() {
        intTest = balance * 1;
        //目前執行父類別的show()
    }

    public void show(int n) { //Overload

        System.out.println(this.number + "," + this.name);

    }

}






