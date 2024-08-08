package org.example.triangles;

import org.example.interfaces.CalculateTriangleArea;

public class ScaleneTriangle implements CalculateTriangleArea {
    private double sideA;
    private double sideB;
    private double sideC;

    public ScaleneTriangle(double sideA, double sideB, double sideC) {
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }

    @Override
    public double calculateArea() {
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(
                semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC)
        );
    }


    private void setSideA(double sideA) {
        if (sideA <= 0) {
            throw new IllegalArgumentException("The side must be greater than zero");
        }
        this.sideA = sideA;
    }

    private void setSideB(double sideB) {
        if (sideB <= 0) {
            throw new IllegalArgumentException("The side must be greater than zero");
        }
        this.sideB = sideB;
    }

    private void setSideC(double sideC) {
        if (sideC <= 0) {
            throw new IllegalArgumentException("The side must be greater than zero");
        }
        this.sideC = sideC;
    }
}
