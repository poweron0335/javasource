package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Collections 클래스
// 목적 : 컬렉션(List, Set, Map)과 관련된 메소드 제공
// static 요소로만 구성
// 동기화, fill(), copy(), sort(), binarySearch() 유용한 메소드 제공

// Collection 인터페이스
public class CollectionsEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        // list.sort(Comparator.reverseOrder()); list 자체 메소드를 이용하는 방법

        // 오른쪽으로 두 칸씩 이동
        Collections.rotate(list, 2);
        System.out.println(list);

        Collections.swap(list, 0, 2);
        System.out.println(list);

        // Collections.sort(list, Collections.reverseOrder()); // 유용한 메소드를 모아놓은
        // Collections 클래스를 이용하는 방법
        Collections.sort(list, Comparator.naturalOrder()); // 오름차순 정렬
        System.out.println(list);

        // binarySearch() - 오름차순 정렬, 못 찾으면 음수로 결과 나옴
        System.out.println("3이 저장된 위치 : " + Collections.binarySearch(list, 6));
        System.out.println("최대값 : " + Collections.max(list));
        System.out.println("최소값 : " + Collections.min(list));

        // 리스트를 하나의 값으로 채울 때 사용
        Collections.fill(list, 9);
        System.out.println(list);

    }
}
