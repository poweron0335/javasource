package interfacetest;

// interface

// 모든 멤버 변수는 public static final 이어야 함
// 모든 멤버 메소드는 public abstract 임(abstract 생략 가능)
// 추상화가 높은 상태(기본 설계도)
// body 를 가진 메소드는 static, default 만 가능(1.8 버전부터 추가된 내용)
// 여러 개 구현 가능
// public class Bonus implements Account, CheckingAccount   단,  Account, CheckingAccount가 interface라면 가능
// public class Bonus extends CreditLine  implements Account, CheckingAccount

public interface Account {
    // only public, static & final
    // private String accountNo; 멤버변수 선언 불가

    public static final int SPADE = 4; // 상수 만 가능

    // Abstract methods do not specify a body
    public void deposit();

    static void getCardKind() {
    } // 앞에 static이 붙어 있거나

    default void getCard() {
    } // 앞에 default가 붙어 있으면 {}(바디)를 가진 메소드 사용가능
}
