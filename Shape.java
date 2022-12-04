public abstract class Shape {
    public int x;
    public int y;
    private String color;

    //constructor
    Shape() {
    }
    
    // constructor
    Shape(Shape source) {
        this();
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    public abstract Shape clone();
}