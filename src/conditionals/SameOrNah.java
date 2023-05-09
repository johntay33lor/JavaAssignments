package conditionals;
import java.util.Scanner;
public class SameOrNah {
    public static void main(String[] args) {
        String word1;
        String word2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        word1 = input.nextLine();

        System.out.println("Enter another word:");
        word2 = input.nextLine();

        if (word1.equalsIgnoreCase(word2)) {
            System.out.println("The words are the same.");
        } else {
            System.out.println("The words are not the same.");

        }
    }

    }

