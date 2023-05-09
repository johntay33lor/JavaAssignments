package conditionals;
import java.util.Scanner;
public class TestScores {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("Name a number between 0 and 100");
        num = input.nextInt();

        if (num >= 90) {
            System.out.println("Yor grade is an A!");
        } else if (num <= 89 && num >= 80 ) {
            System.out.print("Your grade is a B!");
        } else if (num <=79 && num >= 70 ) {
            System.out.println("Your grade is a C!");
        } else if (num <= 69 && num >= 60 ) {
            System.out.println("Your grade is a D!");
        } else {
            System.out.println("Your grade is a F!");
        }
    }

    }

