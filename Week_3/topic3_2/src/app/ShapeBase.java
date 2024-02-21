package app;

public class ShapeBase implements ShapeInterface {
    protected double width;
    protected double height;
    protected String name;

    // Constructor with a String parameter
    public ShapeBase(String name) {
        this.name = name;
    }

    // Constructor with width, height, and name parameters
    public ShapeBase(String name, double width, double height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    @Override
    public double calculateArea() {
        return -1;
    }
}
