package org.example;

import org.example.interfaces.CalculateTriangleArea;
import org.example.triangles.EquilateralTriangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EquilateralAreaCalculatorTest {

    @Test
    public void shouldCalcAreaEquilateralTriangle() {
        CalculateTriangleArea triangle = new EquilateralTriangle(8);
        double area = triangle.calculateArea();
        Assertions.assertEquals(27.7128, area, 0.0001);
    }

    @Test
    public void shouldReturnExceptionWithInvalidSide() {
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> new EquilateralTriangle(-8)
        );
    }

}
