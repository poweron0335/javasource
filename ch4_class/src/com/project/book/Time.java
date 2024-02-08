package com.project.book;

// 접근 제어자 - 클래스, 멤버변수, 메소드, 생성자

// private : 같은 클래스내에서만 접근 가능
// default : 같은 패키지내에서만 접근 가능(아무것도 안 붙는 경우)
// protected : 같은 패키지이고, 다른 패키지의 자손 클래스에서 접근 가능
// public : 접근 제한 없음

// 대상에 따라 사용할 수 있는 접근 제어자
// 클래스 - public or default 만 붙인다.
// 메소드, 멤버변수 - private, default, protected, public 4개 다 사용가능

// public > protected > default > private  범위가 큰 순

public class Time {

    private int hour;
    private int second;
    private int minute;

    public void setHour(int hour) {
        if (hour < 0 || hour > 23)
            return;
        this.hour = hour;
    }

    // 내부에서만 사용 메소드
    private void print() {
    }
}
