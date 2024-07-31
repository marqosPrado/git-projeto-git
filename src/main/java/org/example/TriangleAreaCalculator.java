package org.example;

public class TriangleAreaCalculator {
    private double base;
    private double height;

    public TriangleAreaCalculator(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calcArea() {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("The base and height must be greater than zero");
        }
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
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
