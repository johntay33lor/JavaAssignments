package objectsInLists;
import java.util.Scanner;
import java.util.ArrayList;
public class Main_Book {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Please enter a book: (Press enter to end.)");
            String name = input.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("How many pages does the book have? ");
            int pages = input.nextInt();

            System.out.println("What year was the book published? ");
            int year = input.nextInt();

            books.add(new Book(name, pages, year));
            String printOption = input.nextLine();
        }

        System.out.println("What would you like to print? (name/everything)");
        String printOption = input.nextLine();

        for (Book book : books) {
            if (printOption.equals("name")) {
                System.out.println(book.getTitle());
            } else if (printOption.equals("everything")) {
                System.out.println(book.toString());
            } else {
                System.out.println("Invalid input.");
                break;
            }
        }

    }
}
