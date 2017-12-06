package homework.lesson2.rectangle;

public class Rectangle {

    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int perimetr() {
        return 2 * (width + height);
    }

    public int area() {
        return width * height;
    }

    @Override
    public String toString() {
        int res = width * height;
        return String.valueOf(res);
    }
}
