package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
  private static final double DELTA = 0.001;

  @Test
  public void testAdd() {
    assertEquals(new Calculator().add(1, 1), 2, DELTA);
  }
}
