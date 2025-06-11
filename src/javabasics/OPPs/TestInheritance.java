package javabasics.OPPs;

public class TestInheritance {
    public static void main(String[] args) {
        
        Animal animal1 = new Animal();
        animal1.eat();
        animal1.sound();
        animal1.fly();

        Dog dog1 = new Dog();
        dog1.eat();
        dog1.sound(); // using method from animal
        dog1.fly();

    }
}
