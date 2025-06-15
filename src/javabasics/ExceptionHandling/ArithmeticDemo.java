package javabasics.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class ArithmeticDemo {
    public static void main(String[] args) {
        System.out.println("before exception");

        try{
            int a = 10/0 ;  // arithmetic exception --> runtime --> exception
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
//            System.exit(0);
//            e.printStackTrace();
        }finally {
            System.out.println("finally always runs");
        }

        System.out.println("after exception");

        // exception mismatch

        String n = null;

        try{
            int length = n.length();
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch(NullPointerException e1){
            System.out.println(e1.getMessage());
        }

        // child parent exception

        try{
            int length = n.length();
        }catch (ArithmeticException e){
            System.out.println("arithmetic...");
        }catch (NullPointerException e2){
            System.out.println("NullPointer...");
        }catch (Exception e1){
            System.out.println("exception");
        }

        // IO Exception

        FileReader file = null;
        try{
            file = new FileReader("notes.txt");
        }catch (IOException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }finally {
            // file.close();
            System.out.println("finally");
        }

    }
}
