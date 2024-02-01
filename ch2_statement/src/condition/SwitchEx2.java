package condition;

import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {
        // 월 을 입력받아 계절 출력
        // 345 현재 계절은 봄입니다.
        Scanner sc = new Scanner(System.in);
        System.out.println("월 입력 : ");
        int month = sc.nextInt();

        // break : switch 블럭 빠져나가기

        switch (month) {
            case 3: case 4: case 5:
                System.out.println("현재 계절은 봄 입니다.");
                break;
            case 6: case 7: case 8:
                System.out.println("현재 계절은 여름 입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("현재 계절은 가을 입니다.");
                break;
            case 12: case 1: case 2:
                System.out.println("현재 계절은 겨울 입니다.");
                break;
            default:
                System.out.println("월을 확인해 주세요");
                break;
        }


    }
    
}
