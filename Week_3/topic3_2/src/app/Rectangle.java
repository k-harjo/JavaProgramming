package app;

public class Rectangle extends ShapeBase {
    public Rectangle(String name, double width, double height) {
        super(name, width, height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
