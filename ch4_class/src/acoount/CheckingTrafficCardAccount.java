package acoount;

// 은행 : Account

// 은행 + 체크 카드 : CheckingAccount

// 은행 기본 기능 + 체크 카드 기능 + 교통카드 기능 추가
// 예금, 출금=> 부모(Account가 제공)꺼 쓰면 됨
// 카드 사용금액 지불 => pay()가 넘겨준 부모 CheckingAccount
// 추가해야되는 메소드 => 교통비 지불한다. => payTrafficCard()
public class CheckingTrafficCardAccount extends CheckingAccout {

    private boolean hasTrafficCard;

    public CheckingTrafficCardAccount(
            String accountNo, String owner, int balance, String cardNo, boolean hasTrafficCard) {
        super(accountNo, owner, balance, cardNo);
        this.hasTrafficCard = hasTrafficCard;
    }

    // cardNo, amount, 교통카드 가능 여부
    void payTrafficCard(String cardNo, int amount) throws Exception {
        if (!hasTrafficCard) {
            throw new Exception("교통카드 기능이 없습니다");
        }
        // 교통카드 기능이 존재한다면 cardNo, amount 확인
        pay(cardNo, amount);
    }

}
