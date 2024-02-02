package exam;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int money = 0;
        int moneyHave = 0;
   

        while (run) {
            System.out.println("------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("------------------------------------");
            System.out.println("메뉴 선택 >> ");

            int menu = sc.nextInt();


            switch (menu) {
                case 1:
                System.out.print("예금 할 금액을 입력하십시오 : ");
                money = sc.nextInt();
                System.out.println("예금 하신 금액은 " + money );
                money += moneyHave;
                System.out.printf("%d = %d\n",money, moneyHave ); 
                // 예금액 입력 받은 후 잔액 추가
                break;
                case 2:
                System.out.print("출금 할 금액을 입력하십시오 : ");
                moneyHave -= sc.nextInt();
                // 출급액 입력 받은 후 잔액 추가
                break;
                case 3:
                System.out.println("잔액 >> " + moneyHave);
                // 잔액 출력
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
