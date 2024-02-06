package ch4;

public class StudentEx2 {
    public static void main(String[] args) {
        // Student2 객체 생성
        Student2 obj = new Student2("20231423", "김철수", "서울시 구로구", "010-4568-1234");
        // 직접접근 불가(private)
        // obj.id = "20231423";
        System.out.println(obj);

        // 주소 변경
        obj.changeAddr("서울시 중랑구");
        obj.setAddr("서울시 중랑구");
        obj.changeHp("010-4567-8910");
        obj.setHp("010-4567-8910");
        System.out.println(obj);

        Student2 obj2 = new Student2();
        obj2.setId("20231145");
        obj2.setName("김살구");
        obj2.setAddr("서울시 종로구");
        obj2.setHp("010-1234-5647");
        System.out.println(obj2);

        Student2 obj3 = new Student2("20245812", "김진수", "경기도 수원시");
        System.out.println(obj3);
    }
}
