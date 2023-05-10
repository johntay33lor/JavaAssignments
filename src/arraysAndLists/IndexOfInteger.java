package arraysAndLists;

import java.util.Scanner;

import java.util.ArrayList;

public class IndexOfInteger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> intArray = new ArrayList<>();
        int num;

        System.out.println("Enter a number: ");

        while (true) {
            num = input.nextInt();
            intArray.add(num);
            System.out.println("Enter another number: (Enter 0 to stop adding numbers.) ");

            if (num == 0) {
                System.out.println("You are done adding numbers to the list.");
                System.out.println("What number from the list are you looking for?");
                int text2 = input.nextInt();
                System.out.println(text2 + " is at index " + intArray.indexOf(text2));
                break;
            }
        }
    }
}
