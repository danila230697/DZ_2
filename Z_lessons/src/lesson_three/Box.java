package lesson_three;

import java.util.Objects;

public class Box implements Comparable {
    private int width;
    private int height;

    protected Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    protected int getWidth() {
        return width;
    }

    protected void setWidth(int width) {
        this.width = width;
    }

    protected int getHeight() {
        return height;
    }

    protected void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Box(" + width + ", " + height + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box)) return false;
        Box box = (Box) o;
        return width == box.width &&
                height == box.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public int compareTo(Object o) {
        Box box = (Box) o;
        int sq = square();
        int boxSq = box.square();
        return square() - box.square();
    }

    public int square() {
        return width * height;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if ( !(obj instanceof Box)) return false;
//        Box b = (Box) obj;
//
//        return width == b.width && height == b.height;
//    }
}
