import calculators.AbstractCalculator;
import calculators.IntegerCalcImpl;

import org.junit.Test;
import static org.junit.Assert.*;

public class LauncherTest {


    @Test
    public void TestAddition() {
        String[] input = "10 + 2 + 5".split(" ");
        AbstractCalculator calculator = new IntegerCalcImpl();
        assertEquals(17, calculator.executeCalculation(input));
    }

    @Test
    public void TestMultiply() {
        String[] input = "10 * 10 * 2".split(" ");
        AbstractCalculator calculator = new IntegerCalcImpl();
        assertEquals(200, calculator.executeCalculation(input));
    }

}