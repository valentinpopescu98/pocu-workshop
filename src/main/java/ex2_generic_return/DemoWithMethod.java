package ex2_generic_return;

public class DemoWithMethod {
    static <T>T showClass(T a) {
        return a;
    }

    public static void main(String[] args) {
        Number integerVar = showClass(5);
        Number doubleVar = showClass(5.0);
//        Number stringVar = showClass("5"); // Compilation error: incompatible types

        System.out.println(integerVar.getClass());
        System.out.println(doubleVar.getClass());
//        System.out.println(stringVar.getClass());
    }
}
