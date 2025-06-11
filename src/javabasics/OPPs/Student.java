package javabasics.OPPs;

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
        s1.hello(s1);

        Student s2 = new Student("daivik", 20);
        s2.details();
        s2.hello(s2);

         Student s3 = new Student();
         s3.hello(s1);
         s3.hello(s2);

    }

    void details() {
        System.out.println("name " + name + " age " + age);
        hello(this);
    }

//    void hello() {
//        System.out.println("Hello " + name);
//    }

     void hello(Student s) {
     System.out.println("Hello " + s.name);
     }
}
