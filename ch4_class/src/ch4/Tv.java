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
    private String color;
    private int channel;
    private boolean power;


    void channelUp() {
        channel++;
    }
    void channelDown() {
        channel--;
    }
    // 생성자 오버로딩
    // Tv(){}
    public Tv() {
    }

    public Tv(String color, int channel, boolean power) {
        this.color = color;
        this.channel = channel;
        this.power = power;
    }
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getChannel() {
        return channel;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
    public boolean isPower() {
        return power;
    }
    public void setPower(boolean power) {
        this.power = power;
    }
    
    

}
