package exceptions;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Invalid name. Name must not be null, empty, or exceed 40 characters.");
        }

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age. Age must be between 0 and 120.");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}