package abstractclass;

public class FireEngine extends Car {
    void water() {
        System.out.println("water!!!!");
    }

    @Override
    void drive() {
        System.out.println("FireEngine 달린다");
    }
}
