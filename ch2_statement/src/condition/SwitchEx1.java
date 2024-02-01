package condition;

// if ~ else if 처리 대체 가능

public class SwitchEx1 {

    
    public static void main(String[] args) {
        int ch1 = 'a';
        

    
        switch (ch1) {
            case 'a':          // 무조건 같다라는 의미만 있음 기호 못 들어옴
                System.out.println("a 입니다.");
                break;
            case 'b':                          
                System.out.println("b 입니다.");
                break;        
            default:
            System.out.println("a 도 b 도 아닙니다.");
                break;
        }
    }
    
}
