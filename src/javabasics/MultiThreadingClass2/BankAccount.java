package javabasics.MultiThreadingClass2;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int bal = 1000;
    private  final ReentrantLock rlock = new ReentrantLock();

    // 1.5 sync
    public void withdraw(String threadName,int amount){
        System.out.println(threadName + "is trying to withdraw "+ amount);
        //rlock.lock();
        if(rlock.tryLock()){
            try{
                System.out.println(threadName + " acquired lock ");
                if(bal >= amount){
                    Thread.sleep(2000);
                    bal = bal - amount;
                    System.out.println("withdraw: " + amount+ " remaining: "+ bal);
                } else {
                    System.out.println("insufficient balance.");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                rlock.unlock();
            }
        } else {
            System.out.println(threadName+ "let me wait for other task.....");
        }


    }
}
