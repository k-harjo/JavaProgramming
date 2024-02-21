package app;

import java.util.Stack;

public class PlayStack {

    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        Stack<String> stringStack = new Stack<>();

        stringStack.push("Apple");
        stringStack.push("Banana");
        stringStack.push("Cherry");
        stringStack.push("Date");
        stringStack.push("Fig");

        System.out.println("Integer Stack - Size: " + integerStack.size() + ", Second Element: " + getSecondElement(integerStack));
        System.out.println("String Stack - Size: " + stringStack.size() + ", Second Element: " + getSecondElement(stringStack));

        System.out.println("Integer Stack: " + integerStack.toString());

        System.out.println("String Stack:");
        while (!stringStack.isEmpty()) {
            System.out.println(stringStack.pop());
        }
    }

    private static <T> T getSecondElement(Stack<T> stack) {
        if (stack.size() >= 2) {
            return stack.get(1);
        }
        return null;
    }
}
