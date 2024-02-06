package exam;

public class AcoountEx {
    public static void main(String[] args) {
        Account account = new Account("123-123-123", "홍길동", 100000);

        account.withdraw(50000);
        int moneyDeposit = account.deposit(100000);
        System.out.println("현재 잔액 : " + moneyDeposit);
        
    }
    
}
