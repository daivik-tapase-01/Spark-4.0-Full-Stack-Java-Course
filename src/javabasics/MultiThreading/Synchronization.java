package javabasics.MultiThreading;

class Addition{
    int sum = 0;
    synchronized public void add(){
        sum += 1;
    }
}

class MyThread3 extends Thread{

    Addition add;

    MyThread3(Addition add){
        this.add = add;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            add.add();
        }
    }
}

class MyThread4 extends Thread{

    Addition add;

    MyThread4(Addition add){
        this.add = add;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            add.add();
        }
    }
}


public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        Addition addition = new Addition();

        MyThread3 t3 = new MyThread3(addition);
        MyThread4 t4 = new MyThread4(addition);

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println("final sum : " + addition.sum);
    }
}
