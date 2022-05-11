package ex2_create_streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Arrays.stream(new Integer[]{1, 2, 3, 4, 5});
        Stream<Integer> stream3 = Stream.<Integer>builder()
                                        .add(1).add(2).add(3).add(4).add(5)
                                        .build();

        stream1.forEach(x -> System.out.print(x + " "));
        System.out.println();
        stream2.forEach(x -> System.out.print(x + " "));
        System.out.println();
        stream3.forEach(x -> System.out.print(x + " "));
    }
}
