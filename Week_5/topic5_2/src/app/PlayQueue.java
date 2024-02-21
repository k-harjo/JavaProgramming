package app;

import java.util.LinkedList;
import java.util.Queue;

public class PlayQueue {

    public static void main(String[] args) {
        Queue<Integer> integerQueue = new LinkedList<>();

        integerQueue.offer(1);
        integerQueue.offer(2);
        integerQueue.offer(3);
        integerQueue.offer(4);
        integerQueue.offer(5);

        Queue<String> stringQueue = new LinkedList<>();

        stringQueue.offer("Apple");
        stringQueue.offer("Banana");
        stringQueue.offer("Cherry");
        stringQueue.offer("Date");
        stringQueue.offer("Fig");

        System.out.println("Integer Queue - Size: " + integerQueue.size() + ", Is Empty: " + integerQueue.isEmpty());
        if (!integerQueue.isEmpty()) {
            System.out.println("Integer Queue - Head Element: " + integerQueue.peek());
        }

        System.out.println("String Queue - Size: " + stringQueue.size() + ", Is Empty: " + stringQueue.isEmpty());
        if (!stringQueue.isEmpty()) {
            System.out.println("String Queue - Head Element: " + stringQueue.peek());
        }

        System.out.println("Integer Queue: " + integerQueue.toString());
        
        System.out.println("String Queue:");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.poll());
        }
    }
}
