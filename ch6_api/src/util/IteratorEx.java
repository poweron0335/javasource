package util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * Iterator, Enumeration 인터페이스
 * 컬렉션에 저장된 요소를 접근하는 데 사용되는 인터페이스
 */

public class IteratorEx {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        // list 요소 접근
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i); // 접근하는 방법 1 list.get()
        }

        for (String item : list) {
            // item // 접근하는 방법 2 for each 사용 후 item 다이렉트 불러오기
        }

        Set<String> set = new HashSet<>();

        // set 요소 접근
        for (int i = 0; i < set.size(); i++) {
            // 순서의 개념이 없는 set 에서는 get() 불가
            // String item = set.get(i);
        }

        for (String item : set) { // 무작위로 불러오는 방법이기 때문에 가능
            // item
        }

        // Map : get(key)를 넣고 사용

        // 데이터를 담는 구조에 따라 접근하는 방법이 다르다
        // 컬렉션 요소를 읽어오는 방법을 표준화 => Iterator

        Iterator<String> iterator = list.iterator(); // 무조건 이런 형태로 사용, list 구조를 iterator 구조로 변경
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator = set.iterator(); // set 구조를 iterator 구조로 변경
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
