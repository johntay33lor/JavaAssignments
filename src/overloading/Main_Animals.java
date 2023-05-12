package overloading;



import java.util.Scanner;
import java.util.ArrayList;
public class Main_Animals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Animals> animals = new ArrayList<>();

        while (true) {
            System.out.println("Enter the name of an animal: (Press enter to end.)");
            String name = input.nextLine();
            if (name.equals("")) {
                break;
            }

            System.out.println("Is your animal a dog? (true or false): ");
            boolean isDog = input.nextBoolean();
            input.nextLine();

            System.out.println("How many legs does it have?");
            int numLegs = input.nextInt();
            input.nextLine();

            System.out.println("What color hair does it have?");
            String hairColor = input.nextLine();

            animals.add(new Animals(name, isDog, numLegs, hairColor));
        }

        for (Animals animal : animals) {
            System.out.println(animal.toString());
        }
    }
}

