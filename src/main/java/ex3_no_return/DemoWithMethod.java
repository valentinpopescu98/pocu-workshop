package ex3_no_return;

import java.util.List;

public class DemoWithMethod {
    static <T>void showClasses(List<T> lst) {
        for (T element : lst) {
            System.out.println(element.getClass());
        }
    }

    public static void main(String[] args) {
//        showClasses(List.of(5, 5.0, "5")); // No error, because parameter type is <Object>
//        showClasses(List.of(5, 5.0, new Object())); // No error, because parameter type is <Object>

//        DemoWithMethod.<Number>showClasses(List.of(5, 5.0, "5")); // Compilation error: incompatible types
//        DemoWithMethod.<Number>showClasses(List.of(5, 5.0, new Object())); // Compilation error: incompatible types

        DemoWithMethod.<Number>showClasses(List.of(5, 5.0)); // Works
    }
}
