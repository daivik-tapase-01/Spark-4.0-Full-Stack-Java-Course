package javabasics.MultiThreading;

class YieldThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <=10 ; i++) {
            System.out.println(Thread.currentThread().getName()+" ... "+ i);
            Thread.yield();
        }
    }
}

class SleepThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(getName() +"----"+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
        }
    }
}

class JoinThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Child Tread");
        }
    }
}

public class Sleep {
    public static void main(String[] args) throws InterruptedException{
        YieldThread t1 = new YieldThread();
        YieldThread t2 = new YieldThread();

        t1.start();
        t2.start();

        SleepThread t3 = new SleepThread();
        t3.setName("Child-Thread");
        t3.start();

        JoinThread t4 = new JoinThread();
        t4.start();
        t4.join();
        // main - jo line execute karega wahi wait karega
        // main is running so it will wait

        for (int i = 0; i <= 5; i++) {
            System.out.println("main thread");
        }

    }
}
