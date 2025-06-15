package javabasics.ExceptionHandling;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class ThrowsDemo {
    public static void main(String[] args){
        try{
            m1();
        } catch (Exception e) {
            System.out.println("done main");
        }
        System.out.println("main");
    }


    public static void m1() throws FileNotFoundException {
        m2("notes.txt");
        System.out.println("m1");
    }

    public static void m2(String fileName) throws FileNotFoundException {

        System.out.println("m2");
//        File file = new File("notes.txt");

        try{
            FileReader fileReader = new FileReader(fileName);
        }
        finally {
            System.out.println("finally");
        }

    }


}
