package ex1_general_use;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> lst = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        lst.stream()
           .filter(x -> x % 2 == 0)
           .sorted()
           .forEach(System.out::println);

        System.out.println();
        lst.parallelStream()
           .filter(x -> x % 2 == 0)
           .sorted()
           .forEach(System.out::println);
    }
}
