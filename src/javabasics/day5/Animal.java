package javabasics.day5;

public class Animal {
    void eat() {
        System.out.println("animal is eating.");
    }

    void sound(){
        System.out.println("making sound treee treee....");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("dog is eating.");
    }
}
