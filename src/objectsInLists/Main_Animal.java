package objectsInLists;
import java.util.Scanner;
import java.util.ArrayList;
public class Main_Animal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        while (true) {
            System.out.println("Enter the name of an animal: (Press enter to end.)");
            String name = input.nextLine();
            if (name.equals("")) {
                break;
            }

            System.out.println("Is your animal a dog? (true or false): ");
            boolean isDog = input.nextBoolean();
            input.nextLine();

            animals.add(new Animal(name, isDog));
        }

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}
