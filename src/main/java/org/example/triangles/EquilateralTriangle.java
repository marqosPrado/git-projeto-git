package org.example.triangles;

import org.example.interfaces.CalculateTriangleArea;

public class EquilateralTriangle implements CalculateTriangleArea {
    private double side;

    public EquilateralTriangle(double side) {
        setSide(side);
    }

    @Override
    public double calculateArea() {
        return (Math.pow(side, 2) * Math.sqrt(3)) / 4;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("The side must be greater than zero");
        }
        this.side = side;
    }
}
