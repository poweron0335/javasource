package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* 컬렉션 프레임워크 : 데이터 군을 저장하는 클래스들을 표준화한 설계

    Collection

    List    Set (Collection 인터페이스 상속)
 * 
 *  Map
 * 
 * 
 *  List(인터페이스) : 순서가 있는 데이터의 집합(데이터의 중복 허용)
 *    구현 클래스 - ArrayList, LinkedList, Stack, Vector.... etc
 *    고정 크기 => 크기 변경이 필요하다면 내부적으로 알아서 처리해줌
 * 
 *  ==> 배열과 동일한 개념
 *      고정크기 => 크기 변경 시 다른 배열 생성 후 옮겨야 함
 */

public class ArrayListEx {
    public static void main(String[] args) {
        // initial capacity : 10 기본으로 10개의 메모리 공간을 확보해놓음
        // List<Integer> list = new ArrayList<>(); // 데이터를 담을 때 뭘 담을지 먼저 알려주는데 객체타입으로
        // 담아야한다. int => Integer
        ArrayList<Integer> list = new ArrayList<>(20);
        list.add(75); // 차례대로 담긴다.
        list.add(68); // append 개념 (뒤로 덧붙히기)
        list.add(35);
        list.add(45);
        list.add(55);
        list.add(65);

        // toString() 오버라이딩 여부
        System.out.println(list); // [15, 25, 35, 45, 55, 65]

        // sort() : 정렬
        // list.sort(Comparator.reverseOrder()); // 내림차순
        list.sort(Comparator.naturalOrder()); // 오름차순
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("JSP");
        list2.add("HTML");
        list2.add("CSS");
        list2.add("JavaSCRIPT");
        list2.add("PYTHON");

        System.out.println(list2);

        // 메소드
        // arr.lenght()
        System.out.println("size() " + list2.size()); // ArrayList 에서 저장된 객체 객수 배열에서 length()와 같은 역할
        // arr[3]
        System.out.println("get() " + list2.get(3)); // 지정된 위치에 있는 객체 반환
        System.out.println("indexOf() " + list2.indexOf("Java")); // 지정된 객체가 저장된 위치 반환
        System.out.println("indexOf() " + list2.indexOf("JAVA"));
        System.out.println("remove() " + list2.remove("Java"));
        System.out.println(list2);
        System.out.println("remove() " + list2.remove(2)); // 제거되는 객체가 반환
        System.out.println(list2);

        // ArrayList ==> 배열로 변환
        Object[] arr = list2.toArray();
        for (Object object : arr) {
            System.out.println(object);
        }

        // 배열 ==> ArrayList 변환
        // Arrays
        int[] arr2 = { 3, 5, 6, 7, 9 };
        List<int[]> list3 = Arrays.asList(arr2);

        System.out.println("isEmpty() " + list2.isEmpty()); // isEmpty() : ArrayList가 비어 있는지 확인
        list2.set(1, "Oracle"); // set() : 특정 위치에 객체 추가 (중간삽입)
        System.out.println(list2);
    }
}
