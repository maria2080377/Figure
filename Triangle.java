package org.example;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        // Проверяем, может ли существовать треугольник с такими сторонами
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }

        // Проверка неравенства треугольника
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new RuntimeException("There is no figure with such parameters.");
        }

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getArea() {
        // Формула Герона
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return String.format("Треугольник [стороны=%.2f,%.2f,%.2f, площадь=%.2f, периметр=%.2f]",
                sideA, sideB, sideC, getArea(), getPerimeter());
    }
}