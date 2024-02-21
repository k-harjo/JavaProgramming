package app;

public class Test {
    public static void main(String[] args) {
        // Create an array to hold shapes
        ShapeBase[] shapes = new ShapeBase[4];

        // Initialize array elements with different shapes
        shapes[0] = new Rectangle("Rectangle", 5, 10);
        shapes[1] = new Triangle("Triangle", 4, 6);
        shapes[2] = new Circle("Circle", 3);
        shapes[3] = new Hexagon("Regular Hexagon", 4);

        // Loop over the shapes array and display each shape's name and area
        for (ShapeBase shape : shapes) {
            displayArea(shape);
        }
    }

    // Private helper method to display the name and area of a shape
    private static void displayArea(ShapeBase shape) {
        System.out.println("Shape: " + shape.getName());
        System.out.println("Area: " + shape.calculateArea());
        System.out.println();
    }
}