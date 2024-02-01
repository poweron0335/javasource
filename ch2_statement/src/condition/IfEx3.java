package condition;

import java.util.Scanner;

public class IfEx3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력 : ");
        // 점수 입력 받은 후 짝, 홀 출력
        int socore = sc.nextInt();
        
        if(socore % 2 == 0)
        {
            System.out.println("짝");   
        } 
        else
        {
            System.out.println("홀");
        }
    }
    
}
