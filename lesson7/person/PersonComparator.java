package homework.lesson7.person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        int result = Integer.compare(b.getAge(), a.getAge());
        return (result == 0) ? a.getName().compareTo(b.getName()) : result;
    }
}
