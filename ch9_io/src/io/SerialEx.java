package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// 직렬화(Serialization)
// 객체를 주고 받는 개념
// ObjectInputstream(스트림에서 객체 입력 - 역직렬화) / ObjectOutputStream)(스트림에 객체 출력 -  직렬화)

public class SerialEx {
    public static void main(String[] args) {
        Person person1 = new Person("홍길동", "엔지니어", "010-1234-5678");
        Person person2 = new Person("김유신", "선생님", "010-4567-4567");

        try (FileOutputStream fos = new FileOutputStream("c:\\temp\\serial.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                FileInputStream fis = new FileInputStream("c:\\temp\\serial.dat");
                ObjectInputStream ois = new ObjectInputStream(fis)) {

            oos.writeObject(person1);
            oos.writeObject(person2);

            // ObjectInputStream을 사용하여 직렬화된 데이터를 읽어와서 역직렬화하여 Person 객체로 변환합니다.
            for (int i = 0; i < 2; i++) {
                Person p = (Person) ois.readObject(); // 저장된 객체를 읽어와서 Person 타입으로 캐스팅합니다.

                System.out.println(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
