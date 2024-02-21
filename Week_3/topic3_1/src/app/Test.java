package app;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // Create instances of Person
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Alice", "Smith");
        Person person3 = new Person("Bob", "Johnson");
        Person person4 = new Person("Eve", "Smith");
        
//        // Create instances of Person
//        Person person1 = new Person("John", "Doe");
//        Person person2 = new Person("Amy", "Dover");
//        Person person3 = new Person("Shelby", "Sharon");

//        // Compare using == operator
//        boolean isEqualUsingEqualsOperator = person1 == person2;
//        System.out.println("Person 1 == Person 2: " + isEqualUsingEqualsOperator);
//
//        // Compare using equals() method
//        boolean isEqualUsingEqualsMethod = person1.equals(person2);
//        System.out.println("Person 1 equals Person 2: " + isEqualUsingEqualsMethod);
//
//        // Compare Person 1 and Person 3 using equals()
//        boolean isEqualWithCopyConstructor = person1.equals(person3);
//        System.out.println("Person 1 equals Person 3: " + isEqualWithCopyConstructor);



        // Create an array of people
        Person[] people = { person1, person2, person3, person4 };

        // Sort people by last name
        Arrays.sort(people);

        // Print sorted people
        System.out.println("People sorted by last name:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Shuffle the array and sort again to demonstrate multiple sorting
        System.out.println("\nShuffling and sorting again:");
        shuffleArray(people);
        Arrays.sort(people);

        // Print sorted people
        for (Person person : people) {
            System.out.println(person);
        }
    }

    // Helper method to shuffle the array
    private static void shuffleArray(Person[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));
            Person temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}
