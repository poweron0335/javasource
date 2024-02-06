package exam;

public class Account {
    // 계좌번호, 계좌주 이름, 잔액
    private String account;
    private String name;
    private int money;

    public Account() {

    }

    public Account(String account, String name, int money) {
        this.account = account;
        this.name = name;
        this.money = money;
    
    }
    // 예금
    public int deposit(int add)
    {
        money += add;
        return money;
    }

    // 출금
    public int withdraw(int subtrack)
    {
        money -= subtrack;
        return money;
    }

    
    
}
