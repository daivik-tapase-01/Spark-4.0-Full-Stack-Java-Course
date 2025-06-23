package javabasics.MultiThreadingClass2;

public class TablePrintWithMethod {
    public synchronized void printTable(int n){
        for (int j = 1; j <= 5; j++) {
            System.out.println(Thread.currentThread().getName()+ " : "+ (n * j));
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
