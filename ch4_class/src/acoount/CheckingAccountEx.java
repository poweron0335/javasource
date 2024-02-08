package acoount;

public class CheckingAccountEx {
    public static void main(String[] args) {
        CheckingAccout cAccount = new CheckingAccout(
                "220-11", "홍길동", 100000, "111");

        try {
            cAccount.pay("220-11", 50000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
