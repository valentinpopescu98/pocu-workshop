package ex1_array;

public class DemoMatrix {
    public static void main(String[] args) {
        int[][] numbers = { {1, 2}, {3}};
        Integer[][] numbersWrapped = { {1}, {2}, {3}};

        for (var array : numbers) {
            for (var number : array) {
                System.out.printf("%d ", number);
            }
            System.out.println();
        }

        System.out.println();
        for (var array : numbersWrapped) {
            for (var number : array) {
                System.out.printf("%d ", number);
            }
            System.out.println();
        }
    }
}
