package exception;

public class Account {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // new Exception() : 컴파일 예외
    // new RuntimException() : 런타임 예외
    public void withdraw(int money) throws BalaceInsufficientException {
        if (balance < money) {
            throw new BalaceInsufficientException("잔액 부족");
        }
    }
}
