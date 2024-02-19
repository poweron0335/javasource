package util;

import java.util.Scanner;

// java.lang
// java.util

// java.util.Scanner : 화면, 파일, 문자열과 같은 입력소스로부터 문자 데이터 읽어오기
// System.in : 키보드
// System.out : 화면
public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] argArr = null;

        while (true) {
            String prompt = ">>";
            System.out.println(prompt);

            String input = sc.nextLine();

            input = input.trim(); // 공백제거
            // 정규식(Regular expression) : regExp
            argArr = input.split(" +"); // 공백+ => (공백이 최소 1~무제한)

            String command = argArr[0].trim(); // 배열 중에 좌우 공백이 있으면 자르고 가져와라

            if ("".equals(command)) // 아무것도 없으면 계속 진행
                continue;

            command = command.toLowerCase(); // 소문자로 바꾸는 거

            if (command.equals("q")) {
                System.exit(0); // q를 입력하면 강제종료
            } else {
                for (int i = 0; i < argArr.length; i++) {
                    System.out.println(argArr[i]);
                }
            }
        }
    }
}
