package exam;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int moneyHave = 0;
   

        while (run) {
            System.out.println("------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("------------------------------------");
            System.out.println("메뉴 선택 >> ");

            int menu = sc.nextInt();


            switch (menu) {
                // 예금액 입력 받은 후 잔액 추가
                case 1:
                System.out.print("예금 할 금액을 입력하십시오 : ");
                int money = sc.nextInt(); // 예금할 금액을 입력받는다
                System.out.println("예금 하신 금액은 " + money );
                moneyHave += money; // 입력받은 금액을 현재 잔액에 더한다.
                System.out.printf("잔액 : %d\n", moneyHave);
                break;
                // 출금액 입력 받은 후 잔액 추가
                case 2:
                System.out.print("출금 할 금액을 입력하십시오 : ");
                money = sc.nextInt(); // 출금할 금액을 입력받는다
                if(money <= moneyHave) // 입력받은 금액이 현재 잔액보다 작거나 같으면 출금 가능
                {
                    moneyHave -= money;
                    System.out.printf("출금 후 잔액 : %d\n", moneyHave);
                }
                else  // 출금이 불가능한 경우 잔액 부족 메시지 출력
                {
                    System.out.println("잔액부족");
                }
                break;
                // 잔액 출력
                case 3:
                System.out.println("잔액 >> " + moneyHave);
                break;
                case 4:
                System.out.println("프로그램 종료");
                run = false;
                    break;
                default:
                    break;
            }
            
        }
    }
    
}
