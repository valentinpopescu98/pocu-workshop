package ex7_collect;

import utils.IntegerWrapper;

import java.util.List;

import static utils.ListMaker.makeList;
import static java.util.stream.Collectors.toList;

public class Demo {
    public static void main(String[] args) {
        List<IntegerWrapper> lst = makeList();

        List<Integer> newLst = lst.stream()
                                  .map(x -> x.getValue() * 2)
                                  .collect(toList());

        newLst.forEach(System.out::println);
    }
}
