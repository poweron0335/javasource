package operator;

import java.util.Scanner;

public class ConditionEx2 {

    public static void main(String[] args) {
        // 숫자 입력 받은 후 그 숫자가 양수인지 음수인지 판별

        
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하십시오 : ");
        int num = sc.nextInt();
        
        System.out.println(num >= 0 ? "양수" : "음수");

        // 입력 받은 숫자가 짝수 인지 홀수인지 판별
        System.out.println(num % 2 == 0? "짝수" : "홀수");


        char ch1 = 'a';
        // ch1이 영문자(A~Z, a~z)이거나 1~9 사이의 숫자인지 판별 = true

        System.out.println(ch1 >= 65 && ch1 <= 90 || ch1 >= 97 && ch1 <= 115 || ch1 >= 1 && ch1 <= 9 ? "true" : "false" );
    }
    
}
