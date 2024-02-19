package util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MapEx2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234"); // 중복 저장 안 되고 키가 중복이면 나중 값이 저장됨 ("asdf" "1234")

        Set<String> keys = map.keySet();
        System.out.println(keys);

        Collection<String> values = map.values();
        System.out.println(values);

        Scanner sc = new Scanner(System.in);

        // 아이디와 비밀번호를 입력 받아서 Map 에 들어 있는지 확인
        while (true) {
            System.out.println("아이디와 비밀번호를 입력하세요");
            System.out.print("아이디 : ");
            String id = sc.nextLine().trim();
            System.out.println("비밀번호 : ");
            String passward = sc.nextLine().trim();

            // 키 값 중 아이디와 일치하는지 확인
            if (!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해 주세요");
                continue;
            } else {
                // value 값 중 비밀번호가 일치하는지 확인
                if (!map.containsValue(passward)) {
                    System.out.println("입력하신 passward는 존재하지 않습니다. 다시 입력해 주세요");
                    continue;
                }
            }
            System.out.println("아이디와 비밀번호는 일치합니다.");
            break;
        }
    }
}
