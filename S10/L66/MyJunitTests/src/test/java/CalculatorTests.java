import org.junit.jupiter.api.*;

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

    @Test
    public void addTest() {
        double result = calculatorDemo.add(1.2, 1.3);
        Assertions.assertEquals(2.6, result, "Calculator sum is not expected");
    }

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
