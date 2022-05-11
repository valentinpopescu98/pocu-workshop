package ex3;

public class DemoWithMethod {
    static <T extends Number>T showClass(T a) {
        return a;
    }

    public static void main(String[] args) {
        System.out.println(showClass(5).getClass());
        System.out.println(showClass(5.0).getClass());
//        System.out.println(showClass("5").getClass()); // Compilation error: incompatible types
    }
}
