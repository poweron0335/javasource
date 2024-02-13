package interfacetest;

public interface Calc {
    // public static final 가 기본이기 때문에 생략
    double PI = 3.14;
    int ERROR = -99999999;

    // public abstract 가 기본이기 때문에 생략
    int add(int num1, int num2);

    int substract(int num1, int num2);

    int times(int num1, int num2);

    int divide(int num1, int num2);
}
