public class Circle extends Shape{
    public double radius;

    Circle() {
    }


    Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    public Shape clone() {
        return new Circle(this);
    }
}
