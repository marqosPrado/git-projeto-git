package org.example.triangles;

import org.example.interfaces.CalculateTriangleArea;

public class IsoscelesTriangle implements CalculateTriangleArea {
    private double base;
    private double height;

    public IsoscelesTriangle(double base, double height) {
        setBase(base);
        setHeight(height);
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }

    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("The base must be greater than zero");
        }
        this.base = base;
    }

    public void setHeight(double height) {
        if (height <= 0){
            throw new IllegalArgumentException("The height must be greater than zero");
        }
        this.height = height;
    }
}
