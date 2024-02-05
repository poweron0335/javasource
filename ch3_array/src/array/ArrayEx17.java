package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx17 {
    public static void main(String[] args) {
        String [][] words = {
            {"chair", "의자"},
            {"computer", "컴퓨터"},
            {"integer", "정수"}
            
        };

        Scanner sc = new Scanner(System.in);

        // 문자열 비교 == (X)  equals() ==> "name".equals("name")
        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d ) %s의 뜻은?", (i + 1), words[i][0]);   // i + 1 = chair -> computer -> integer 순으로 내려간다는 의미
                                                                                  // words[i][0] = chair 부터 시작
        }
        for (int i = 0; i < words.length; i++) {
           String a = sc.nextLine();     // 문자열 입력 받기 위해 String 변수 생성
           if(words[i][1].equals(a))     // "words의 뜻이 사용자 입력값과 같으면"
           {
            System.out.println("정답입니다");
           }
           else
           {
            System.out.printf("틀렸습니다. 정답은 %s 입니다.", words[i][1]);
           }
        }
    }
    
}
