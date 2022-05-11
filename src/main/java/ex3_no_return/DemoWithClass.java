package ex3_no_return;

import java.util.List;

public class DemoWithClass {
    public static void main(String[] args) {
        MyClass<Number> myClass = new MyClass<>();

//        myClass.showClasses(List.of(5, 5.0, "5")); // Compilation error: incompatible types
//        myClass.showClasses(List.of(5, 5.0, new Object())); // Compilation error: incompatible types
        myClass.showClasses(List.of(5, 5.0)); // Works
    }
}
