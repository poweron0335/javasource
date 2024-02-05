package exam;

public class Circle {
    // 반지름(3.5)
    private double radius;

    // public Circle() {
    // }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        
    }

    // 반지름*반지름*3.14 결과값 리턴
    public double getArea() {
        return this.radius * this.radius * 3.14;
    }
    
}
