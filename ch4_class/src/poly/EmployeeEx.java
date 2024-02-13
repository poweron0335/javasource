package poly;

public class EmployeeEx {
    public static void main(String[] args) {
        Employee employee = new Employee("홍길동", "사원");
        // employee.work();
        work(employee);

        // employee = new Ceo("김유신", "회장");
        // employee.work();
        Ceo ceo = new Ceo("김유신", "회장");
        // ceo.work();
        work(ceo); // employee = ceo; 랑 같은 개념

        // employee = new Admin("김동호", "관리자");
        // employee.work();
        Admin admin = new Admin("김동호", "관리자");
        // admin.work();
        work(admin); // employee = admin; 랑 같은 개념

        // employee = new PartTime("정우성", "아르바이트");
        // employee.work();
        PartTime partTime = new PartTime("정우성", "아르바이트");
        // partTime.work();
        work(partTime); // employee = partTime; 랑 같은 개념
    }

    public static void work(Employee employee) {
        // work 전용 메소드
        employee.work();
    }

}
