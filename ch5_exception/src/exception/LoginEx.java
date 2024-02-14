package exception;

import java.util.Scanner;

public class LoginEx {
    public static void main(String[] args) {
        // 사용자로부터 아이디와 비밀번호 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Id : ");
        String id = sc.nextLine();
        System.out.println("Input pwd : ");
        String pwd = sc.nextLine();
        // 아이디가 blue와 일치하지 않으면 NoExisitIdException 발생
        // 비밀번호가 12345 와 일치하지 않으면 WrongPasswordException 발생
        try {
            login(id, pwd);
        } catch (NotExisitIDException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }
    }

    public static void login(String id, String pwd) throws NotExisitIDException, WrongPasswordException {
        if (!id.equals("blue")) {
            throw new NotExisitIDException("아이디 확인바람");
        }
        if (!pwd.equals("12345")) {
            throw new WrongPasswordException("비밀번호 확인바람");
        }
    }
}
