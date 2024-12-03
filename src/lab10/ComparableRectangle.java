package lab10;

public class ComparableRectangle extends Rectangle {
    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    public boolean equals(Object obj) {
        return obj instanceof ComparableRectangle && this.getArea() == ((ComparableRectangle)obj).getArea();
    }
}

