package app;


public class Counter {
 private static int counter = 0;

 public static synchronized void increment() {
     counter++;
 }

 public static int getCount() {
     return counter;
 }
}


