package ex11_finders_and_optionals;

import utils.IntegerWrapper;

import java.util.List;
import java.util.Optional;

import static utils.ListMaker.makeList;

public class Demo {
    public static void main(String[] args) {
        List<IntegerWrapper> lst = makeList();

        Optional<Integer> first = lst.stream()
                                     .map(x -> x.getValue())
                                     .filter(x -> x < 5)
                                     .findFirst();

        Optional<Integer> any = lst.stream()
                                   .map(x -> x.getValue())
                                   .filter(x -> x < 5)
                                   .findAny();

        Optional<Integer> firstLowerThanZero = lst.stream()
                                                  .map(x -> x.getValue())
                                                  .filter(x -> x < 0)
                                                  .findFirst();

        System.out.println(first);
        System.out.println(any);
        System.out.println(firstLowerThanZero);
        firstLowerThanZero.ifPresent(System.out::println);
    }
}
