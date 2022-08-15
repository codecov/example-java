package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
  private static final double DELTA = 0.001;

  @Test
  public void testAdd() {
    assertEquals(Calculator.add(1, 2), 3.0, DELTA);
    assertEquals(Calculator.add(1.0, 2.0), 3.0, DELTA);
    assertEquals(Calculator.add(0, 2.0), 2.0, DELTA);
    assertEquals(Calculator.add(2.0, 0), 2.0, DELTA);
    assertEquals(Calculator.add(-4, 2.0), -2.0, DELTA);
  }

  @Test
  public void testSubtract() {
    assertEquals(Calculator.subtract(1, 2), -1.0, DELTA);
    assertEquals(Calculator.subtract(2, 1), 1.0, DELTA);
    assertEquals(Calculator.subtract(1.0, 2.0), -1.0, DELTA);
    assertEquals(Calculator.subtract(0, 2.0), -2.0, DELTA);
    assertEquals(Calculator.subtract(2.0, 0), 2.0, DELTA);
    assertEquals(Calculator.subtract(-4, 2.0), -6.0, DELTA);
  }

  @Test
  public void testMultiply() {
    assertEquals(Calculator.multiply(1, 2), 2.0, DELTA);
    assertEquals(Calculator.multiply(1.0, 2.0), 2.0, DELTA);
    assertEquals(Calculator.multiply(0, 2.0), 0.0, DELTA);
    assertEquals(Calculator.multiply(2.0, 0), 0.0, DELTA);
    assertEquals(Calculator.multiply(-4, 2.0), -8.0, DELTA);
  }

  @Test
  public void testDivide() {
    assertEquals(Calculator.divide(1, 2), 0.5, DELTA);
    assertEquals(Calculator.divide(1.0, 2.0), 0.5, DELTA);
    assertEquals(Calculator.divide(0, 2.0), 0, DELTA);
    assertEquals(Calculator.divide(-4, 2.0), -2.0, DELTA);
    // assertEquals(Calculator.divide(2.0, 0), 0.0, DELTA);
  }
}
