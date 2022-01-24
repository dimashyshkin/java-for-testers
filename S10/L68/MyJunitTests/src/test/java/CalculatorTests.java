import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculatorTests {
    private CalculatorDemo calculatorDemo;

    @BeforeAll
    public static void setupClass() {
        System.out.println("Set up class");
    }

    @BeforeEach
    public void setup() {
        System.out.println("Set up test");
        calculatorDemo = new CalculatorDemo();
    }

    public static double[][] data() {
        return new double[][] {{0, 1, 1}, {-1.5, 1.5, 0}, {2.5, 3.6, 6.1}};
    }

    @ParameterizedTest
    @MethodSource(value = "data")
    public void addTest(double[] data) {
        Assertions.assertEquals(data[2], calculatorDemo.add(data[0], data[1]), "Calculator sum is not expected");
    }

    @Disabled("Disabled until bug #99 has been fixed")
    @Test
    public void multiplyTest() {
        double result = calculatorDemo.multiply(2.1, 2);
        Assertions.assertEquals(4.2, result, "Calculator multiplication result is not expected");
    }

    @AfterEach
    public void teardown() {
        System.out.println("Tear down test");
    }

    @AfterAll
    public static void teardownClass() {
        System.out.println("Tear down class");
    }
}
