package finalproject;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest 
{
    @Test(expected = RuntimeException.class)
    public void test1()
    {
        String ex = "Negatives not allowed";
        StringCalculator.add("-1,5");
        assertEquals("Negatives not allowed", ex);
    }

    @Test
    public void test2() {
        int sumNumber = StringCalculator.add("1,1000");
        assertEquals(1, sumNumber);
    }
}
