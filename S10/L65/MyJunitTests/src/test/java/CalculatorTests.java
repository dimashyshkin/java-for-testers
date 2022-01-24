import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    @Test
    public void addTest() {
        CalculatorDemo calculatorDemo = new CalculatorDemo();
        double result = calculatorDemo.add(1.2, 1.3);
        Assertions.assertEquals(2.6, result, "Calculator sum is not expected");
    }

    @Test
    public void multiplyTest() {
        CalculatorDemo calculatorDemo = new CalculatorDemo();
        double result = calculatorDemo.multiply(2.1, 2);
        Assertions.assertEquals(4.2, result, "Calculator multiplication result is not expected");
    }
}
