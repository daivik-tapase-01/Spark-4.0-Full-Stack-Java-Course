package javabasics.Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Object> set = new LinkedHashSet<>();
        set.add(10);
        set.add(50);
        set.add(30);
        set.add(10);
        set.add(20);

        System.out.println(set);
    }
}
