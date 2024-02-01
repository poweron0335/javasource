package operator;

public class CompareEx1 {
    // 비교 연산자 결과는 true or false 로 나옴
    public static void main(String[] args) {
        int num1 = 10, num2 = 10;

        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println(num1 <= num2);

        System.out.println();

        char ch1 = 'A', ch2 = 'B';
        System.out.println(ch1 == ch2); // 65 == 66
        System.out.println(ch1 != ch2);
        System.out.println(ch1 <= ch2);

        float f1 = 0.1f;
        double d1 = 0.1d;

         // %b : boolean 형태로 출력
        System.out.printf("f1 == d1 = %b\n", f1 == d1);
        System.out.printf("f1 == d1 = %b\n", f1 == (float)d1); // 강제형변환하면 true가 됨
    }
    
}
