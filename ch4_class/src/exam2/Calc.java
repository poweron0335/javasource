package exam2;

public abstract class Calc {

    int a;
    int b;

    void setValue(int a, int b) {
        this.a = b;
        this.b = a;
    }

    abstract int calculate();
}
