package org.example;

public class TriangleAreaCalculator {
    private double base;
    private double height;

    public TriangleAreaCalculator(double base, double height) {
        setBase(base);
        setHeight(height);
    }

    public double calcAreaCommonTriangle() {
        return base * height / 2;
    }

    public double calcAreaEquilateral(double side) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("The base and height must be greater than zero");
        }
        return (Math.pow(side, 2) * Math.sqrt(3)) / 4;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("The base must be greater than zero");
        }
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0){
            throw new IllegalArgumentException("The height must be greater than zero");
        }
        this.height = height;
    }
}
