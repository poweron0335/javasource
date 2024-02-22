package io;

import java.io.FileInputStream;
import java.io.InputStreamReader;

// 보조스트림 : 스트림의 기능 보완
//             데이터 입출력 기능 없음

// 1) 바이트 기반
//    BufferedInputstream  / BufferedOutputStream : 버퍼를 이용한 입출력 향상
//    DataInputStream / DataOutputStream : 기본형 단위로 데이터를 처리
//                      PrintStream : 버퍼 사용하며, print, println, printf()
// 2) 문자 기반
//    BufferedReader / BufferedWriter : 버퍼를 이용한 입출력 향상

// 브릿지 스트림
// InputStreamReader / OutputstreamReader 
// 바이트 스트림 => 문자 스트림으로 변환  /  문자 스트림 => 바이트 스트림

public class InputStreamReaderEx {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("c:\\temp\\test1.txt");
                InputStreamReader ir = new InputStreamReader(fis);) { // 혼자 읽어오지 못하고 읽어주는 fis를 기준으로 형변환 가능

            int data = 0;
            // byte b[] = new byte[1024];

            // byte 기반
            // while ((data = fis.read()) != -1) {
            // System.out.println((char) data);
            // }

            // 문자 기반
            char cbuf[] = new char[1024];
            while ((data = ir.read(cbuf)) != -1) {
                System.out.println(cbuf);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
