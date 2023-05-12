package overloading;

import java.util.Scanner;
import java.util.ArrayList;

public class Main_TVShows {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<TVShows> shows = new ArrayList<>();

        while (true) {
            System.out.println("Please enter a TV Show: (Press enter to end.)");
            String name = input.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("How many seasons does the show have?");
            int seasons = Integer.parseInt(input.nextLine());

            System.out.println("Who is the star of the show?");
            String starring = input.nextLine();

            System.out.println("How many episodes are there? (please enter a number) ");
            int episodes = Integer.parseInt(input.nextLine());

            System.out.println("What is the genre of the show? ");
            String genre = input.nextLine();

            TVShows newInput = new TVShows(name, episodes, genre, starring, seasons);
            shows.add(newInput);
        }

        System.out.println("List of TV shows:");
        for (TVShows tvShow : shows) {
            System.out.println(tvShow.getName() + ", starring " + tvShow.getStarring() + " has " + tvShow.getSeasons() + " seasons, " + tvShow.getEpisodes() + " episodes, and is a " + tvShow.getGenre() + ".");
        }
    }
}