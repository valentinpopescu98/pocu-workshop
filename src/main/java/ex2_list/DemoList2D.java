package ex2_list;

import java.util.List;

public class DemoList2D {
    public static void main(String[] args) {
        List<List<Integer>> numbers = List.of(
                List.of(1, 2), List.of(3)
        );

        for (var list1D : numbers) {
            for (var number : list1D) {
                System.out.printf("%d ", number);
            }
            System.out.println();
        }
    }
}
