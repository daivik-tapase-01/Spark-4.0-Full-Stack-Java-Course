package javabasics.MultiThreadingClass2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) {

        try(ExecutorService service = Executors.newFixedThreadPool(8) ) {

            String[] studentList = {
                    "Riya", "raj", "Daivik", "Aman", "Sachin", "Sunny", "Rohit", "Anju", "Saurabh", "Ankit", "Archana", "Vaibhav"
            };

            for (String student : studentList) {
                CertificationSender task = new CertificationSender(student);

                service.submit(task);
            }

            service.shutdown();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
