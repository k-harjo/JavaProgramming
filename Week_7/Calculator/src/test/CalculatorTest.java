package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import test.Calculator; 

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals("Addition is incorrect", 3, calculator.add(2, 1)); 
    }
    

    @Test
    public void testSubtract() {
        assertEquals("Subtraction is incorrect", 1, calculator.subtract(2, 1));
    }

    @Test
    public void testMultiply() {
        assertEquals("Multiplication is incorrect", 2, calculator.multiply(2, 1));
    }

    @Test
    public void testDivide() {
        assertEquals("Division is incorrect", 2, calculator.divide(2, 1));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        calculator.divide(2, 0); // should throw ArithmeticException
    }
}
