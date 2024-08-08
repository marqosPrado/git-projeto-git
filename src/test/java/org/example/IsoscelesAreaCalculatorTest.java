package org.example;

import org.example.interfaces.CalculateTriangleArea;
import org.example.triangles.IsoscelesTriangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsoscelesAreaCalculatorTest {

    @Test
    public void shouldCalcAreaOfIsoscelesTriangle() {
        CalculateTriangleArea triangle = new IsoscelesTriangle(8, 7);
        double area = triangle.calculateArea();
        Assertions.assertEquals(28, area, 0.0001);
    }


    @Test
    public void shouldReturnExceptionWithZeroBase() {
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> new IsoscelesTriangle(0, 7)
        );
    }

    @Test
    public void shouldReturnExceptionWithNegativeBase() {
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> new IsoscelesTriangle(-8, 7)
        );
    }

    @Test
    public void shouldReturnExceptionWithZeroHeight() {
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> new IsoscelesTriangle(8, 0)
        );
    }

    @Test
    public void shouldReturnExceptionWithNegativeHeight() {
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> new IsoscelesTriangle(8, -7)
        );
    }
}
