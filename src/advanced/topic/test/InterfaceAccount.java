package advanced.topic.test;

public interface InterfaceAccount {

    void deposit(Integer amount);

    void withdraw(Integer amount);

    //介面為一種類別，他只用宣告沒有實作
    //是一個抽象型別（Abstract Type），它被用來要求類別(Class)必須實作指定的方法，
    // 使不同類別的物件可以利用相同的介面進行溝通。

    public interface VipIAccount {

        void addInterest(int interest);

    }

}

