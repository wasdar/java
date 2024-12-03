package lab10;
public class ComparableCircle extends Circle {
    public ComparableCircle(double radius) {
        super(radius);
    }

    public boolean equals(Object obj) {
        return obj instanceof ComparableCircle && this.getArea() == ((ComparableCircle)obj).getArea();
    }
}
