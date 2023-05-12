package overloading;

public class TVShows {
    private String name;
    private int episodes;
    private String genre;
    private String starring;
    private int seasons;

    public TVShows(String name, int episodes, String genre) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;
    }

    public TVShows(String name, int episodes, String genre, String starring, int seasons) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;
        this.starring = starring;
        this.seasons = seasons;
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

    public String getStarring() {
        return starring;
    }

    public int getSeasons() {
        return seasons;
    }

}
