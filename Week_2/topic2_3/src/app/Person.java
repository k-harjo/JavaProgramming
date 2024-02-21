package app;

public class Person {
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
}
