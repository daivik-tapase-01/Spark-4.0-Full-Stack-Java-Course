package javabasics.MultiThreading;

class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}


public class ThreadClass {
    public static void main(String[] args) {
        // start()
        // run()
        // getName()
        // setName()
        // setPriority()

        System.out.println(Thread.currentThread().getName());

        Thread t = Thread.currentThread();
        t.setName("mera thread");

        System.out.println(Thread.currentThread().getName());

        MyThread1 t1 = new MyThread1();
        t1.setName("Child-Thread");
        t1.start();

        MyThread2 t2 = new MyThread2();
        t2.setName("Thread-t2");
        t2.setPriority(Thread.MIN_PRIORITY);

        MyThread2 t3 = new MyThread2();
        t2.setName("Thread-t3");
        t2.setPriority(Thread.MAX_PRIORITY);

        t2.start();
        t3.start();


    }
}
