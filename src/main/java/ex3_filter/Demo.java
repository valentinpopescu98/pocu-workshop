package ex3_filter;

import utils.IntegerWrapper;

import java.util.List;

import static utils.ListMaker.makeList;

public class Demo {
    public static void main(String[] args) {
        List<IntegerWrapper> lst = makeList();

        lst.stream()
           .filter(x -> x.getValue() % 2 == 0)
           .forEach(x -> System.out.printf("id: %s, value: %s\n", x.getId(), x.getValue()));
    }
}
