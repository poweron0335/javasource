package inheritance;

// 관계 : 1. 상속 2. 포함

// TV+VCR 기능을 갖고있는 클래스
public class TVCR extends Tv {
    VCR vcr = new VCR();
    int counter = vcr.counter;

    void play() {
        vcr.play();
    }

    void stop() {
        vcr.stop();
    }
}
