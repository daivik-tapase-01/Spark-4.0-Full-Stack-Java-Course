package javabasics.day6;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String ("Daivik");
        String s2 = "Vaibhav";
        String s3 = "Daivik";

        System.out.println(s1 +" and "+ s2 + " are friends.");

        // s1 and s3 are same string so they have same hashCode.
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        StringBuffer ss = new StringBuffer("String Buffer");
        System.out.println(ss);
        // one way to change string using replace
        ss.replace(0,ss.length(),"new String Buffer");
        System.out.println(ss);

        StringBuilder sb = new StringBuilder("String Builder.");
        System.out.println(sb);
        // another way will be deleting string and appending new one
        sb.delete(0,sb.length());
        sb.append("new String Builder");
        System.out.println(sb);


    }
}
