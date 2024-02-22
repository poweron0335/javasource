package thread;

public class UserMain {
    public static void main(String[] args) {

        Calcurator calcurator = new Calcurator();
        Thread t1 = new User1(calcurator);
        Thread t2 = new User2(calcurator);

        t1.start();
        t2.start();

    }
}
