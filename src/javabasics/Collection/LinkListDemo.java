package javabasics.Collection;

import java.util.LinkedList;

public class LinkListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("daivik");
        list.add("arjun");
        list.add("vaibhav");
        list.add("raj");
        list.add("rohit");

        String first = list.getFirst();
        String peek = list.peek();
        String last = list.getLast();
        String mid = list.get(2);

        System.out.println("first element: "+ first);
        System.out.println("peek element: "+ peek);
        System.out.println("last element: "+ last);
        System.out.println("mid element: "+ mid);



    }
}
