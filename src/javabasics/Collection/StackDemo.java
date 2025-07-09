package javabasics.Collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("stack: "+ stack);

        System.out.println("pop: "+ stack.pop());
        System.out.println("pop: "+ stack.pop());

        System.out.println("stack: "+ stack);

        stack.push(60);
        stack.push(70);
        System.out.println("stack: "+ stack);

        stack.push(121);
        stack.push(222);
        System.out.println("stack: "+ stack);

        System.out.println("pop: "+ stack.pop());
        System.out.println("stack: "+ stack);

        System.out.println("pop: "+ stack.pop());
        System.out.println("stack: "+ stack);

    }
}
