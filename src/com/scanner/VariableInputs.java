package com.scanner;
import java.util.Scanner;
public class VariableInputs {
    public static void main(String[] args) {

        String string;
        int num1;
        double num2;
        boolean answer;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string of text:");
        string = input.nextLine();

        System.out.print("Enter an integer:");
        num1 = input.nextInt();

        System.out.print("Enter a double:");
        num2 = input.nextDouble();

        System.out.print("Enter a boolean:");
        answer = input.nextBoolean();

        System.out.println("Your string is " + string);
        System.out.println("Your integer is " + num1);
        System.out.println("Your double is " + num2);
        System.out.println("Your boolean is " + answer);


    }
}
