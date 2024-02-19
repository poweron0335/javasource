package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ArrayListEx3 {
    public static void main(String[] args) {
        // Member 사용자 입력 받아사 ArrayList 구현

        List<Member> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("아이디 >>> ");
            String id = sc.nextLine();
            System.out.println("이름 >>> ");
            String name = sc.nextLine();

            Member member = new Member();
            member.setId(id);
            member.setName(name);

            list.add(member);
        }
    }
}
