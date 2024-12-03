package lab10;

import java.util.Arrays;

public class SortRectangle {
    public void SortRectangles() {
    }

    public static void main(String[] args) {
        ComparableRectangle[] rectangles = new ComparableRectangle[]{new ComparableRectangle(3.4, 5.4), new ComparableRectangle(13.24, 55.4), new ComparableRectangle(7.4, 35.4), new ComparableRectangle(1.4, 25.4)};
        Arrays.sort(rectangles);
        ComparableRectangle[] var2 = rectangles;
        int var3 = rectangles.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Rectangle rectangle = var2[var4];
            System.out.print(String.valueOf(rectangle) + " ");
            System.out.println();
        }

    }
}

