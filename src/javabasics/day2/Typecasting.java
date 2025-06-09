package javabasics.day2;
public class Typecasting {
    public static void main(String[] args) {
        // Implicit casting
        // smaller datatype to bigger datatype
        // programmer doen`t need specifically instruct the compiler to perform it.
        int a = 2666;
        double b = a;
        System.out.println("b: " + b);

        // Explicit casting
        // bigger datatype to smaller datatype
        // programmer needs to specifically instruct the comiler to perform it.
        double c = 5.678;
        int d = (int) c;
        System.out.println("d: " + d);
    }
}