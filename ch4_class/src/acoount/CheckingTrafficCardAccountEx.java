package acoount;

public class CheckingTrafficCardAccountEx {

    public static void main(String[] args) {
        // CheckingTrafficCardAccount cTrafficCardAccount = new
        // CheckingTrafficCardAccount
        // ("220-11", "홍길동", 100000, "111", true);

        // try {
        // cTrafficCardAccount.payTrafficCard("111", 18000);
        // System.out.println("현재 잔액 " + cTrafficCardAccount.getBalance());
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        CreditLineAccount creditLineAccount = new CreditLineAccount("110-15",
                "김호진",
                10000,
                5000000);

        try {
            creditLineAccount.withdraw(25000000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        BonusPointAccount bonusPointAccount = new BonusPointAccount("110-12",
                "이순신",
                0,
                0);
        bonusPointAccount.depoist(100000);
        System.out.printf("%s 님의 보너스 포인트는 %d",
                bonusPointAccount.getOwner(),
                bonusPointAccount.getBonusPoint());

        // 1) 클래스로 부모로 잡는 방법
        // 2) 인터페이스로 부모로 잡는 방법
        // 3) 추상 클래스로 부모로 잡는 방법
        // 여태껏 한 것은 클래스로 함
    }
}
