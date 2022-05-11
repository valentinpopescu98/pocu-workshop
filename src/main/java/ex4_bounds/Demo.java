package ex4_bounds;

import java.util.List;

public class Demo {
    static void showNumbersAndChildren(List<? extends Number> lst) {
        for (Number element : lst) {
            System.out.println(element);
        }
    }

    static void showIntegersAndParents(List<? super Integer> lst) {
        for (Object element : lst) {
            System.out.println(element);
        }
    }

    static void showAnything(List<?> lst) {
        for (Object element : lst) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Number numberImpl = new Number() {
            @Override
            public int intValue() {
                return 0;
            }

            @Override
            public long longValue() {
                return 0;
            }

            @Override
            public float floatValue() {
                return 0;
            }

            @Override
            public double doubleValue() {
                return 0;
            }
        };

        List<Integer> integerList = List.of(1);
        List<Double> doubleList = List.of(1.0);
        List<Number> numberList = List.of(numberImpl);
        List<Object> objectList = List.of(new Object());

        showNumbersAndChildren(integerList);
        showNumbersAndChildren(doubleList);
        showNumbersAndChildren(numberList);
//        showNumbersAndChildren(objectList); // Compilation error: incompatible types

        showIntegersAndParents(integerList);
//        showIntegersAndParents(doubleList); // Compilation error: incompatible types
        showIntegersAndParents(numberList);
        showIntegersAndParents(objectList);

        showAnything(integerList);
        showAnything(doubleList);
        showAnything(numberList);
        showAnything(objectList);
    }
}
