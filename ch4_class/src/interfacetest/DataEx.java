package interfacetest;

public class DataEx {
    public static void main(String[] args) {
        // DataAccessObject obj = new Oracle();
        // dbWork(obj);
        // obj = new MySql();
        // dbWork(obj);
        dbWork(new Oracle());
        dbWork(new MySql());
        // 자식을 객체로 던져줄 수 있다.

        // 익명 클래스(anonymous) : 일회용 클래스(선언과 생성 동시에)
        DataAccessObject object = new DataAccessObject() { // 한 번만 쓰고 버리는 형태 new 형태가 아님

            @Override
            public void select() {
                System.out.println("PostgreSQL 검색");
            }

            @Override
            public void insert() {
                System.out.println("PostgreSQL 삽입");
            }

            @Override
            public void update() {
                System.out.println("PostgreSQL 수정");
            }

            @Override
            public void delete() {

                System.out.println("PostgreSQL 삭제");
            }

        };

        dbWork(object);
    }

    public static void dbWork(DataAccessObject obj) { // 부모가 받을 수 있다.
        obj.select(); // Oracle DB에서 검색 or MySql DB에서 검색
        obj.insert(); // Oracle DB에서 삽입 or MySql DB에서 삽입
        obj.update(); // Oracle DB에서 수정 or MySql DB에서 수정
        obj.delete(); // Oracle DB에서 삭제 or MySql DB에서 삭제
        // 오버라이딩된 메소드여야 한다. (자식의 오버라이딩 객체)
        // 많이 쓰이는 개념 ★
    }
}
