package Collections;

import java.util.Stack;

public class StackTester {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Banana");
        stack.push("Panda");
        stack.push("Alien");
        stack.push("Martian");
        stack.push("Tiger");

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.get(0));
        System.out.println(stack.size() - 1);
    }
}
