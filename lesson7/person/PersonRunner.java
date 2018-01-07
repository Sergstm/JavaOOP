package homework.lesson7.person;

import java.util.ArrayList;
import java.util.List;

public class PersonRunner {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 30));
        people.add(new Person("Bob", 15));
        people.add(new Person("Mary", 15));
        people.add(new Person("Ann", 16));
        people.add(new Person("Kevin", 10));
        people.add(new Person("Dave", 15));
        people.add(new Person("Kasey", 19));

        people.stream()
                .filter(person -> person.getAge() >= 12 && person.getAge() <= 17)
                .sorted(new PersonComparator())
                .forEach(System.out::println);
    }
}
