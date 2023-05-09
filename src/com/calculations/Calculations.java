package com.calculations;
import java.util.Scanner;
public class Calculations {
    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        num1 = input.nextInt();

        System.out.print("Enter another number:");
        num2 = input.nextInt();

        System.out.println(num1 + " + " + num2 + "= " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + "= " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + "= " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + "= " +  num1 / num2);
        System.out.println(num1 + " % " + num2 + "= " + (num1 % num2));







    }
}
