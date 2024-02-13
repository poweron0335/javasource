package poly;

public class Child extends Parent {

    String field2;

    @Override // 자식 입장에서 메소드를 재정의 하기 위해서 쓰는 기능
    public void method2() {
        System.out.println("Child-method2()");
    }

    public void method3() {
        System.out.println("Child-method3()");
    }
}
