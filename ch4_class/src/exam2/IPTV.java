package exam2;

public class IPTV extends ColorTV {

    protected String ip;

    public IPTV(int size1, int color, String ip) {
        super(size1, color);
        this.ip = ip;
    }

    public void printProperty() {
        System.out.println("나의 IPTV는 " + ip + " " + getSize() + "인치" + " 컬러 " + color);
    }

}
