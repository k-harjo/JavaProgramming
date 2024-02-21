package app;

import java.util.HashMap;
import java.util.Map;

public class PlayMap {

    public static void main(String[] args) {
        Map<String, Integer> integerMap = new HashMap<>();

        integerMap.put("One", 1);
        integerMap.put("Two", 2);
        integerMap.put("Three", 3);
        integerMap.put("Four", 4);
        integerMap.put("Five", 5);

        Map<Integer, String> stringMap = new HashMap<>();

        stringMap.put(1, "Apple");
        stringMap.put(2, "Banana");
        stringMap.put(3, "Cherry");
        stringMap.put(4, "Date");
        stringMap.put(5, "Fig");

        System.out.println("Integer Map - Size: " + integerMap.size() + ", Is Empty: " + integerMap.isEmpty());
        System.out.println("String Map - Size: " + stringMap.size() + ", Is Empty: " + stringMap.isEmpty());

        System.out.println("String Map:");
        for (Map.Entry<Integer, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        integerMap.clear();
        stringMap.clear();

        System.out.println("Integer Map - Size after removal: " + integerMap.size() + ", Is Empty: " + integerMap.isEmpty());
        System.out.println("String Map - Size after removal: " + stringMap.size() + ", Is Empty: " + stringMap.isEmpty());
    }
}
