import java.util.ArrayList;
import java.util.List;

public class Application {
    public List<Shape> shape = new ArrayList<Shape>();

    //constructor
    Application() {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 4.5;
        shape.add(circle);

        Circle circle2 = new Circle(circle);
        shape.add(circle2);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 67;
        rectangle.height = 99;
        shape.add(rectangle);
    }
    
    public void businessLogic() {
        List<Shape> copyOfShape = new ArrayList<Shape>();
        for (Shape item : shape) {
            copyOfShape.add(item);
        }
    }
}
