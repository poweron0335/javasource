package ch4;

public class Student2 {
    // 멤버변수(= 인스턴스 변수, property, 속성, 필드) - 학생 객채가 가져야 하는 특징
    // 학번(20241011), 이름(홍길동), 주소(서울시 종로구), 주민번호(071215-401123), 핸드폰번호(010-1234-1234),
    private String id;
    private String name;
    private String addr;
    private String hp;

    // 멤버메소드(= 인스턴스 메소드, 기능, 동작)
    // 속성을 변경시킬 수 있도록 메소드 작성
    // 메소드 작성 규칙
    // 리턴타입 메소드명(){}
    // return type : 정수형, 실수형, 불린형, 문자형, String, 배열, void
    void changeAddr(String addr) {
        // 멤버변수 addr 의 값을 변경
        // 리턴 값은 없음
        this.addr = addr;   // 멤버변수 addr의 값을 변경하고 싶으면 this 붙이기 오른쪽 addr은 String addr
    }
    void changeHp(String hp) {
        this.hp = hp;
    }

    // 생성자(constructor) - 멤버변수 초기화가 목적(초기화를 안 하면 기본값이기 때문에)
    // 클래스를 객체로 생성할 때 필수로 필요
    // 클래스 이름이랑 똑같이 생성되어야함
    Student2() {}

    public Student2(String id, String name, String addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }
    // 생성자는 여러개 들어올 수 있으나 괄호 안에가 달라야함
    Student2(String id, String name, String addr, String hp) {
        this.id = id;
        // private id = String id 라는 의미 
        this.name = name;
        // private name = String name 라는 의미
        this.addr = addr;
        // private addr = String addr 라는 의미
        this.hp = hp;
        // private hp = String hp 라는 의미
    }
    
    @Override
    public String toString() {
        return "Student2 [id=" + id + ", name=" + name + ", addr=" + addr + ", hp=" + hp + "]";
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public String getHp() {
        return hp;
    }
    public void setHp(String hp) {
        this.hp = hp;
    }
    

}