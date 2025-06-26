package javabasics.Java8;

@FunctionalInterface
public interface Calcy {
    int add(int a, int b);

    default void m1(){
        System.out.println("hello ");
    }

}

class Child implements Calcy {
    @Override
    public int add(int a, int b) {
        return 0;
    }
}


// after java 1.8
class Driver{
    public static void main(String[] args) {

        // lamda expression
        Calcy operation = (a,b) -> a+b;
        System.out.println(operation.add(5,5));

        // implement method
        Child c1 = new Child();
        System.out.println(c1.add(5,5));
        c1.m1();

    }
}
