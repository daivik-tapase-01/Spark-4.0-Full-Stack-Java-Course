package javabasics.ExceptionHandling;

import java.security.spec.ECField;

public class PracticeProblems {
    public static void main(String[] args) {

        // Q1
        System.out.println("Hello");

        try{
            System.out.println("I am");
        }catch (Exception e1){
            System.out.println("Exception");
        }
        System.out.println("Done Q1");

        // Q2
       try{
           int x = 100 / 0;
           System.out.println("Hello Q2");
       }catch(ArithmeticException e2){
           System.out.println("Exception e2");
       }
       System.out.println("Done Q2");

       // Q3
        try{
            int[] arr3 = {10,20,30};
            System.out.println(arr3[4]);
        }
        catch (ArithmeticException e3) {
            System.out.println("Arithmetic");
        }
        catch (ArrayIndexOutOfBoundsException e3) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (Exception e3){
            System.out.println("Exception");
        }
        finally{
            System.out.println("Done Q3");
        }

        // Q4
        try{
            try{
                int a = 10/0;
            }
            catch (NullPointerException e4) {
                System.out.println("inner catch");
            }
            catch (ArithmeticException e4){
                System.out.println("inner catch-Arith");
            }
        }
        catch (Exception e) {
            System.out.println("outer catch");
        }
        System.out.println("Done Q4");

        // Q5
        System.out.println("Q5 " + m1());

        // Q6
        System.out.println("Q6 " + m2());

    }
    public static int m1(){
        try{
            return 100;   // 100
        }catch (Exception e5){
            return 3;
        }finally {
            return 10;   // 100 -> 10
        }
    }

    public static int m2(){
        try{
            return 10;
        }finally {
            System.out.println("finally Q6......");
        }
    }
}
