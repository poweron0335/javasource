package abstractclass;

public class Ambulance extends Car {
    void siren() {
        System.out.println("siren!!!!");
    }

    @Override
    void drive() {
        System.out.println("Ambulance 달린다.");
    }
}
