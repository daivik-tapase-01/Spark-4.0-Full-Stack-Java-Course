package javabasics.Interfaces;

public class Toyota extends Vehicle{
    Toyota(String brand) {
        super(brand); // parent class constructor

    }

    @Override
    void start() {
        System.out.println("Brand: Toyota");
    }

    public static void main(String[] args) {
        Toyota t1 = new Toyota("Toyota");
        t1.start();
        t1.hello();
    }
}
