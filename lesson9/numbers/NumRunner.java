package homework.lesson9.numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumRunner {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(5);

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer num : list) {
            if (map.containsKey(num)) {
                Integer counter = map.get(num);
                map.put(num, counter + 1);
            } else {
                map.put(num, 1);
            }
        }

        map.entrySet().forEach(System.out::println);
    }
}
