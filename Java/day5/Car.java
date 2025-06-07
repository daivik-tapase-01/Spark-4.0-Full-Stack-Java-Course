package Java.day5;

public class Car {

    int speed; // instance

    Car() {
        System.out.println("default constructor.....");
    }

    Car(int speed) {
        System.out.println("parameterized constructor.....");
        this.speed = speed;
    }

    public static void main(String[] args) {

        // // for each method
        // int[] forEacharr = { 1, 2, 3, 4, 5, 6 };
        // for (int data : forEacharr) {
        // System.out.println(data);
        // }

        // type of constructors
        // default and parameterized

        Car c1 = new Car();
        c1.run();

        Car c2 = new Car(80);
        c2.run();

    }

    void run() {
        System.out.println("car is running at: " + speed);
    }

}
