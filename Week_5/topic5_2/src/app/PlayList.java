package app;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);

        List<String> stringList = new ArrayList<>();

        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.add("Fig");

        System.out.println("First element of the Integer List: " + integerList.get(0));
        System.out.println("First element of the String List: " + stringList.get(0));

        System.out.println("Integer List:");
        for (Integer num : integerList) {
            System.out.println(num);
        }

        System.out.println("String List:");
        int index = 0;
        while (index < stringList.size()) {
            System.out.println(stringList.get(index));
            index++;
        }
    }
}
