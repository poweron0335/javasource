package ch1;

// 변수의 유효범위
// local(지역) 변수 : {} 안에서만 유효함 / 초기화를 하고 사용함
// 변수 선언의 개념이 있고, 값을 할당하는 개념(초기화)이 있다
public class VarScopeEx1 {
    public static void main(String[] args) {
        // int v2 = 30;
        int v2;
        v2 = 30;
        int v3;
        // int v4;
        {
            int v1 = 15;
            v3 = v1 + v2;
            System.out.println("v1 = " + v1);
            System.out.println("v3 = " + v3);
        }
        // System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);
        // The local variable v4 may not have been initializedJava(로컬변수 v4 가 초기화되지 않았음)
        // System.out.println("v4 = " + v4);
    }
    
    void print() {
        // main 메소드 안에 선언된 변서룰 사용할 수 있을까?
        // System.out.println(v2);
    }
}
