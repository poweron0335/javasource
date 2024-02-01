package exam;

public class Area {
    public static void main(String[] args) {
        // 사다리꼴의 넓이를 구한 후 출력
        // (윗변 + 아랫변) * 높이 / 2
        // 소수점 2자리까지 출력
        int top = 7;
        int bottom = 10;
        int height = 3;

        double area = (top + bottom) * height / 2.0; //25.50
        System.out.printf("사다리꼴 넓이 : %.2f", area);
    }
}
