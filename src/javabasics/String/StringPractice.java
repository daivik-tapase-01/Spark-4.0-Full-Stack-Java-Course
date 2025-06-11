package javabasics.String;

public class StringPractice {
    public static void main(String[] args) {

        // check if the string is palindrome -> madam 121
        String p = "madam";
        boolean isPlindrome = false;
        for(int i = 0; i < p.length(); i++){
            isPlindrome = p.charAt(i) == p.charAt(p.length() - 1 - i);
        }
        if(isPlindrome){
            System.out.println("String is palindrome.");
        }else{
            System.out.println("String is not palindrome.");
        }

        // capitalize first letter of string
        StringBuilder first = new StringBuilder("daivik");
        first.setCharAt(0,Character.toUpperCase(first.charAt(0)));
        System.out.println(first);

        // remove duplicate char from string -> aabbcd = abcd
        String input = "aabbcd";
        StringBuilder result = new StringBuilder();

        for(char c : input.toCharArray()){
            if(result.indexOf(String.valueOf(c))== -1){
                result.append(c);
            }
        }
        System.out.println(result.toString());

    }
}
