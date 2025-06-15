package javabasics.MultiThreading;

class MyRunThread extends Thread{
    // we have not given any task so this will not perform anything,
    // and we have not overridden this



}

public class RunOverride {
    public static void main(String[] args) {
        MyRunThread t1 = new MyRunThread() ;
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main");
        }
    }
}
