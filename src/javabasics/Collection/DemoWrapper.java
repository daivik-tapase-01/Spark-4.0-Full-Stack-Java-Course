package javabasics.Collection;

public class DemoWrapper {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(20); // wrapper object
        System.out.println(i);

        int obj1 = Integer.parseInt("584");
        boolean obj2 = Boolean.parseBoolean("false");

        double d = 9.8;
        int i3 = (int) d;
        System.out.println(i3);

        Integer k = 66;
        String s1 = k.toString();
        System.out.println(k);

        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a==b);

        // note: -128 to 127

        Integer a1 = 128;
        Integer a2 = 128;
        System.out.println(a1.equals(a2)); // content compare


    }
}
