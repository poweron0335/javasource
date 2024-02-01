package ch1;

public class SpecialChar {
    public static void main(String[] args) {
        // 탭 == \t , 엔터 == \n ,  \ == 기호들을 표현하기 위해 쓰인다
        
        // 화면 출력
        // System.out.print();
        // System.out.println();
        // System.out.printf();
        System.out.println("성명    주소    전화번호");
        System.out.println("성명\t주소\t전화번호");
        System.out.println();   // 빈칸
        System.out.println("\"Hello\""); // "Hello" 출력
        System.out.println("\'Hello\'"); // 'Hello' 출력
        System.out.println("'Hello'"); // 'Hello' 출력
        System.out.println("재미있는\\자바"); // 재미있는\자바 출력
        System.out.println("\n");
        System.out.println("escape 문자");
        System.out.print("테스트\n");
        System.out.print("테스트");
    }
    

}
