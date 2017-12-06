package homework.lesson2.immutable;

public class Line {

    private final Point start;
    private final Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double getLength() {
        double length = 0;
        length = Math.sqrt(Math.pow((end.getX() - start.getX()), 2) +
                Math.pow((end.getY() - start.getY()), 2));
        return length;
    }

    @Override
    public String toString() {
        return String.valueOf(getLength());
    }
}
