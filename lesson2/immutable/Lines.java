package homework.lesson2.immutable;

import org.omg.CORBA.Object;

import java.io.ObjectStreamField;
import java.util.ArrayList;
import java.util.Objects;

public class Lines {

    private ArrayList<Line> linesAry;

    public Lines() {
        linesAry = new ArrayList<>();
    }

    public void add(Line line) {
        linesAry.add(line);
    }

    public double sumLength() {
        double length = 0;
        for (Line elem : linesAry) {
            length += Double.parseDouble(String.valueOf(elem));
        }
        return length;
    }

    public Line longestLine() {
        Line line = null;
        double max = 0;
        for (Line elem : linesAry) {
            if (elem.getLength() > max) {
                max = elem.getLength();
                line = elem;
            }
        }
        return line;
    }
}
