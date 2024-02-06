package exam;

public class Triangle {
    // 밑변, 높이
    private int baseLine;
    private int height;

    Triangle() {

    }

    public Triangle(int baseLine, int height) {
        this.baseLine = baseLine;
        this.height = height;
    }

    // 메소드 getArea()
    public double getArea() {
        // 밑변 * 높이 / 2
        return (double) baseLine * height / 2;
    }
    
}




































































