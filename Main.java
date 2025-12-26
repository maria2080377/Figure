package org.example;

public class Main {
    public static void main(String[] args) {
        // Пример создания фигур
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Прямоугольник: " + rectangle);

        Circle circle = new Circle(4);
        System.out.println("Круг: " + circle);

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Треугольник: " + triangle);

        // Пример ошибки - неправильный треугольник
        try {
            Triangle badTriangle = new Triangle(1, 2, 10);
        } catch (RuntimeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}