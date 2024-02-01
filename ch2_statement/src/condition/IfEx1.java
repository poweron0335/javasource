package condition;
/* 제어문 - 1) 조건문 2) 반복문 
* 1) 조건문 : 조건에 따라 다음 문장 수행 여부를 결정
     if, switch 
*/


public class IfEx1 {
    public static void main(String[] args) 
    {
    //     if(조건식) {
    //         조건식이 참일 때 수행될 문장들을 나열
    //     }
    // {} 생략가능 => 수행할 구문이 한 개일때만 가능

    int x = 0;

     // true 나 false 로 무조건 나오게 해야한다.
    if(x == 0)
    {
        System.out.println("x == 0");
    }
    if(x != 0)
    {
        System.out.println("x != 0");
    }
    if(!(x == 0))
    {
        System.out.println("x == 0");
    }

    if(!(x != 0)) System.out.println("x != 0");

    // if (x == 0); {}   에러 발생 절 대 세미콜론 뒤에 괄호를 붙이지마
    }
    
}
