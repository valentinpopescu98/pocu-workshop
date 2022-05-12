package ex6_map;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("nr1", 1);
        numbers.put("nr2", 2);
        numbers.put("nr3", 3);
        numbers.put("nr4", 4);

        for (var number : numbers.entrySet()) {
            System.out.println(number);
        }

        System.out.println(numbers.get("nr3"));
        System.out.println(numbers.get("nr2"));
        System.out.println(numbers.get("nr1"));
        System.out.println(numbers.get("nr4"));
    }
}
