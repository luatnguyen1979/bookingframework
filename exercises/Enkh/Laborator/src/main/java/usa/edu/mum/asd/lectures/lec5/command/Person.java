package usa.edu.mum.asd.lectures.lec5.command;

import java.util.List;

public class Person {

    private final String firstName;
    private final String lastName;
    private final List<Person> children;

    public Person(String firstName, String lastName, List<Person> children) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.children = children;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Person> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", children=" + children +
                '}';
    }
}
