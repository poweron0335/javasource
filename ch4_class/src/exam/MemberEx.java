package exam;

public class MemberEx {
    public static void main(String[] args) {
        // 회원 객체 생성
        
        // 아이디, 비밀번호, 이름 필수로
        Member member = new Member("qwer123", "112233", "살구");
        // 아이디, 비밀번호, 이름, 나이, 직업
        Member member2 = new Member("asdf123", "112233", "롱수칸", 35, "워로드");
        // Member member3 = new Member();
        // grade, point => 마트 규칙에 따라 변경

    }
    
}
