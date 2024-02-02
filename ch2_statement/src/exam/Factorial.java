package exam;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // 숫자 입력 받은 후 입력받은 숫자의 n! 계산
        // 6 => 6! => 6 * 5 * 4 * 3 * 2 ....

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하십시오 : ");
        int num = sc.nextInt();
        int num1 = 1;

        for(int i = 1; i <= num; i++)
        {
            num1 *= i;
        }
        System.out.printf("%d! = %d\n", num, num1);
    }
    
}
