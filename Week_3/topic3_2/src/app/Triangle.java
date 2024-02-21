package app;


public class Triangle extends ShapeBase {
    public Triangle(String name, double width, double height) {
        super(name, width, height);
    }

    @Override
    public double calculateArea() {
        // Calculate the area of a triangle
        return (width * height) / 2;
    }
}
