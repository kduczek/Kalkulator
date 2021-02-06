import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestClass {
    Calculator calculator = new Calculator();

    @Test
    public void constructorTest() {
        Assertions.assertNotNull(calculator);
    }

    @Test
    public void additionTest1() {
        Assertions.assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void additionTest2() {
        Assertions.assertEquals(-3, calculator.add(0, -3));
    }

    @Test
    public void additionTest3() {
        Assertions.assertEquals(0, calculator.add(0, 0));
    }

    @Test
    public void additionTest4() {
        Assertions.assertEquals(-58, calculator.add(-37, -21));
    }

    @Test
    public void subtractionTest1() {
        Assertions.assertEquals(0, calculator.subtract(2, 2));
    }

    @Test
    public void subtractionTest2() {
        Assertions.assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    public void subtractionTest3() {
        Assertions.assertEquals(-72, calculator.subtract(-76, -4));
    }

    @Test
    public void subtractionTest4() {
        Assertions.assertEquals(-34, calculator.subtract(-30, 4));
    }

    @Test
    public void multiplicationTest1() {
        Assertions.assertEquals(4, calculator.multiply(2,2));
    }

    @Test
    public void multiplicationTest2() {
        Assertions.assertEquals(0, calculator.multiply(0,0));
    }

    @Test
    public void multiplicationTest3() {
        Assertions.assertEquals(9, calculator.multiply(-3,-3));
    }

    @Test
    public void multiplicationTest4() {
        Assertions.assertEquals(-14, calculator.multiply(-7,2));
    }

    @Test
    public void divisionTest1() {
        Assertions.assertEquals(2, calculator.divide(4,2));
    }

    @Test
    public void divisionTest2() {
        Assertions.assertEquals(-4, calculator.divide(-16,4));
    }

    @Test
    public void divisionTest3() {
        Assertions.assertEquals(2, calculator.divide(-22,-11));
    }

    @Test
    public void divisionTest4() {
        double result = calculator.divide(4,0);
        Assertions.assertTrue(Double.isInfinite(result));
    }



    @Test
    public void gettersAndSettersTest() {
        final String firstNumber = "6.54";
        final String secondNumber = "3.25";

        calculator.setFirstNumber(Double.parseDouble(firstNumber));
        calculator.setSecondNumber(Double.parseDouble(secondNumber));

        Assertions.assertEquals(Double.parseDouble(firstNumber), calculator.getFirstNumber());
        Assertions.assertEquals(Double.parseDouble(secondNumber), calculator.getSecondNumber());
    }
}
