package methods;

import java.util.Scanner;

public class DivideMethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Enter a number: ");
        num1 = input.nextInt();

        System.out.println("Enter another number: ");
        num2 = input.nextInt();

        double num3 = divide(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + num3);

    }
    public static double divide (double a, double b) {
        double c = a / b;
        return c;
    }
}
