package ch4;

// 멤버변수 초기값
// String : null
// int, long : 0
// float, double : 0.0
// char : ' '
// boolean : false

// 클래스 : 설계도
// 객체 : 설계도를 통해 만든 실제 존재하는 제품 
// 

public class Tv {
    // 색상(검정, 흰색), 전원상태(on, off), 채널(6, 7, 9,....etc), 볼륨(11, 12, 13,...etc), 크기(50, 46,...etc)
    String color;
    int channel;
    boolean power;


    void channelUp() {
        channel++;
    }
    void channelDown() {
        channel--;
    }
    // 생성자
    // Tv(){}

}
