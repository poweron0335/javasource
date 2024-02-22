package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class FileWriterEx2 {
    public static void main(String[] args) {
        // 현재 폴더에서 자바소스 읽은 후 다른 파일에 출력

        // FileEx1.java 읽기 ==> .\src\io\FileEx1.java
        // c:\\temp\\output2.txt
        // .\src\io\FileEx1.java
        try (FileReader fr = new FileReader(".\\src\\io\\FileEx1.java", Charset.forName("utf-8"));
                FileWriter fw = new FileWriter("c:\\temp\\output2.txt");) {

            int data = 0;
            char[] cbuf = new char[1024];
            while ((data = fr.read(cbuf)) != -1) {
                fw.write(cbuf);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
