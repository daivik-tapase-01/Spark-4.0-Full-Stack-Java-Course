package javabasics.day4;

public class day4 {

    // Instance
    String name = "daivik";
    int age = 20;
    static String course = "javabasics";

    public static void main(String[] args) {

        // // break -> break from loop
        // for (int i = 0; i <= 10; i++) {
        // if (i == 5) {
        // break;
        // }
        // System.out.println("Hello World! " + i);
        // }

        // // continue -> don`t do the task go to next task
        // for (int i = 0; i <= 10; i++) {
        // if (i % 3 == 0) {
        // continue; // multiple of 3 will not be printed
        // }
        // System.out.println(i);
        // }

        // for (int i = 0; i <= 10; i++) {
        // if (i % 2 == 0) {
        // continue;
        // }
        // System.out.println(i);
        // }

        // // Variable Scope
        // //---------------------

        // instance variable ->inside class outside method --> to use variable from
        // instance we have to create object or use static keyword ,

        // local variable -> method ,

        // static variable -> static area -> static can be used in instance and local
        // area

        // course = "DSA";
        // day4 s = new day4(); // object is reference variable / call
        // System.out.println("name: " + s.name);
        // System.out.println("age: " + s.age);
        // System.out.println("course:" + course);

        // s.name = "vaibhav";
        // System.out.println("name: " + s.name);

        // day4 s1 = new day4(); // we get seperate copy of object for instance variable
        // System.out.println("name: " + s1.name);
        // System.out.println("age: " + s1.age);
        // System.out.println("course: " + course); // static can change amd we get
        // single of variable

        // s.display();

        // // functions
        // //--------------------
        // day4 m = new day4();

        // // type-1 no parameter, no return
        // m.greet();

        // // type-2 with parameter, no return
        // m.displayName("daivik");

        // // type-3 no parameter, with return
        // String otp = m.otpGen();
        // System.out.println("OTP: " + otp);

        // // type-4 with parameter, with return
        // int sum = m.sum(10, 20);
        // System.out.println("Sum: " + sum);

        // // Array in Java
        // //------------------

        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println(arr[3]);

    }

    // public void display() {
    // String name = "daivik";
    // System.out.println("Name: " + name);
    // }

    // // type-1 no parameter, no return
    // public void greet() {
    // System.out.println("Good morning!");
    // }

    // // type-2 with parameter, no return
    // public void displayName(String name) {
    // System.out.println("name: " + name);
    // }

    // // type-3 no parameter, with return
    // public String otpGen() {
    // return "932634";
    // }

    // // type-4 with parameter, with return
    // public int sum(int a, int b) {
    // int sum = a + b;
    // return sum;
    // }
}
