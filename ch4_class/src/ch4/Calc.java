package ch4;

public class Calc {
    // 오버로딩 개념으로 메소드 만들기
    // 직사각형, 정사각형 넓이
    double areaRectangle(double width){
        // 정사각형
        return width * width;
    }
    double areaRectangle(double width, double height){
        // 직사각형
        return width * height;
    }
    
}
