package javabasics.ExceptionHandling;

public class ThrowTest {
    public static void main(String[] args) {
        try{
            withdraw(1000,2000);
        }
        catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }

    }

    public static void withdraw(double bal, double amt) throws Exception {
        if(amt > bal){
            throw new Exception("Insufficient Balance.");

            // Handle
//            try{
//                throw new Exception("Insufficient Balance.");
//            } catch (Exception _) {
//
//            }

        }else{
            System.out.println("withdrawal successful...");
        }
    }
}
