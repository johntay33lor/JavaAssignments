package arraysAndLists;

import java.util.Scanner;

import java.util.ArrayList;
public class SumOfList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();
        int num;
        int sum = 0;

        System.out.println("Enter a number: ");

        while (true) {
            num = input.nextInt();
            myList.add(num);
            System.out.println("Enter another number: (Enter 0 to end)");

            if (num == 0) {
                myList.remove(myList.get(myList.size() - 1));
                System.out.print(myList.toString().replace(" ", " ") + "were the items on the list.");
                break;
            }
        }

        for (int i = 0; i < myList.size(); i++) {
            sum += myList.get(i);
        }

        System.out.println("The sum of the list is: " + sum);



    }
}

