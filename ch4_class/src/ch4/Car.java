package ch4;

public class Car {
    // 제조사, 이름, 옵션(etc), 속도,..... => 필요한 것들만 변수로 작성
    String company;
    String model;
    int maxSpeed;
    
    // 전진한다. 후진한다. => 메소드로 작성
    void forward(){
        System.out.println("전진한다.");
    }
    void backward(){
        System.out.println("후진한다.");
    }
    // 멤버 변수 값을 변경하기 위해서도 => 메소드로 작성

    
}
