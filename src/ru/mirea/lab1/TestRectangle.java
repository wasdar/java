package ru.mirea.lab1;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println("ширина" + rectangle1.width + "высота" + rectangle1.height + "площадь" + rectangle1.getArea() + "периметр" + rectangle1.getPerimeter());
        Rectangle rectangle2 = new Rectangle(4,40);
        System.out.println("ширина" + rectangle2.width + "высота" + rectangle2.height + "площадь" + rectangle2.getArea() + "периметр" + rectangle2.getPerimeter());
        Rectangle rectangle3 = new Rectangle(3.5, 35.9);
        System.out.println("ширина" + rectangle3.width + "высота" + rectangle3.height + "площадь" + rectangle3.getArea() + "периметр" + rectangle3.getPerimeter());
    }
}
