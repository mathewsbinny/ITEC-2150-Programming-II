package Ch8_HW;

import java.util.Stack;

public class SplitStack {
    public static void splitStack(Stack<Integer> stack) {
        Stack<Integer> neg = new Stack<>();
        Stack<Integer> nonNeg = new Stack<>();

        while (!stack.isEmpty()) {
            int num = stack.pop();
            if (num < 0) {
                neg.push(num);
            } else {
                nonNeg.push(num);
            }
        }

        while (!neg.isEmpty()) {
            stack.push(neg.pop());
        }
        while (!nonNeg.isEmpty()) {
            stack.push(nonNeg.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(5);
        stack1.push(-5);
        stack1.push(67);
        stack1.push(-45);
        stack1.push(67);
        stack1.push(9);
        stack1.push(0);
        stack1.push(-42);
        stack1.push(56);
        stack1.push(-7);

        splitStack(stack1);
        System.out.println("Stack 1: " + stack1);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(-2);
        stack2.push(-3);
        stack2.push(4);
        stack2.push(-5);
        stack2.push(6);
        stack2.push(-7);
        stack2.push(8);
        stack2.push(-9);

        splitStack(stack2);
        System.out.println("Stack 2: " + stack2);
    }
}