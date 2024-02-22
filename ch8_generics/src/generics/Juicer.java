package generics;

public class Juicer {
    static Juice makeJuice(FruitBox<Fruit> box) { // Fruit 타입의 객체들을 담고 있는 상자 반환 값은 Juice 객체
        String temp = ""; // 주스의 내용을임시로 저장할 문자열 변수 'temp' 선언하고 빈 문자열로 초기화
        for (Fruit f : box.getList()) { // 'FruitBox' 객체 리스트에 있는 과일을 순회하며 각 과일을 문자열로 반환 후 'temp' 에 추가되며 사이에 공백이 추가
            temp += f + " ";
        }
        return new Juice(temp); // 모든 과일을 문자열로 만들고 'Juice' 객체 생성 및 반환
    }
}
