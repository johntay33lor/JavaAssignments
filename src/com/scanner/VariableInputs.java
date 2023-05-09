package com.scanner;
import java.util.Scanner;
public class VariableInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string of text:");
        input.nextLine();

        System.out.print("Enter an integer:");
        input.nextInt();

        System.out.print("Enter a double:");
        input.nextDouble();

        System.out.print("Enter a boolean:");
        input.nextBoolean();
    }
}
