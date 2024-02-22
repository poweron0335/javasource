package generics;

// 제한된 제네릭 클래스
// T extends Fruit : 특정 타입과 그 타입의 자손들만 대입 가능
// ? super T : 특정 타입과 그 타입의 부모들만 대입

// sort(List<T> list, Comparator<? super T> c)
// sort(List<Apple> list, Comparator<? super Apple> c)
// Comparator<Apple>, Comparator<Fruit>, Comparator<Object>

// sort(List<Toy> list, Comparator<? super Toy> c)
// Comparator<Toy>, Comparator<Object>

public class FruitBox<T extends Fruit> extends Box3<T> { // Fruit의 자식 클래스만을 'T'에 허용한다.
}

// 아래의 경우 컴파일 오류가 발생합니다.
// FruitBox<String> stringBox = new FruitBox<>();  // 오류: String은 Fruit의 하위 클래스가 아님
// FruitBox<Object> objectBox = new FruitBox<>();  // 오류: Object는 Fruit의 하위 클래스가 아님
