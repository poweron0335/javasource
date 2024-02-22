package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderEx1 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("c:\\temp\\test1.txt");
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter("c:\\temp\\output4.txt");
                BufferedWriter bw = new BufferedWriter(fw)) {
            String str = null;

            // readLine() : 줄 단위로 읽어오기
            while ((str = br.readLine()) != null) { // str가 null이 아닐 때 줄 단위로 읽어오기
                bw.write(str);
                bw.newLine(); // \r\n 개념이랑 같음
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
