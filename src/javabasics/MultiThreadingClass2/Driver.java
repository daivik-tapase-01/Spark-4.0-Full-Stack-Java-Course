package javabasics.MultiThreadingClass2;

public class Driver {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Runnable t1 = () -> account.withdraw("mummy ", 500);
        Runnable t2 = () -> account.withdraw("papa ", 400);

        new Thread(t1).start();
        new Thread(t2).start();
    }
}
