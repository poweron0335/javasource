package ch4;

public final class Person {

    // 멤버변수에 final 이 붙은 경우
    // 초기화(선언 or 생성자) 반드시 해야한다.
    // 수정이 불가능하다.
    // 상수 개념으로 바뀜

    // 클래스에 final 이 붙은 경우
    // 상속금지 
    
    // 메소드에 final 이 붙은 경우
    // 오버라이딩 금지

  private String name;
  private final String nation;
  
    // 객체끼리 공유하는 상수
    // 상수는 대문자로 표현
//   private static final double Pi = 3.141592;
  private static final double PI = 3.141592;

  public static double getPi() {
      return PI;
  }

  public Person(String name, String nation) {
    this.name = name;
    this.nation = nation;
}

public final String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + "]";
  }
}

