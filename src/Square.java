public class Square extends Shape {

    private double height;

    public Square(double length, double height) {
        super(length);
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return height*getLength();
    }
}
