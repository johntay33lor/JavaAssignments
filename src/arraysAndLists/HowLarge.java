package arraysAndLists;

import java.util.Scanner;

import java.util.ArrayList;

public class HowLarge {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word;
        ArrayList<String> myString = new ArrayList<>();

        System.out.println("Enter a word:");

        while (true) {
            word = input.nextLine();
            myString.add(word);
            System.out.println("Enter a word:(Press enter to end)");

            if (word.isEmpty()) {
                System.out.println("Total items in list: " + (myString.size()-1));
                break;
            }
        }
    }
}
