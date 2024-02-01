package condition;

import java.util.Scanner;

public class IfEx7 {
    public static void main(String[] args) {
        // 월 을 입력받아 계절 출력
        // 345 현재 계절은 봄입니다.
        Scanner sc = new Scanner(System.in);
        System.out.println("월 입력 : ");
        int month = sc.nextInt();

        // break : switch 블럭 빠져나가기

        // if(month == 3 || month == 4 || month == 5)
        // {
        //     System.out.println("현재 계절은 봄입니다.");
        // }
        // else if(month == 6 || month == 7 || month == 8)
        // {
        //     System.out.println("현재 계절은 봄입니다.");
        // }
        // else if(month == 9 || month == 10 || month == 11)
        // {
        //     System.out.println("현재 계절은 가을입니다.");
        // }
        // else if(month == 12 || month == 1 || month == 2)
        // {
        // System.out.println("현재 계절은 겨울입니다.");
        // }
        // else
        // {
        //     System.out.println("월을 확인해주세요");
        // }

        if(month >= 3 && month < 6)
        {
            System.out.println("현재 계절은 봄입니다.");
        }
        else if(month > 6 && month <= 8)
        {
            System.out.println("현재 계절은 봄입니다.");
        }
        else if(month >= 9 && month < 12)
        {
            System.out.println("현재 계절은 가을입니다.");
        }
        else if(month > 12)
        {
            System.out.println("월을 확인해주세요");
        }
        else   
        System.out.println("현재 계절은 겨울입니다.");
    }
    
}
