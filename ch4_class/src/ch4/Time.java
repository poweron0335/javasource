package ch4;

// 시, 분, 초는 모두 0보다 크거나 같아야 한다.
// 시의 범위는 0~23, 분,초 0~59 이다.
public class Time {
    private int hour;
    private int minute;
    private float second;

    // 오버로딩
    // - 하나의 클래스에 동일한 이름으로 존재
    // - ()안에 인자의 개수, 타입이 달라야 함

    // 생성자 오버로딩
    // 메소드 오버로딩

    public int getHour() {
        return hour;
    }
    public void setHour(int hour) { 
        if(hour < 0 || hour > 23) return;  // void 일 때 return 만 써도 됨
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        if(minute < 0 || minute > 59) return;
        this.minute = minute;
    }
    public float getSecond() {
        return second;
    }
    public void setSecond(float second) {
        if(second < 0 || second > 59) return;
        this.second = second;
    }

    
    
}
