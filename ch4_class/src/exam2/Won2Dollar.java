package exam2;

public class Won2Dollar extends Converter {

    @Override
    protected double convert(double src) {
        return src;
    }

    @Override
    protected String getSrcString() {
        System.out.print("원");
        return "";
    }

    @Override
    protected String getDestString() {
        return "";
    }

}
