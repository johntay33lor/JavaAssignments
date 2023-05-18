package exceptions;

public class Calculator {
    public static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Invalid parameter. Number must be non-negative.");
        }

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = i;
        }
        return result;
    }

    public static int binomialCoefficient(int setSize, int subsetSize) {
        if (setSize < 0 || subsetSize < 0 || subsetSize > setSize) {
            throw new IllegalArgumentException("Invalid parameters. Set size and subset size must be non-negative, and subset size must not exceed set size.");
        }

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);
        return numerator / denominator;
    }
}
