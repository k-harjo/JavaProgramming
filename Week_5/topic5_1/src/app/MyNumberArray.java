package app;

public class MyNumberArray {

    public <E extends Number> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };

        MyNumberArray myNumberArray = new MyNumberArray();
        
        myNumberArray.printArray(intArray);

        myNumberArray.printArray(doubleArray);
    }
}
