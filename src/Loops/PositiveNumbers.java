package Loops;
import java.util.Scanner;
public class PositiveNumbers {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number:");
            num = input.nextInt();

            if (num == 0) {
                System.out.println("Game Over!");
                break;
            }

            if (num < 0) {
                    System.out.println("Your number must be positive!");
                    continue;
            } else {
                System.out.println("Your number is: " + num);
            }
        }
    }
}
