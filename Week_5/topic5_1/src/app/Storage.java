package app;


public class Storage<T> {
    private T s;

    public Storage(T data) {
        this.s = data;
    }

    public T getData() {
        return s;
    }

    public static void main(String[] args) {
        Storage<String> stringStorage = new Storage<>("Hello, Generics!");
        String stringValue = stringStorage.getData();
        System.out.println("String Data: " + stringValue);

        Storage<Integer> integerStorage = new Storage<>(42);
        Integer integerValue = integerStorage.getData();
        System.out.println("Integer Data: " + integerValue);
    }
}

