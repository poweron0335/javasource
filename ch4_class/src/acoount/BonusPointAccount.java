package acoount;

// 은행 : Account
// 은행 + 체크카드 : CheckingAccount
// 은행 + 체크카드 + 교통카드 : CheckingTrafficCardAccount
// 은행 + 마이너스 통장
// 은행 + 예금하면 보너스 포인트 (예금액의 0.1%)

public class BonusPointAccount extends Account {

    private int bonusPoint; // 보너스 포인트

    public BonusPointAccount(String accountNo, String owner, int balance, int bonusPoint) {
        super(accountNo, owner, balance);
        this.bonusPoint = bonusPoint;
    }

    // 보너스 포인트 = 예금 + 보너스 0.1%
    @Override
    public void depoist(int amount) {
        this.bonusPoint += (int) (amount * 0.001);

        super.depoist(amount);
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

}
