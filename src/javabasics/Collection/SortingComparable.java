package javabasics.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortingComparable {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(9);
        arrayList.add(1);
        arrayList.add(34);
        arrayList.add(4);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
