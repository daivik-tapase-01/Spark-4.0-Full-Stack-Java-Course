package javabasics.Interfaces;

public interface Animal {
    void makeSound();
    void eat();
}

class Dog implements Animal{

    @Override
    public void makeSound() {
        System.out.println("makeSound: Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("eats: milk-roti");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.makeSound();
    }

}