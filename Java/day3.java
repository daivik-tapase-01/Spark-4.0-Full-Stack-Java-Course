package Java;

import java.util.*;

public class day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // some exam questions
        // double d = 9.8;
        // int i = (int) d;
        // System.out.println(i);

        // // Arithmetic Operators

        // int a = 10;
        // int b = 2;
        // System.out.println(a + b);
        // System.out.println(a - b);
        // System.out.println(a * b);
        // System.out.println(a / b);
        // System.out.println(a % b);

        // // Increament operators

        // int c = 10;
        // c++;
        // System.out.println(c);

        // int d = 6;
        // int res = d++ + ++d + ++d + d++ + ++d;
        // // -------6------8-----9----9------11
        // // 6 + 8 + 9 + 9 + 11 = 43
        // System.out.println(res);

        // int e = -6;
        // int r = e++ + --e + e-- + ++e;
        // System.out.println(r);

        // // Relational Operators

        // int f = 30, g = 40;
        // System.out.println("f == g: " + (f == g));
        // System.out.println("f != g: " + (f != g));
        // System.out.println("f > g: " + (f > g));
        // System.out.println("f < g: " + (f < g));
        // System.out.println("f >= g: " + (f >= g));
        // System.out.println("f <= g: " + (f <= g));

        // // Logical Operators

        // boolean h = true;
        // boolean i = false;
        // System.out.println("h && i: " + (h && i));
        // System.out.println("h || i: " + (h || i));
        // System.out.println("!h : " + !h);
        // // ! -> used for boolean true false

        // // Assignment Operators

        // int j = 10;
        // System.out.println("j += 5: " + (j += 5));
        // j = 10;
        // System.out.println("j -= 5: " + (j -= 5));
        // j = 10;
        // System.out.println("j *= 5: " + (j *= 5));
        // j = 10;
        // System.out.println("j /= 5: " + (j /= 5));
        // j = 10;
        // System.out.println("j %= 5: " + (j %= 5));
        // j = 10;

        // // unary Operator

        // int k = 5;
        // System.out.println("+k : " + (+k)); // positive
        // System.out.println("-K : " + (-k)); // negative
        // System.out.println("++k : " + (++k)); // Increment
        // System.out.println("--k : " + (--k)); // decrement
        // System.out.println("~k : " + (~k)); // complement used in numbers
        // double l = 5.5;
        // k = (int) l; // Typecasting
        // System.out.println("Typecasting: " + k);

        // // Ternary Operators

        // int marks = 32;
        // String res = (marks > 33) ? "pass" : "fail";
        // System.out.println(res);

        // new -> new is keyword or operator which is used to create the object
        // ClassName ref = new ClassName();

        // // Control Statement

        // int money = 20;
        // if (money > 10){
        // System.out.println("I have sufficient money.");
        // if (money > 15){
        // System.out.println("it is more than enough.");
        // }else{
        // System.out.println("it is not enough.");
        // }
        // }else{
        // System.out.println("I don`t have sufficient money.");
        // }

        System.out.println("Enter number: ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 3:
                System.out.println("value is 3");
                break;
            case 4:
                System.out.println("value is 4");
                break;
            default:
                System.out.println("not Exist");
        }

        // // Loops

        // for (int i = 1; i < 6; i++) {
        // System.out.println(i);
        // }

        // int x = 1;
        // while (x < 6) {
        // System.out.println(x);
        // x++;
        // }

        // int y = 1;
        // do {
        // System.out.println(y);
        // y++;
        // } while (y < 6);

        sc.close();
    }
}
