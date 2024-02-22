package generics;

// Generics(제네릭스)
// 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스 컴파일 시 타입체크를 해주는 기능
// 장점
// 타입 안정성 제공 / 타입체크와 형변환 생략 가능하므로 코드 간결

public class Box {

    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}