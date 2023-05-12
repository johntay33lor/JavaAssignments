package overloading;

import java.util.Scanner;
import java.util.ArrayList;
public class Main_Books {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Books> book = new ArrayList<>();

        while (true) {
            System.out.println("Please enter a book: (Press enter to end.)");
            String name = input.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("How many pages does the book have? ");
            int pages = input.nextInt();
            input.nextLine();

            System.out.println("What year was the book published? ");
            int year = input.nextInt();
            input.nextLine();

            System.out.println("Who is the author of the book? ");
            String author = input.nextLine();

            System.out.println("What is the genre? ");
            String genre = input.nextLine();


            Books bookInput = new Books(name, pages, year, author, genre);
            book.add(bookInput);

        }

        System.out.println("What would you like to print? (name/everything)");
        String printOption = input.nextLine();

        for (Books books : book) {
            if (printOption.equals("name")) {
                System.out.println(books.getTitle());
            } else if (printOption.equals("everything")) {
                System.out.println(book.toString());
            } else {
                System.out.println("Invalid input.");
                break;
            }
        }

    }
}

