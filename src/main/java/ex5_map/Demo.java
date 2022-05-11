package ex5_map;

import utils.IntegerWrapper;

import java.util.List;

import static utils.ListMaker.makeList;

public class Demo {
    public static void main(String[] args) {
        List<IntegerWrapper> lst = makeList();

        lst.stream()
           .map(IntegerWrapper::getId)
           .forEach(System.out::println);
    }
}
