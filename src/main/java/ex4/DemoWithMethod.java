package ex4;

import java.util.List;

public class DemoWithMethod {
    static <T extends Number>void showClasses(List<T> lst) {
        for (T element : lst) {
            System.out.println(element.getClass());
        }
    }

    public static void main(String[] args) {
//        showClasses(List.of(5, 5.0, "5")); // Compilation error: incompatible types
//        showClasses(List.of(5, 5.0, new Object())); // Compilation error: incompatible types
        showClasses(List.of(5, 5.0)); // Works
    }
}
