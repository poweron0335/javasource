package interfacetest;

public class AccountEx {
    public static void main(String[] args) {
        // 인스턴스 생성 불가
        // Account account = new Account();

        // 왼쪽은 부모 오른쪽은 자식

        Account account = new CheckingAccount();
    }
}
