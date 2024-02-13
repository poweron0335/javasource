package poly;

public class CarEx {
    public static void main(String[] args) {
        Car car = null;

        FireEngine fe1 = new FireEngine();
        FireEngine fe2 = null;

        Ambulance ambulance = null;
        // ambulance = fe1; 상속관계가 아닌 클래스는 형변환 불가

        fe1.water();
        // 자동 형변환
        car = fe1; // Car car = FireEngine(); 이 코드와 의미가 같다

        // cast : 강제 형변환
        fe2 = (FireEngine) car;

        fe2.water();

        Car car2 = new Car();
        // ClassCastException : 실행 시 에러 발생 (생성된 건 Car 이므로 형변환 불가)
        // FireEngine fe3 = (FireEngine) car2;
        // fe3.water();
    }
}
