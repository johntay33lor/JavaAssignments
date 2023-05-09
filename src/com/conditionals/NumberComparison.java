package com.conditionals;
import java.util.Scanner;
public class NumberComparison {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num1 = input.nextInt();

        System.out.print("Enter another number");
        num2 = input.nextInt();

        if (num1 == num2) {
            System.out.println("Numbers are the same.");
        } else if (num1 > num2) {
            System.out.println("The first number was bigger than the second number.");
        } else {
            System.out.println("The second number was bigger than the first number.");

        }

    }
}
