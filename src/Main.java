import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        ArrayList<IShape> shapes = new ArrayList<IShape>(Arrays.asList(
                new Square(4,5),
                new Square(6,5),
                new Square(4,7),
                new Triangle(4,6),
                new Triangle(4,4),
                new Rectangular(6,8),
                new Rectangular(6,2),
                new Circle(3)
        ));

        for(IShape newShape : shapes){
            System.out.println(newShape.calculateArea());
        }

    }
}
