package javabasics.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(99);
        al.add(18);
        al.add(62);
        al.add(57);
        al.add(23);
        al.add(23);
        System.out.println(al);

        Collections.sort(al);
        System.out.println(al);

        System.out.println("--------------------");

        ArrayList<Students> arrayList = new ArrayList<>();
        Students s1 = new Students("raj",50);
        Students s2 = new Students("vinay",30);
        Students s3 = new Students("simran",60);

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);

        System.out.println("--------------------");

        ArrayList<Employee> emp = new ArrayList<>();
        Employee e1 = new Employee(11, "rohan","IT");
        Employee e2 = new Employee(6, "mohit","product");
        Employee e3 = new Employee(30, "harry","sales");

        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        System.out.println(emp);

        Collections.sort(emp, new Employee());
        System.out.println(emp);

    }
}
