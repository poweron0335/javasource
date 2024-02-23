package lambda;

// 함수형 인터페이스

// 람다식을 포함(★추상 메서드는 하나만 사용★)
// 람다식 == 익명 클래스 객체

@FunctionalInterface
public interface MyFunction1 {
    void method(); // public abstract <= 기본으로 탑재
    // void print();
}
