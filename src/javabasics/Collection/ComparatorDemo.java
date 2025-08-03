package javabasics.Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet<Studentsss> student = new TreeSet<>(new MyComparator());
        student.add(new Studentsss(34,"Abhay",78));
        student.add(new Studentsss(4,"Balu",39));
        student.add(new Studentsss(24,"Aman",56));
        student.add(new Studentsss(10,"Rahul",62));

        System.out.println(student);

        Comparator<Studentsss> byroll = (s1,s2) -> s1.roll - s2.roll;

        Comparator<Studentsss> studentComparator = Comparator.comparing(Studentsss::getName).thenComparing(Studentsss::getRoll);

    }
}
