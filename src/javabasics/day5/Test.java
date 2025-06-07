package javabasics.day5;

public class Test {
    public static void main(String[] args) {
        Atm atm = new Atm("Vaihav",1111111);
        atm.showBal();

        //atm.balance=10;
        // now we cant update it because we have set variable as private
        atm.showBal();

    }
}
