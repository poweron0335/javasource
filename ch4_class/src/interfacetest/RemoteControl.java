package interfacetest;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnon();

    void turnoff();

    void setVolume(int volume);

}
