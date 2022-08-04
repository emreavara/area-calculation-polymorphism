public class Circle extends Shape{
    static double PI = 3;
    public Circle(double length) {
        super(length);
    }
    @Override
    public double calculateArea(){
        return PI*getLength()*getLength();
    }
}
