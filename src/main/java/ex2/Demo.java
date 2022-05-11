package ex2;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();

        lst.add("Cristiano");
        lst.add("Ronaldo");
//        lst.add(7); // Compilation error: incompatible types

        String s1 = (String)lst.get(0);
        String s2 = (String)lst.get(1);
        String s3 = (String)lst.get(2);
    }
}
