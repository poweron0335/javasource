package inheritance;

public class Tv {
    private boolean power;
    private int channel;

    public Tv(boolean power, int channel) {
        this.power = power;
        this.channel = channel;
    }

    public Tv() {
    }

    void power() {
        power = !power;
    }

    void channelup() {
        channel++;

    }

    void channeldown() {
        channel--;
    }

    public boolean isPower() {
        return power;
    }

    public int getChannel() {
        return channel;
    }

}
