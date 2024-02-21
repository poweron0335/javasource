package generics;

import java.util.ArrayList;

public class Box3<T> { // 객체로 여러개 담을 수 있게 해주겠다. 라는 의미
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);

    }

    T get(int i) {
        return list.get(i);
    }

    ArrayList<T> getList() {
        return list;
    }

    int size() {
        return list.size();

    }

    @Override
    public String toString() {
        return list.toString();
    }

}
