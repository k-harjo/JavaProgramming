package app;

public class MyArray {

    public <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        MyArray myArray = new MyArray();
        
        myArray.printArray(intArray);

        myArray.printArray(doubleArray);

        myArray.printArray(charArray);
    }
}
