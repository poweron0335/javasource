package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapEx3 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("id_0123", "홍길동");
        map.put("id_0124", "박보검");
        map.put("id_0125", "송중기");
        map.put("id_0126", "현빈");

        // Iterator 사용 시
        // 키 값만 모두 가져오기
        Set<String> set = map.keySet();
        // 키 값을 Iterator 구조로 변경
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) { // iterator 를 이용한 key 와 value 에 접근하는 첫번째 방법
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }

        System.out.println();

        // Map => Map.Entry 내부 인터페이스로 가지고 있음
        Set<Entry<String, String>> entries = map.entrySet();
        Iterator<Entry<String, String>> iterator2 = entries.iterator();

        while (iterator2.hasNext()) {
            Entry<String, String> entry = iterator2.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
