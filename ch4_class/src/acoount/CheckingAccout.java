package acoount;

// 기존 은행 기능 + 체크 카드 기능
public class CheckingAccout extends Account {
    protected String cardNo;

    public CheckingAccout(String accountNo, String owner, int balance, String cardNo) {
        super(accountNo, owner, balance);
        this.cardNo = cardNo;
    }

    // pay(String cardNo, int amount)
    // cardNo 가 일치하는지 확인, 사용 금액이 잔액보다 적은지 확인
    // 일치하지 않으면 지불불가
    // 일치하고, 금액이 작으면 잔액 - 사용금액

    void pay(String cardNo, int amount) throws Exception {
        if (!this.cardNo.equals(cardNo)) {
            throw new Exception("지불불가");
        }
        // 잔액 = 잔액(getBalance()) - 사용금액(amount)
        setBalance(getBalance() - amount);
        withdraw(amount);
    }
}
