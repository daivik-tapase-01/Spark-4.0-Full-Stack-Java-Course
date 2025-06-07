package javabasics.day5;

public class Student {
    String name;
    int age;

    Student() {
        this("unknown", 0);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.details();
        s1.hello();

        Student s2 = new Student("daivik", 20);
        s2.details();
        s2.hello();

        // Student s3 = new Student();
        // s3.hello(s1.name);
        // s3.hello(s2.name);

    }

    void details() {
        System.out.println("name " + name + " age " + age);
    }

    void hello() {
        System.out.println("Hello " + name);
    }

    // void hello(String name) {
    // System.out.println("Hello " + name);
    // }
}
