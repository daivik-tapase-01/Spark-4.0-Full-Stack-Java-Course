package javabasics.Collection;

import java.util.LinkedList;

public class LinkListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("daivik");
        list.add("arjun");
        list.add("raj");
        list.add("rohit");

        String first = list.getFirst();
        String last = list.getLast();

        System.out.println("first element: "+ first);
        System.out.println("last element: "+ last);


    }
}
