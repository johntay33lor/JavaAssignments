package objectsInLists;

public class TvShows {
    private String name;
    private int episodes;
    private String genre;

    public TvShows(String name, int episodes, String genre) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;
    }

    public String getName() {

        return name;
    }

    public int getEpisodes() {

        return episodes;
    }

    public String getGenre() {

        return genre;
    }

    public String toString() {

        return getName() + " has " + getEpisodes() + " episodes, and is a " + getGenre() + ".";
    }
}
