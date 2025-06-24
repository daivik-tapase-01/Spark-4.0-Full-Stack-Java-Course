package javabasics.Interfaces;

public abstract class Vehicle {
    String brand;

    Vehicle(String brand){
        this.brand = brand;
    }

    abstract void start();

    public void hello(){
        System.out.println("Hello " + brand);
    }

}
