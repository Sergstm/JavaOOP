package homework.lesson2.immutable;

public class LineRunner {
    public static void main(String[] args) {

        //Point
        Point point = new Point(5, 10);
        Point point1 = new Point(50, 20);
        Point point2 = new Point(15, 20);
        Point point3 = new Point(50, 20);

        double pointX = point.getX();
        double pointY = point.getY();
        System.out.println("Point X = "+ pointX + "\nPoint Y = " + pointY);

        //Line
        Line line = new Line(point, point1);
        Line line1 = new Line(point2, point3);

        double length = line.getLength();
        System.out.println("Line length = " + length);

        //LinesArray
        Lines lines = new Lines();
        lines.add(line);
        lines.add(line1);

        System.out.println("LengthSum all lines = " + lines.sumLength());

        Line longestLine = lines.longestLine();
        System.out.println("LongestLine = " + longestLine);

    }
}
