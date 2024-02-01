package exam;

public class Pencill {
    public static void main(String[] args) {
        // 534 자루의 연필을 30명의 학생들에게 똑같은 개수로
        // 나눌떄 학생 한 명 당 몇 개를 가질 수 있고, 최종적으로 몇 개가 남는지 출력하시오
        // 변수 사용
        
        int pencills = 534;
        int student = 30;

        System.out.println("학생 한 명당 " + pencills / student);
        System.out.println("남는 연필 수 " + pencills % student);
    }
    
}
