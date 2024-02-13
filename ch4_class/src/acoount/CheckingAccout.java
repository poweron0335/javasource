package acoount;

// 기존 은행 기능 + 체크 카드 기능
public class CheckingAccout extends Account {
    protected String cardNo; // 하위 클래스에서 접근 가능하도록 한다.

    public CheckingAccout(String accountNo, String owner, int balance, String cardNo) {
        super(accountNo, owner, balance); // 'Account 클래스의 생성자를 호출하여 부모 클래스의 속성들을 초기화합니다.'
        this.cardNo = cardNo; // 'CheckingAccount'클래스 자체의 속성인 'cardNo'를 초기화합니다.
    }
    // 이 클래스의 주요 목적은 'Account' 클래스에서 상속받아 사용하면서
    // 추가적인 기능이나 속성을 'CheckingAccount'에서 정의할 수 있도록 하는 것
    // ==================================================================

    // pay(String cardNo, int amount)
    // cardNo 가 일치하는지 확인, 사용 금액이 잔액보다 적은지 확인
    // 일치하지 않으면 지불불가
    // 일치하고, 금액이 작으면 잔액 - 사용금액

    void pay(String cardNo, int amount) throws Exception { // pay 메서드에서 두 개의 매개변수 'cardNo', 'amount'를 받는다.
        if (!this.cardNo.equals(cardNo)) { // 객체의 this.cardNo 속성과 입력받은 cardNo 매개변수가 일치하지 않는 경우 확인
            throw new Exception("지불불가"); // 카드 번호가 일치하지 않는 경우, 예외를 생성 "지불불가"
        }
        // 잔액 = 잔액(getBalance()) - 사용금액(amount)
        setBalance(getBalance() - amount);
        withdraw(amount);
    }
}
