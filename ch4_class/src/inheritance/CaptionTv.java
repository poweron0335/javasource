package inheritance;

public class CaptionTv extends Tv {
    // 생성자가 없는 상태이며, 컴파일러가 default 값으로 생성자를 만들어줌
    // CaptionTv() {super()}; 컴파일러에게 명시해주지 않으면 자동으로 만들어주는 구문 숨어있는 상태
    // 그래서 오류가 나지 않음

    boolean caption;

    public CaptionTv(boolean power, int channel, boolean caption) {
        super(power, channel); // 부모의 생성자 호출 맞춰서 불러줘야함
        this.caption = caption;
    }

    public CaptionTv(boolean caption) {
        this.caption = caption;
    }

    void displayCaption(String text) {
        // if(caption != true) == if(!caption) 와 동일한 의미
        // boolean 타입이기 때문에 if(caption == true) 와 동일한 의미
        if (caption) {

            System.out.println(text);
        }
    }
}
