package org.example;

import org.example.interfaces.CalculateTriangleArea;
import org.example.triangles.ScaleneTriangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScaleneAreaCalculatorTest {

    @Test
    public void shouldCalcAreaOfScaleneTriangle() {
        CalculateTriangleArea triangle = new ScaleneTriangle(14, 9,7);
        double area = triangle.calculateArea();
        Assertions.assertEquals(26.833, area, 0.001);
    }

    @Test
    void shouldReturnExceptionWithZeroSideA() {
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> new ScaleneTriangle(0, 9, 7)
        );
    }

    @Test
    void shouldReturnExceptionWithNegativeSideA() {
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> new ScaleneTriangle(-14, 9, 7)
        );
    }

    @Test
    void shouldReturnExceptionWithZeroSideB() {
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> new ScaleneTriangle(14, 0, 7)
        );
    }

    @Test
    void shouldReturnExceptionWithNegativeSideB() {
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> new ScaleneTriangle(14, -9, 7)
        );
    }

    @Test
    void shouldReturnExceptionWithZeroSideC() {
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> new ScaleneTriangle(14, 9, 0)
        );
    }

    @Test
    void shouldReturnExceptionWithNegativeSideC() {
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> new ScaleneTriangle(14, 9, -7)
        );
    }
}
