package Loops;
import java.util.Scanner;
public class TakeABreak {
    public static void main(String[] args) {
        String userInput;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Do you want to take a break? (if yes, enter 'yes')");
            userInput = input.nextLine();
            if (userInput.equals("yes")) {
                break;

            }
            System.out.println("Thanks for staying!");
        }

        System.out.println(("See ya later!"));
    }
}
