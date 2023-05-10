package methods;

import java.util.Scanner;

public class AverageMethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("Enter a number:");
        num1 = input.nextInt();

        System.out.println("Enter another number:");
        num2 = input.nextInt();

        System.out.println("Enter another number:");
        num3 = input.nextInt();

        double avg = average(num1, num2, num3);

        System.out.println("The average is: " + avg);

    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
        
    }
    public static double average(int one, int two, int three) {
        int sum = sum(one, two, three);
        double avg = (double) sum / 3;
        return avg;

    }
}
