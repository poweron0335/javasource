package ch4;

public class TvEx {
    public static void main(String[] args) {
        // 생성자 호출
        Tv tv = new Tv();
        System.out.println(tv.color);  // nul
        System.out.println(tv.channel);  //  0
        System.out.println(tv.power);  // false

        tv.color = "black";
        tv.channel = 3;
        tv.power = true;


        tv.channelUp();
        System.out.println("현재 채널 " + tv.channel);


        // 채널 번호 직접 입력
        

    }

    
}
