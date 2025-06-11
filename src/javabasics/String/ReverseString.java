package javabasics.String;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = "daivik";
        for(int i = 0; i < s1.length(); i++){
            System.out.print(s1.charAt(i));
        }
        System.out.println();
        // reverse
        for(int i = s1.length()-1; i >= 0; i--) {
            System.out.print(s1.charAt(i));
        }
        System.out.println();


        // using literals
        String revString = "";
        for(int i = s1.length()-1; i>=0; i--){
            revString += s1.charAt(i);
        }
        System.out.println("using literal: "+revString);

        // using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Krushna");
        System.out.println("Straight: "+ sb);
        for(int i = 0; i < sb.length()/2; i++){
            int front = i;
            int back = sb.length()-i-1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println("Reverse: "+ sb);

        // passing string in builder class
        String s3 = "tapase"; // Define your string
        StringBuilder revString2 = new StringBuilder(s1); // Use StringBuilder
        int size = s3.length();
        for (int i = 0; i < size / 2; i++) {
            char temp = revString2.charAt(i);
            revString2.setCharAt(i, revString2.charAt(size - i - 1));
            revString2.setCharAt(size - i - 1, temp);
        }
        System.out.println("Reversed String = " + revString2.toString());

        // count vowel and consonants
        String s2 = "tapase";
        int v = 0, c = 0;
        for(char c1: s2.toCharArray()){
            if ("aeiou".indexOf(c1) != -1){
                v++;
            }else{
                c++;
            }
        }
        System.out.println("vowel count= "+v);
        System.out.println("consonants count= "+c);

    }
}
