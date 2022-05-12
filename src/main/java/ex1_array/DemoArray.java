package ex1_array;

public class DemoArray {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3};
        Integer[] numbersWrapped = { 1, 2, 3};

        for (var number : numbers) {
            System.out.printf("%d ", number);
        }

        System.out.println();
        for (var number : numbersWrapped) {
            System.out.printf("%d ", number);
        }
    }
}
