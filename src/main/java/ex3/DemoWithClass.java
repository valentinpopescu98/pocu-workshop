package ex3;

public class DemoWithClass {
    public static void main(String[] args) {
        MyClass<Number> myClass = new MyClass<>();

        System.out.println(myClass.showClass(5).getClass());
        System.out.println(myClass.showClass(5.0).getClass());
//        System.out.println(myClass.showClass("5").getClass()); // Compilation error: incompatible types
    }
}
