package homework.lesson9.categories;

import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class PersonByAgeFinder {

    private Map<String, Integer> mapList = new TreeMap<>();

    PersonByAgeFinder(List<Person> people) {
        for (Person person : people) {
            mapList.put(person.getName(), person.getAge());
        }
    }

    public Map<String, Integer> findWithAge(int fromAge, int toAge) {
        NavigableMap<String, Integer> result = new TreeMap<>();

        mapList.entrySet().stream()
                .filter(entry -> entry.getValue().compareTo(fromAge) >= 0
                        && entry.getValue().compareTo(toAge) <= 0)
                .forEach(entry -> result.put(entry.getKey(), entry.getValue()));
        return result;
    }

    public Map<String, Integer> findYoungestOlderThan(int age) {
        NavigableMap<String, Integer> resultMap = new TreeMap<>();
        Map<String, Integer> result = new TreeMap<>();

        mapList.entrySet().stream()
                .filter(entry -> entry.getValue().compareTo(age) > 0)
                .forEach(entry -> resultMap.put(entry.getKey(), entry.getValue()));

        Map.Entry<String, Integer> minElement = resultMap.firstEntry();
        result.put(minElement.getKey(),minElement.getValue());

        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            if (entry.getValue().compareTo(minElement.getValue()) < 0) {
                result.clear();
                minElement = entry;
                result.put(minElement.getKey(), minElement.getValue());
            }
        }
        return result;
    }

    public Map<String, Integer> findOldestYoungerThan(int age) {
        NavigableMap<String, Integer> resultMap = new TreeMap<>();
        Map<String, Integer> result = new TreeMap<>();

        mapList.entrySet().stream()
                .filter(entry -> entry.getValue().compareTo(age) < 0)
                .forEach(entry -> resultMap.put(entry.getKey(), entry.getValue()));

        Map.Entry<String, Integer> maxElement = resultMap.firstEntry();
        result.put(maxElement.getKey(),maxElement.getValue());

        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            if (entry.getValue().compareTo(maxElement.getValue()) > 0) {
                result.clear();
                maxElement = entry;
                result.put(maxElement.getKey(), maxElement.getValue());
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "PersonByAgeFinder{" +
                "mapList=" + mapList +
                '}';
    }
}
