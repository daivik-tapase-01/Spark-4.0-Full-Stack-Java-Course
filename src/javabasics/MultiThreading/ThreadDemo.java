package javabasics.MultiThreading;

class Mythread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread child class");

//        for (int i = 0; i < 5; i++) {
//            System.out.println("child Thread");
//        }

        System.out.println("child thread name: " + Thread.currentThread().getName());
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.start();

        t1.run(); // no multithreading normal execution

        System.out.println("thread name: " + Thread.currentThread().getName());

//        for (int i = 0; i < 5; i++) {
//            System.out.println("main");
//        }


    }
}
