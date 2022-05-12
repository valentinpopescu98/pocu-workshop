package ex4_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Demo {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        System.out.println(numbers);

        numbers.add(1);
        System.out.println(numbers);

        numbers.add(2);
        System.out.println(numbers);

        numbers.add(3);
        System.out.println(numbers);

        numbers.poll();
        System.out.println(numbers);

        numbers.poll();
        System.out.println(numbers);

        numbers.poll();
        System.out.println(numbers);
    }
}
