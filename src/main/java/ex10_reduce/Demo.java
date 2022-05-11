package ex10_reduce;

import utils.IntegerWrapper;

import java.util.List;

import static java.util.Comparator.comparing;
import static utils.ListMaker.makeList;

public class Demo {
    public static void main(String[] args) {
        List<IntegerWrapper> lst = makeList();

        int sum1 = lst.stream()
                      .map(IntegerWrapper::getValue)
                      .reduce(0, (a, b) -> a + b);

        int sum2 = lst.stream()
                      .map(IntegerWrapper::getValue)
                      .reduce(0, Integer::sum);

        int sum3 = lst.stream()
                      .mapToInt(IntegerWrapper::getValue)
                      .sum();

        int max1 = lst.stream()
                      .map(IntegerWrapper::getValue)
                      .reduce(0, Integer::max);

        int max2 = lst.stream()
                      .map(IntegerWrapper::getValue)
                      .max(Integer::compareTo)
                      .get();

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(max1);
        System.out.println(max2);
    }
}
