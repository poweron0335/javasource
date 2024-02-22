package thread;

public class User1 extends Thread {

    private Calcurator cal;

    public User1(Calcurator cal) {
        this.cal = cal;
        super.setName("User 1");
    }

    @Override
    public void run() {
        cal.setMemory(100);
    }

}
