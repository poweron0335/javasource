package exam;

import java.util.Scanner;

public class PayOfHours {
    public static void main(String[] args) {
        // 근무 시간 입력 받은 후
        // 시간 당 9800
        // 8 시간이 넘어가는 시간은 원래 받는 금액의 1.5배
        // 오늘 받는 임금은 15000입니다. <= 출력 결과값
        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력하십시오 : ");
        int hour = sc.nextInt();
        int pay = hour * 9800;
        double overpay = pay * 1.5;

        if(hour >= 1 && hour <= 8)
        {
            System.out.printf("오늘 받는 임금은 %d\n", pay);
        }
        else
        {
            System.out.printf("오늘 받는 임금은 %d\n", (int)overpay);
        }
        // int pay = 0, rate = 9800;
        // if(hour > 8)
        // {
        //     pay = (int) ((hour - 8) * rate * 1.5) + (rate * 8);
        // }
        // else
        // {
        //     pay = hour * rate;
        // }
        // System.out.println("오늘 받은 임금은 " + pay);
    }
}
