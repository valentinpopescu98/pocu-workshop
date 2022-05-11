package ex1_basic_use;

import java.util.ArrayList;
import java.util.List;

public class DemoNoGeneric {
    public static void main(String[] args) {
        List lst = new ArrayList<>();

        lst.add("Cristiano");
        lst.add("Ronaldo");
        lst.add(7);

        String s1 = (String)lst.get(0);
        String s2 = (String)lst.get(1);
        String s3 = (String)lst.get(2); // Runtime exception: ClassCastException
    }
}
