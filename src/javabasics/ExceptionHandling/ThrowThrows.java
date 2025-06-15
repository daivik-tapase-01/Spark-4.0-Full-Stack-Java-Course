package javabasics.ExceptionHandling;

public class ThrowThrows {
    public static void main(String[] args) {
        // if we use throws here it will be default exception handling

        // in throw, we handle exception
        try{
            checkAge(-1);
        } catch (Exception e) {
            System.out.println("check failed: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws Exception {
        if (age < 0){
            throw new Exception("Age cannot be negative");
        }
        if( age < 10){
            throw new Exception("you are underage");
        }
    }
}
