package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleAreaCalculatorTest {

    @Test
    public void shouldCalcArea() {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator(8, 7);
        double area = calculator.calcAreaCommonTriangle();
        Assertions.assertEquals(28, area);
    }

    @Test
    public void shouldCalcAreaEquilateral() {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator(8, 7);
        double area = calculator.calcAreaEquilateral(8);
        Assertions.assertEquals(27.7128, area, 0.0001);
    }

    @Test
    public void shouldReturnExceptionWithZeroBase() {
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> new TriangleAreaCalculator(0, 7)
        );
    }

    @Test
    public void shouldReturnExceptionWithNegativeBase() {
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> new TriangleAreaCalculator(-8, 7)
        );
    }

    @Test
    public void shouldReturnExceptionWithZeroHeight() {
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> new TriangleAreaCalculator(8, 0)
        );
    }

    @Test
    public void shouldReturnExceptionWithNegativeHeight() {
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> new TriangleAreaCalculator(8, -7)
        );
    }
}
