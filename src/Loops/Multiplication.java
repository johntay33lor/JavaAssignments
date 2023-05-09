package Loops;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            int answer = num * i;
            System.out.println(num + " x " + i + " = " + answer);
        }

    }
}
