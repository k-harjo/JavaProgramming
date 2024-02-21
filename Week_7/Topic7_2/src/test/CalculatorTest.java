package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorTest {

    enum Type {ADD, SUBTRACT, MULTIPLY, DIVIDE;}

    @Parameter(0)
    public Type type;

    @Parameter(1)
    public int a1;

    @Parameter(2)
    public int a2;

    @Parameter(3)
    public double result; // Changed to double to accommodate division results that may be fractions.

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Type.ADD, 2, 1, 3},
                {Type.ADD, 5, 2, 7},
                {Type.SUBTRACT, 2, 1, 1},
                {Type.SUBTRACT, 5, 2, 3},
                {Type.MULTIPLY, 2, 1, 2},
                {Type.MULTIPLY, 5, 2, 10},
                {Type.DIVIDE, 2, 1, 2},
                {Type.DIVIDE, 5, 2, 2.5}
        });
    }

    @Test
    public void testCalculatorOperations() {
        Calculator calc = new Calculator(); // Assuming Calculator class is in the default package, adjust import if not.
        double actualResult = 0;
        switch (type) {
            case ADD:
                actualResult = calc.add(a1, a2);
                break;
            case SUBTRACT:
                actualResult = calc.subtract(a1, a2);
                break;
            case MULTIPLY:
                actualResult = calc.multiply(a1, a2);
                break;
            case DIVIDE:
                actualResult = calc.divide(a1, a2); // Assuming divide method returns a double, adjust if not.
                break;
        }
        assertEquals(result, actualResult, 0.0); // Use delta for floating-point comparison.
    }
}
