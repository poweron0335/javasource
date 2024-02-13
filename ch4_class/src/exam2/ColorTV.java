package exam2;

public class ColorTV extends TV {

    protected int color;

    public ColorTV(int size1, int color) {
        super(size1);
        this.color = color;
    }

    public void printProperty() {
        System.out.printf("%d 인치 %d 컬러\n", getSize(), color);
    }

}
