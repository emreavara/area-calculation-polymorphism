public class Triangle extends Shape{

    private double verticalHeight;

    public Triangle(double length, double verticalHeight) {
        super(length);
        this.verticalHeight = verticalHeight;
    }

    @Override
    public double calculateArea() {
        return verticalHeight*getLength()/2;
    }
}
