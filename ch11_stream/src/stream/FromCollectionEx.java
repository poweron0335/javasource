package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import lambda.Student;

public class FromCollectionEx {

    static int sum = 0;

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("홍길동", 90, 80), new Student("김길동", 100, 90),
                new Student("최길동", 80, 70));

        // Stream 객체 변환
        Stream<Student> stream = students.stream();

        stream.forEach(student -> System.out
                .println(student.getName() + ": " + student.getKor() + ", " + student.getMath()));
        // stream.forEach(student -> {
        // // 처리해야 할 코드가 많은 경우
        // });

        // java.nio.file : io 패키지를 향상 시킨
        Path path = Paths.get("C:\\temp");

        try (Stream<Path> stream2 = Files.list(path)) {
            // 파일명 출력
            stream2.forEach(file -> System.out.println(file.getFileName()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 1~100 까지의 합
        // int sum = 0;
        // for (int i = 1; i < 101; i++) {
        // sum += i;
        // }
        // System.out.println("1~100 합 : " + sum);

        // 특정 범위의 정수를 스트림으로 생성
        IntStream.range(0, 10).forEach(i -> System.out.print(i + " "));
        // endExclusive : 10을 제외하고 0 ~ 10 => 0 1 2 3 4 5 6 7 8 9
        System.out.println();
        IntStream.rangeClosed(0, 10).forEach(i -> System.out.print(i + " "));
        // endInclusive : 10을 포함하고 0 ~ 10 => 0 1 2 3 4 5 6 7 8 9 10
        System.out.println();

        IntStream.rangeClosed(1, 100).forEach(i -> sum += i);
        System.out.println("sum = " + sum);

    }
}
