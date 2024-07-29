package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleAreaCalculatorTest {

    @Test
    public void shouldCalcArea() {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator(8, 7);
        double area = calculator.calcArea();
        Assertions.assertEquals(28, area);
    }

    @Test
    public void shouldReturnExceptionWithZeroBase() {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator(0, 7);
        Assertions.assertThrows(IllegalArgumentException.class, calculator::calcArea);
    }

    @Test
    public void shouldReturnExceptionWithNegativeBase() {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator(-8, 7);
        Assertions.assertThrows(IllegalArgumentException.class, calculator::calcArea);
    }

    @Test
    public void shouldReturnExceptionWithZeroHeight() {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator(8, 0);
        Assertions.assertThrows(IllegalArgumentException.class, calculator::calcArea);
    }

    @Test
    public void shouldReturnExceptionWithNegativeHeight() {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator(8, -7);
        Assertions.assertThrows(IllegalArgumentException.class, calculator::calcArea);
    }
}
