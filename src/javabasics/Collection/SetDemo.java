package javabasics.Collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(20);
        set.add(10);
        set.add(40);
        set.add(30);
        set.add(20);

        System.out.println(set);
        System.out.println(set);
    }
}
