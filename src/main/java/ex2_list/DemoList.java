package ex2_list;

import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3);

        for (var number : numbers) {
            System.out.printf("%d ", number);
        }
    }
}
