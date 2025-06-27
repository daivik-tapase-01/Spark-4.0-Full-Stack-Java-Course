package javabasics.Java8;

public class TestThreadB {
    public static void main(String[] args) {
        ThreadB t1 = new ThreadB();
        t1.start();

        Runnable task = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("hello..main");
            }
        };
        new Thread(task).start();

        for (int i = 0; i < 3; i++) {
            System.out.println("main...");
        }
    }
}
