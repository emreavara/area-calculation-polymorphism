public class Rectangular extends Shape {

    private double height;

    public Rectangular(double length, double height) {
        super(length);
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return height*getLength();
    }
}
