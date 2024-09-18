package ru.mirea.lab1;

public class Circle {
    double radius;
    // Конструктор без параметров
    Circle() {
        radius = 1;
    }

    // Конструктор с параметром
    Circle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }
}


