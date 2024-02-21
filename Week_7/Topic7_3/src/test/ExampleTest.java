package test;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTest {

    @Test
    public void testAssertions() {
        assertEquals("Failure - strings are not equal", "text", "text");
        assertTrue("Failure - should be true", true);
        assertFalse("Failure - should be false", false);
        assertNotNull("Should not be null", new Object());
        assertNull("Should be null", null);
        
        Object obj = new Object();
        assertSame("Should be same object", obj, obj);
        assertNotSame("Should not be same object", new Object(), new Object());
        
        int[] expectedArray = {1, 2, 3};
        int[] resultArray = {1, 2, 3};
        assertArrayEquals("Failure - byte arrays not same", expectedArray, resultArray);
    }
}
