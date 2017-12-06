package homework.lesson2.rectangle;

import java.util.ArrayList;

public class Rectangles {

    private ArrayList<Rectangle> arrayList;

    public Rectangles() {
        arrayList = new ArrayList<>();
    }

    public void addNew(Rectangle rect) {
        arrayList.add(rect);
    }

    public int sumArea() {
        int sum = 0;
        for (Object elem : arrayList) {
            sum += Integer.parseInt(String.valueOf(elem));
        }
        return sum;
    }

}
