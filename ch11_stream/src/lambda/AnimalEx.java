package lambda;

public class AnimalEx {
    public static void main(String[] args) {
        // 인터페이스 활용 방법
        Animal animal = new Lion();
        animal.eat();

        // 람다식으로 활용하기
        Animal anima12 = () -> System.out.println("풀을 먹는다");
        anima12.eat();
    }
}
