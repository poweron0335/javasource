package lang;

public class StringEx3 {
    public static void main(String[] args) {
        String str1 = "Hello!! Java";

        char[] ch = new char[str1.length()];

        for (int i = 0; i < ch.length; i++) {
            ch[i] = str1.charAt(i);
        }
        System.out.println(ch);

        String str2 = "자바 프로그래밍";
        // '프' 문자가 존재한다면 들어있음 or 없음
        if (str2.contains("프")) {
            System.out.println("들어있음");
        } else {
            System.out.println("없음");
        }

        System.out.println(str2.contains("프") ? " 들어있음 " : " 없음 ");
    }
}
