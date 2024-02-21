package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

// java.io.* : io(input/output)
// 기본 input : KeyBorad
// 기본 output : 화면

// 스트림 : 입출력을 수행할 때 어느 한 쪽에서 다른 쪽으로 데이터 전달시 두 대상을 연결하는 통로 같은 개념
//          단방향만 가능(입력, 출력 => 2개의 스트림 필요)
// 1. 바이트 기반 스트림(문자, 이미지, 동영상...etc)
//     InputStream(추상 클래스) : 입력 스트림 부모
//     OutputSteam(추상 클래스) : 출력 스트림 부모
// 2. 문자 기반 스트림(문자)
//    Reader(최상위 부모, 추상 클래스)
//    Writer(최상위 부모, 추상 클래스)

public class InputStreamEx1 {
    public static void main(String[] args) {

        InputStream in = System.in; // 키보드로 부터 받아들인다라는 의미
        // in.read(); : 1 byte 씩 읽어와서 int 로 리턴
        // in.read(byte[] b); : byte 배열로 읽어와서 byte 를 int 로 리턴
        // in.read(byte[] b, 0, 100); : 입력 스트림에서 100개의 byte 를 읽어와서 0번 위치부터 저장
        OutputStream out = System.out;
        // out.write(byte[] b);
        // out.write(int);
        // out.write(b, 0, 100);

        try {
            // 1 byte만 입력 시
            // int input = in.read();
            // out.write(input);
            // System.out.println((char) input);

            // 여러 바이트 입력 시
            // int input = 0;
            // while ((input = in.read()) != -1) {
            // // System.out.println((char) input);
            // out.write(input);
            // }

            byte b[] = new byte[100];
            in.read(b);
            // System.out.println(Arrays.toString(b));
            out.write(b);

            in.close();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
