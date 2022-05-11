package utils;

import java.util.ArrayList;
import java.util.List;

public class ListMaker {
    public static List<IntegerWrapper> makeList() {
        List<IntegerWrapper> lst = new ArrayList<>();

        for (int i = 0; i < 10; i ++) {
            IntegerWrapper element = new IntegerWrapper();

            element.setId(i);
            element.setValue(9 - i);

            lst.add(element);
        }

        return lst;
    }
}
