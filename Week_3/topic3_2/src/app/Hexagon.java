package app;


public class Hexagon extends ShapeBase {
    private double sideLength;

    public Hexagon(String name, double sideLength) {
        super(name);
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return (3 * Math.sqrt(3) * sideLength * sideLength) / 2;
    }
}