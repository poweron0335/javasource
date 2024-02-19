package util;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenEx3 {
    public static void main(String[] args) {
        // 키보드로 문자열을 읽어서 분리하는 프로그램 작성
        // 입력) 아빠/엄마/수연/수희/수정 : /를 기준으로 자르기

        Scanner sc = new Scanner(System.in);
        System.out.println("입력하십시오 : ");
        String str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str, "/");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

    }
}
