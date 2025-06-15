package javabasics.ExceptionHandling;

import java.io.FileReader;

public class TestException {
    public static void main(String[] args) {
        System.out.println("hello Daivik");
        System.out.println("How are you");
        // runtime arithmetic exception

        //System.out.println(10/0);

        System.out.println("I am good");

        // file not found exception -> full checked

//        FileReader file = new FileReader("notes.txt");

        // index out of bound

//        int[] arr = {10,11};
//        System.out.println(arr[4]);

        m1();
    }

    public static void m1(){
//        System.out.println(10/0);
        m2();
        System.out.println("m1");
    }

    public static void m2(){
        System.out.println(10/0);
        System.out.println("m2");
    }

}
