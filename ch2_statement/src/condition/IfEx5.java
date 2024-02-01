package condition;

import java.util.Scanner;

public class IfEx5 {
    public static void main(String[] args) {
        // 점수를 입력 받은 후 점수에 따라 출력
        // 당신의 점수는 100점입니다.
        // 당신의 학점은 A+ 입니다.

        // >=90 >= 98 A+  90 >= 점수 >= 94 A0
        // >=80 >= 88 B+  90 >= 점수 >= 94 A0

        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하시오 : ");
        int score = sc.nextInt();


        char grade = ' ', opt = ' ';
        
        if(score >= 90)
        {
            grade = 'A';
            if(score >= 98) 
            {
                opt = '+';
            }
            else if(score < 94)
            {
                opt = '-';
            }
            System.out.println();
        }
        else if (score >= 80) 
        {
            grade = 'B';
            if(score >= 88) 
            {
                opt = '+';
            }
            else if(score < 84)
            {
                opt = '-';
            }
            System.out.println();
        }
        else
        {
            grade = 'C';
        }
        System.out.println("당신의 점수는 " + score + " 입니다.");
        System.out.println("당신의 학점은 " + grade + opt + " 입니다.");
        System.out.printf("당신의 점수는 %d 입니다\n", score);
        System.out.printf("당신의 학점은 %c%c 입니다\n", grade, opt);
    }
    
}
