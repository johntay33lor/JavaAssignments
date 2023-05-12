package objectsInLists;
import java.util.Scanner;
import java.util.ArrayList;

public class Main_TvShows {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<TvShows> tvShows = new ArrayList<>();

        while (true) {
            System.out.println("Please enter a TV Show: (Press enter to end.)");
            String name = input.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("How many episodes are there? (please enter a number) ");
            int episodes = Integer.parseInt(input.nextLine());

            System.out.println("What is the genre of the show? ");
            String genre = input.nextLine();

            tvShows.add(new TvShows(name, episodes, genre));
        }

        for (TvShows tvShow : tvShows) {
            System.out.println(tvShow.toString());
        }
    }
}
