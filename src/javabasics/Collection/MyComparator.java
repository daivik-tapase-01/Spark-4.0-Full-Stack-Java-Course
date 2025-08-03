package javabasics.Collection;

import java.util.Comparator;

public class MyComparator implements Comparator<Studentsss> {


    @Override
    public int compare(Studentsss o1, Studentsss o2) {
        return o1.name.compareTo(o2.name);
    }
}
