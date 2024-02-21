package app;

public class Person implements Comparable<Person> {
//public class Person implements PersonInterface {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Person(Person otherPerson) {
        this.firstName = otherPerson.firstName;
        this.lastName = otherPerson.lastName;
    }
    @Override
    public int compareTo(Person otherPerson) {
        int lastNameComparison = lastName.compareTo(otherPerson.lastName);
        
        // If last names are the same, compare by first names
        if (lastNameComparison == 0) {
            return firstName.compareTo(otherPerson.firstName);
        }
        
        return lastNameComparison;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Person person = (Person) other;
        return firstName.equals(person.firstName) && lastName.equals(person.lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public void walk() {
        System.out.println(firstName + " is walking.");
    }

    
    public void run() {
        System.out.println(firstName + " is running.");
    }

    public boolean isRunning() {
        return true; // Just an example based on actual logic
    }
    
    
}