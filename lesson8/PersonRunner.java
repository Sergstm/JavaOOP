package homework.lesson8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonRunner {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("John"));
        people.add(new Person(" "));
        people.add(new Person("Diana"));
        people.add(new Person(null));
        people.add(new Person("Mary"));

        System.out.println("In list:");
        for (Person person : people) {
            System.out.println("Name: " + person.getName());
        }

        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person elem = iterator.next();
            if (elem.getName() == null || elem.getName().compareTo(" ") == 0) {
                iterator.remove();
            }
        }
        
        System.out.println("===========");
        System.out.println("Out list:");
        people.forEach(elem -> System.out.println("Name: " + elem.getName()));
    }
}
