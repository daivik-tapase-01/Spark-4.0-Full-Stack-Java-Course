package javabasics.OPPs;

class Species{
    void fly(){
        System.out.println("flying.");
    }
}
public class Animal extends Species{
    void eat() {
        System.out.println("animal is eating.");
    }

    void sound(){
        System.out.println("making sound tee tee....");
    }

    @Override
    void fly() {
        System.out.println("animal do not fly");
    }
}

class Dog extends Animal{
    @Override
    void eat(){
        // method overriding
        System.out.println("dog is eating.");
    }

    @Override
    void sound() {
        System.out.println("making sound bark bark.....");
    }
}
