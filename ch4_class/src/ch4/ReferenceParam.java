package ch4;

public class ReferenceParam {
    public static void main(String[] args) {
        int[] x = { 10 };  // 배열
        System.out.println("main () : x[0] = " + x[0]);
        change(x); 
        System.out.println("change() 호출 후 ");
        System.out.println("main () : x[0] = " + x[0]);
    }
    public static void change(int[] x)  // int[] x가 (기본형)값을 받느냐 or (참조형)주소를 받느냐 / (참조형)주소를 받으면 원본 수정 가능
    {
        x[0] = 1000;
        System.out.println("change () : x = " + x[0]);
    }
    
}
