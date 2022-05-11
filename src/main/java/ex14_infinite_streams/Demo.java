package ex14_infinite_streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> new Random().nextInt();

        Stream<Integer> numbers1 = Stream.iterate(0, x -> x + 1);
        Stream<Integer> numbers2 = Stream.generate(supplier);

        numbers1.limit(10)
                .forEach(System.out::println);

        System.out.println();
        numbers2.limit(15)
                .forEach(System.out::println);
    }
}
