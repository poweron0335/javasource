package ch4;

public class StudentEx {
    public static void main(String[] args) {
        // 객체(인스턴스)를 생성한다.
        Student student = new Student();
        // 생성된 인스턴스 값 확인
        print(student);

        System.out.println(student);   //   ch4.Student@24d46ca6
        System.out.println(student.id);  // null
        System.out.println(student.name);  // null
        System.out.println(student.addr);  // null
        System.out.println(student.hp);  // null


        student.id = "20241212";
        student.name = "홍길동";
        student.addr = "서울시 종로구";
        student.hp = "010-1234-1234";
        print(student);
   

        // 자동으로 생성자 호출
        Student student2 = new Student();

        student.id = "20241002";
        student.name = "성춘향";
        student.addr = "서울시 종로구";
        student.hp = "010-1234-1234";
        print(student2);


        System.out.println(student.id); 
        System.out.println(student.name);
        System.out.println(student.addr);
        System.out.println(student.hp); 
    }

    public static void print(Student student) {
        System.out.println(student.id); 
        System.out.println(student.name);
        System.out.println(student.addr);
        System.out.println(student.hp);
    }
    
}
