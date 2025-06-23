package javabasics.MultiThreadingClass2;

public class TablePrintWithBlock {
    public void printTable(int n){

        synchronized(this){

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
}
