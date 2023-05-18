package exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            // Testing the factorial method
            int factorialResult = Calculator.factorial(5);
            System.out.println("Factorial result: " + factorialResult);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            // Testing the binomialCoefficient method
            int binomialCoefficientResult = Calculator.binomialCoefficient(8, 3);
            System.out.println("Binomial coefficient result: " + binomialCoefficientResult);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            // Create a valid Person object
            Person person1 = new Person("John Doe", 25);
            System.out.println("Person 1 created: " + person1.getName() + ", " + person1.getAge());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            // Create an invalid Person object - null name
            Person person2 = new Person(null, 30);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            // Name person with more than 40 characters
            Person person3 = new Person("This is a name with more than 40 characters to test the validation", 30);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            // Age over 120
            Person person4 = new Person("Matt", 130);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("Program execution complete.");
    }

}
