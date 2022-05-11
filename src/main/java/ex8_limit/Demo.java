package ex8_limit;

import utils.IntegerWrapper;

import java.util.List;

import static utils.ListMaker.makeList;

public class Demo {
    public static void main(String[] args) {
        List<IntegerWrapper> lst = makeList();

        lst.stream()
           .limit(3)
           .forEach(x -> System.out.println(x.getValue()));
    }
}
