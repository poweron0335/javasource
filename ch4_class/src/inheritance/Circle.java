package inheritance;

// 원(Circle)은 점(Point)이다 => Circle is a Point
// 원(Circle)은 점(Point)을 가지고 있다 => Circle has a Point

// 상속관계 (isa)
// public class Circle extends Point{

//     // int x;   //  원점의 x 좌표
//     // int y;   //  원점의 y 좌표
//     int r;   //  반지름

// }

// 포함 관계(hasa) (포인트 클래스를 Circle 클래스에 포함되어 있음)
// 한 클래스의 멤버변수로 다른 클래스의 타입의 참조 변수를 선언
public class Circle {

    Point p = new Point(); // p 라는 멤버변수에 new Point를 대입
    int r;
}