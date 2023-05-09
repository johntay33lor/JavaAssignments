package Loops;
import java.util.Scanner;
public class StopAtFive {
    public static void main(String[] args) {
        int five;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Give me a number...");
            five = input.nextInt();

            if (five == 5) {
                break;
            }

        }
        System.out.println("Jackpot!");
    }
}
