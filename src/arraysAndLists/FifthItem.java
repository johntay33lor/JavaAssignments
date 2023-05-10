package arraysAndLists;

import java.util.Scanner;

import java.util.ArrayList;

public class FifthItem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String string;
        ArrayList<String> myString = new ArrayList<>();

        System.out.println("Enter a word:");

        while (true) {
            string = input.nextLine();
            myString.add(string);
            System.out.println("Enter a word:(Press enter to end)");

            if (string.isEmpty()) {
                System.out.println("Game Over!");
                break;
            }
        }

        if (myString.size() >= 5) {
            System.out.println("The fifth item is: " + myString.get(4));
        }
    }
}
