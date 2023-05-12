package overloading;

public class Books {
    private String title;
    private int pages;
    private int year;
    private String author;
    private String genre;

    public Books (String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public Books (String title, int pages, int year, String author, String genre) {
        this.title = title;
        this.pages = pages;
        this.year = year;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String toString() {
        return title + " has " + pages + " pages, was published in " + year + ", was written\n" +
                "by " + author + ", and is a " + genre + ".";
    }
}

