package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class IOEx {
    public static void main(String[] args) {
        // 사용자에게 입력받기 => q 문자열이 입력되면 종료
        // 파일에 쓰기(사용자에게 입력받은 문자)
        try (Scanner sc = new Scanner(System.in);
                FileWriter fw = new FileWriter("c:\\temp\\output5.txt");
                BufferedWriter bw = new BufferedWriter(fw)) {

            System.out.println("파일에 작성할 데이터를 입력하세요");
            System.out.println("작성을 중단하려면 q 를 입력하세요");
            String str = null;

            do {
                System.out.println(">> ");
                str = sc.nextLine();
                if (!str.equalsIgnoreCase("q")) { // equalsIgnoreCase = 대문자가 들어왔을 경우 인식 되지 못하게
                    bw.write(str);
                    bw.newLine();
                }
            } while (!str.equals("q"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
