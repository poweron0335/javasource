package ch4;

import java.util.Scanner;

public class StudentEx4 {
    public static void main(String[] args) {
        Student3 stuArr[] = new Student3[3];
        // 클래스 배열 초기값은 무조건 NULL
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < stuArr.length; i++) {
            stuArr[i] = new Student3();
            // 아이디, 이름, 국어, 영어, 수학 점수 입력받아서 초기화
            System.out.println("Input Id : ");
            String id = sc.nextLine();
            System.out.println("Input Name : ");
            String name = sc.nextLine();
            System.out.println("Input Kor : ");
            int kor = Integer.parseInt(sc.nextLine());
            System.out.println("Input Eng : ");
            int eng = Integer.parseInt(sc.nextLine());
            System.out.println("Input Math : ");
            int math = Integer.parseInt(sc.nextLine());

            stuArr[i].setEng(eng);
            stuArr[i].setId(id);
            stuArr[i].setKor(kor);
            stuArr[i].setName(name);
            stuArr[i].setMath(math);

        }
        // 학생정보 확인
        System.out.println("==========================================================================");
        System.out.println("아이디      이름        국어        영어        수학        총점        평균");
        System.out.println("==========================================================================");
        
        
        for (Student3 student3 : stuArr) { // Student3 student3 = stuArr[i]; 라는 의미
            int total =  student3.getKor() + student3.getEng() + student3.getMath();
            System.out.printf(
                "%s %s %d %d %d %d %.2f\n", 
                student3.getId(), 
                student3.getName(), 
                student3.getKor(),
                student3.getEng(),
                student3.getMath(), 
                total, 
                total / 3.0);
        };

    }
    
}
