package exam;

import java.util.Scanner;

public class BankApp {

    static Scanner sc = new Scanner(System.in);
    static Account accArr[] = new Account[100];

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("-----------------------------------------------------");
            System.out.println("메뉴 선택 >> ");

            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    break;

                default:
                    break;
            }
        }
    }

    static void createAccount() {
        System.out.println("Input Account : ");
        String account = sc.nextLine();
        System.out.println("Input Name");
        String name = sc.nextLine();
        System.out.println("Input money :");
        int money = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < accArr.length; i++) {
            if (accArr[i] == null) {
                accArr[i] = new Account(account, name, money);
                System.out.println("계좌가 생성되었습니다.");
                break;
            }
        }
    }

    static void accountList() {
        for (Account account : accArr) {
            if (account != null) {
                System.out.println(account);
            }

        }
    }

    // 예금하다
    static void deposit() {
        // 계좌번호
        // 예금액
        System.out.println("계좌번호를 입력하십시오 ");
        String accountNo = sc.nextLine();
        System.out.println("예금하실 금액 : ");
        int amount = Integer.parseInt(sc.nextLine());

        // 배열에서 입력받은 계좌번호와 일치한 배열요소 찾기
        Account account = findAccount(accountNo); // account로 return 받았기 때문에 Account 타입 선언
        // 찾은 요소 예금 + 잔액
        if (account != null) { // findAccount 클래스에서 null 값이 넘어올 수 있으니 null 값이 아니면 이라는 조건을 추가
            System.out.println("현재 잔액 :" + account.deposit(amount));
        }
    }

    // 출금하다
    static void withdraw() {
        System.out.println("계좌번호를 입력하십시오 ");
        String accountNo = sc.nextLine();
        System.out.println("출금하실 금액 : ");
        int amount = Integer.parseInt(sc.nextLine());
        // 배열에서 입력받은 계좌번호와 일치한 배열요소 찾기
        Account account = findAccount(accountNo);
        // 찾은 요소 출금 + 잔액
        if (account != null) // findAccount 클래스에서 null 값이 넘어올 수 있으니 null 값이 아니면 이라는 조건을 추가
        {
            System.out.println("현재 잔액 :" + account.withdraw(amount));
        }
    }

    static Account findAccount(String accountNo) {
        for (Account account : accArr) { // accArr 에 있는 각 Account 객체에 대해 반복한다.
            if (account != null) // account 객체가 null 이 아닌지 확인
            {
                if (account.getAccountNo().equals(accountNo)) { // account 객체의 계좌번호와 입력받은 accountNo이 일치한지 확인
                                                                // getAccountNo() 메소드는 Account 클래스의 메소드로 해당 계좌의 계좌번호를
                                                                // 반환하는 역할
                    return account; // 계좌번호를 찾았을 경우 해당 account 객체를 반환하고 메소드 종료
                }
            }
        }
        return null; // 반복이 끝날 때까지 일치하는 계좌가 없으면 null을 반환
    }
}
