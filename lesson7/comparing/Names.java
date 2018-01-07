package homework.lesson7.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Names {

    private List<String> names = new ArrayList<>();

    private List<String> getNames() {
        return names;
    }

    public void add(String name) {
        names.add(name);
    }

    public List<String> sortName() {
        Collections.sort(this.getNames());
        return names;
    }

    public List<String> reverseSortName() {
        Collections.reverse(this.getNames());
        return names;
    }

    public String minName() {
        Collections.sort(this.getNames());
        return Collections.min(this.getNames(), new MinComparator());
    }

    public List<String> sortLengthName() {
        Collections.sort(this.getNames(), new MinComparator());
        return names;
    }

    public List<String> sortGroupName() {
        Collections.sort(this.getNames(), new LengthComparator());
        return names;
    }

    @Override
    public String toString() {
        return "Names{" +
                "names=" + names +
                '}';
    }
}
