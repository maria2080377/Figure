package org.example;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return String.format("Прямоугольник [длина=%.2f, ширина=%.2f, площадь=%.2f, периметр=%.2f]",
                length, width, getArea(), getPerimeter());
    }
}