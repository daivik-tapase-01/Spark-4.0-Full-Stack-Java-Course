package javabasics.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberTest {
    public static void main(String[] args) {
        List<NumberDemo> al = new ArrayList<>();
        al.add(new NumberDemo(10));
        al.add(new NumberDemo(17));
        al.add(new NumberDemo(53));
        al.add(new NumberDemo(34));
        System.out.println(al);

        Collections.sort(al);
        System.out.println(al);

    }
}
