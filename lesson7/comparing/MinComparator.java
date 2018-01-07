package homework.lesson7.comparing;

import java.util.Comparator;

public class MinComparator implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        return Integer.compare(a.length(), b.length());
    }
}
