package ex4_sorted;

import utils.IntegerWrapper;

import java.util.List;

import static java.util.Comparator.comparing;
import static utils.ListMaker.makeList;

public class Demo {
    public static void main(String[] args) {
        List<IntegerWrapper> lst = makeList();

        lst.stream()
           .sorted(comparing(IntegerWrapper::getValue))
           .forEach(x -> System.out.printf("id: %s, value: %s\n", x.getId(), x.getValue()));
    }
}
