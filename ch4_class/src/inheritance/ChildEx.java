package inheritance;

public class ChildEx {
    public static void main(String[] args) {
        // 부모, 자식 따로 인스턴스 생성 가능
        // 상속을 여러개 받을 수 있고 상속을 받을 수록 자식의 범위는 커진다.

        Parent parent = new Parent(15);
        Child child = new Child(20);
        Child2 child2 = new Child2(25);
        GrandChild grandChild = new GrandChild(30);

        System.out.println("부모의 멤버 변수 " + parent.getAge());
        System.out.println("부모가 물려준 멤버 변수 child" + child.getAge());
        System.out.println("부모가 물려준 멤버 변수 child2 " + child2.getAge());
        System.out.println("Parent 가 물려준 멤버 변수 " + grandChild.getAge());
        System.out.println("child 멤버 메소드 ");
        child.play();
        grandChild.play(); // Child 가 물려준 멤버 메소드

        // 오버라이딩 메소드 호출
        parent.print(); // 부모 메소드 호출 나이는 15 입니다.
        child.print(); // 자신이 선언한 메소드 호출 내 이름은 성춘향입니다.
        child2.print(); // 부모에 상속했기 때문에 부모 메소드 호출 나이는 25 입니다.
        grandChild.print(); // child에 상속되어있기 때문에 내 이름은 성춘향입니다.
    }

}
