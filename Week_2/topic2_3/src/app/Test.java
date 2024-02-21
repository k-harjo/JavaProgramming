package app;

public class Test {
    public static void main(String[] args) {
        // Create instances of Person
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("John", "Doe");
        Person person3 = new Person(person1);

        // Compare using == operator
        boolean isEqualUsingEqualsOperator = person1 == person2;
        System.out.println("Person 1 == Person 2: " + isEqualUsingEqualsOperator);

        // Compare using equals() method
        boolean isEqualUsingEqualsMethod = person1.equals(person2);
        System.out.println("Person 1 equals Person 2: " + isEqualUsingEqualsMethod);

        // Compare Person 1 and Person 3 using equals()
        boolean isEqualWithCopyConstructor = person1.equals(person3);
        System.out.println("Person 1 equals Person 3: " + isEqualWithCopyConstructor);

        // Print Person objects using toString()
        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
        System.out.println("Person 3: " + person3);
    }
}
