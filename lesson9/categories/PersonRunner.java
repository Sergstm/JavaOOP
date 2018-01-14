package homework.lesson9.categories;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PersonRunner {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("Kevin", 11));
        list.add(new Person("Diana", 16));
        list.add(new Person("Kasey", 12));
        list.add(new Person("Ann", 17));
        list.add(new Person("Jane", 15));
        list.add(new Person("Bob", 20));
        list.add(new Person("Phillip", 17));
        list.add(new Person("John", 13));
        list.add(new Person("Liza", 19));

        PersonByAgeFinder person = new PersonByAgeFinder(list);
        Map<String, Integer> withAge = person.findWithAge(12, 17);
        Map<String, Integer> youngestOlderThan = person.findYoungestOlderThan(18);
        Map<String, Integer> oldestYoungerThan = person.findOldestYoungerThan(18);

        System.out.println(withAge);
        System.out.println(youngestOlderThan);
        System.out.println(oldestYoungerThan);
    }
}
