package interfacetest;

public class SoundableEx {
    public static void main(String[] args) {
        Cat cat = new Cat();
        printSound(cat);
        // printSound(new Cat()); 줄여서 쓰는 개념
        printSound(new Dog());
    }

    public static void printSound(Soundable soundable) {
        System.out.println(soundable.sound());
    }
}
