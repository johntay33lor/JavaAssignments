package arraysAndLists;

import java.util.Scanner;

import java.util.ArrayList;
public class LastItem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> myString = new ArrayList<>();
        String word;

        System.out.println("Enter a word: ");

        while (true) {
            word = input.nextLine();
            myString.add(word);
            System.out.println("Enter a word: (Press enter to end) ");

            if (word.isEmpty()) {
                System.out.println("The last item is: " + myString.get((myString.size()-2)));
                break;
            }
        }
    }
}
