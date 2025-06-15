package javabasics.ExceptionHandling;

public class ATM {
    public static void main(String[] args) {
        try{
            withdraw(1000, 2000);
        }
        catch (CustomException e){
            System.out.println("Exception bal Insufficient");
            System.out.println(e.getMessage());
        }
    }

    public static void withdraw(double bal, double amt) throws CustomException {
        if ( amt > bal ){
            throw new CustomException("Insufficient bal : " + bal + " requested: "+ amt);
        }else {
            System.out.println("withdrawal of amount " + amt + " successful");
        }

    }


}
