package ex4;

import java.util.List;

public class MyClass<T> {
    void showClasses(List<T> lst) {
        for (T element : lst) {
            System.out.println(element.getClass());
        }
    }
}
