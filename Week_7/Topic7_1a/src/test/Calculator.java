package test; //use the junit package as instructed

public class Calculator {

	public int add(int a, int b) {
	    return a + b; // 
	}

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            System.out.println("Division: 6 / 0 = " + calculator.divide(6, 0)); // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // Print a user-friendly message instead of the full stack trace
        }
    
        // Test the add method
        System.out.println("Addition: 2 + 3 = " + calculator.add(2, 3));

        // Test the subtract method
        System.out.println("Subtraction: 5 - 3 = " + calculator.subtract(5, 3));

        // Test the multiply method
        System.out.println("Multiplication: 2 * 3 = " + calculator.multiply(2, 3));

        // Test the divide method
        try {
            System.out.println("Division: 6 / 3 = " + calculator.divide(6, 3));
            System.out.println("Division: 6 / 0 = " + calculator.divide(6, 0)); // This will throw an exception
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
