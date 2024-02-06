package exam;

public class TriangleEx {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 20);
        System.out.println("삼각형의 넓이는 " + triangle.getArea());

        double result = triangle.getArea();
        System.out.println("삼각형의 넓이는 " + result);
        
    }
    
}
