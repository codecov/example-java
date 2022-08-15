package io.codecov;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
  @Test
  public void testAdd() {
    assertEquals(new Calculator.add(1, 1), 2);
  }
}
