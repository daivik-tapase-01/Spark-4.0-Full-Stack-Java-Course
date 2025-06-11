package javabasics.OPPs;

public class Atm {
    private String accountHolder;
    private double balance;

    Atm(String name, double balance){
        this.accountHolder=name;
        this.balance=balance;
    }

    public static void main(String[] args) {
        Atm a1 = new Atm("daivik",9999999);
        a1.showBal();
    }

    void showBal(){
        System.out.println("The balance is: "+ balance);
    }


}
