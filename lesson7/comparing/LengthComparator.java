package homework.lesson7.comparing;

import java.util.Comparator;

public class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        int result = Integer.compare(a.length(), b.length());
        return (result == 0) ? b.compareTo(a) : result;
    }
}
