package lab10;

public class TestColarable {
    public TestColarable() {
    }

    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[]{new Circle(2.0), new Rectangle(3.0, 4.0), new Square(5.0), new ComparableRectangle(6.0, 7.0), new Square(8.0)};
        GeometricObject[] var2 = objects;
        int var3 = objects.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            GeometricObject obj = var2[var4];
            System.out.println(obj);
            System.out.println("Площадь: " + obj.getArea());
            if (obj instanceof Colarable) {
                ((Colarable)obj).howToColor();
            }

            System.out.println();
        }

    }
}

