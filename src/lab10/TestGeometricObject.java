package lab10;

public class TestGeometricObject {
    public TestGeometricObject() {
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(6.0);
        Circle circle2 = new Circle(8.0);
        GeometricObject largestCircle = GeometricObject.max(circle1, circle2);
        System.out.println("Больший круг: " + String.valueOf(largestCircle));
        Rectangle rectangle1 = new Rectangle(3.0, 4.0);
        Rectangle rectangle2 = new Rectangle(2.0, 6.0);
        GeometricObject largestRectangle = GeometricObject.max(rectangle1, rectangle2);
        System.out.println("Больший прямоугольник: " + String.valueOf(largestRectangle));
    }
}
