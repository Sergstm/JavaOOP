package homework.lesson2.rectangle;

public class RectangleRunner {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(5, 4);
        Rectangle rect1 = new Rectangle(20, 10);

        System.out.println("Object perimetr = " + rect.perimetr());
        System.out.println("Object area = " + rect.area());

        Rectangles rectangles = new Rectangles();

        rectangles.addNew(rect);
        rectangles.addNew(rect1);

        int areaSum = rectangles.sumArea();
        System.out.println("AreaSum all elements = " + areaSum);
    }
}
