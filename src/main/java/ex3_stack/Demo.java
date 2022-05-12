package ex3_stack;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        System.out.println(numbers);

        numbers.push(1);
        System.out.println(numbers);

        numbers.push(2);
        System.out.println(numbers);

        numbers.push(3);
        System.out.println(numbers);

        numbers.pop();
        System.out.println(numbers);

        numbers.pop();
        System.out.println(numbers);

        numbers.pop();
        System.out.println(numbers);
    }
}
