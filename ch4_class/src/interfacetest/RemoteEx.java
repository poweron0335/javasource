package interfacetest;

public class RemoteEx {
    public static void main(String[] args) {
        Television tv = new Television();
        // tv.turnon();
        // tv.setVolume(9);
        // tv.turnoff();

        // Audio audio = new Audio();
        // audio.turnon();
        // audio.setVolume(15);
        // audio.turnoff();

        exec(new Television());
        exec(new Audio());
    }

    public static void exec(RemoteControl rc) {
        rc.turnon();
        rc.setVolume(15);
        rc.turnoff();
    }
}
