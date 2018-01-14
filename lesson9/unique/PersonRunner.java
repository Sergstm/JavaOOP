package homework.lesson9.unique;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PersonRunner {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("John", 30));
        list.add(new Person("Kasey", 29));
        list.add(new Person("Diana", 23));
        list.add(new Person("Ann", 25));
        list.add(new Person("Kasey", 29));
        list.add(new Person("Bob", 31));
        list.add(new Person("John", 30));

        Set<Object> set = new TreeSet<>();

        for (Person person : list) {
            set.add(person.getName());
        }

        set.forEach(System.out::println);
    }
}
