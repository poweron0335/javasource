package thread;

public class User2 extends Thread {

    private Calcurator cal;

    public User2(Calcurator cal) {
        this.cal = cal;
        super.setName("User 2");
    }

    @Override
    public void run() {
        cal.setMemory(50);
    }

}
