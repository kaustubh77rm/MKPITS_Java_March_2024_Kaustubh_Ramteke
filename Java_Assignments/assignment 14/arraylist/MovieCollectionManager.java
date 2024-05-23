package assgn_14.arraylist;
import java.util.*;

class Movie {
    private String movieID;
    private String title;
    private String director;
    private String genre;
    private int yearReleased;

    public Movie(String movieID, String title, String director, String genre, int yearReleased) {
        this.movieID = movieID;
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    public String getMovieID() {
        return movieID;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movie id='" + movieID + '\'' +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                ", year released=" + yearReleased +
                '}';
    }
}

class MovieCollection {
    private ArrayList<Movie> movies;

    public MovieCollection() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
        System.out.println("Movie added successfully.");
    }

    public void removeMovieByID(String movieID) {
        Movie movieToRemove = null;
        for (Movie movie : movies) {
            if (movie.getMovieID().equals(movieID)) {
                movieToRemove = movie;
                break;
            }
        }
        if (movieToRemove != null) {
            movies.remove(movieToRemove);
            System.out.println("Movie removed successfully.");
        } else {
            System.out.println("Movie not found.");
        }
    }

    public void searchMovieByTitle(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                System.out.println(movie);
                return;
            }
        }
        System.out.println("Movie not found.");
    }

    public void displayMoviesByGenre(String genre) {
        for (Movie movie : movies) {
            if (movie.getGenre().equalsIgnoreCase(genre)) {
                System.out.println(movie);
            }
        }
    }

    public void displayAllMovies() {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}

public class MovieCollectionManager {
    public static void main(String[] args) {
        MovieCollection movieCollection = new MovieCollection();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Movie Collection Manager:");
            System.out.println("1. Add a new movie");
            System.out.println("2. Remove a movie by movieID");
            System.out.println("3. Search for a movie by title");
            System.out.println("4. Display all movies of a specific genre");
            System.out.println("5. Display all movies");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter movieID: ");
                    String movieID = scanner.nextLine();
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter director: ");
                    String director = scanner.nextLine();
                    System.out.print("Enter genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter year released: ");
                    int yearReleased = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    Movie movie = new Movie(movieID, title, director, genre, yearReleased);
                    movieCollection.addMovie(movie);
                    break;
                case 2:
                    System.out.print("Enter movieID: ");
                    String removeMovieID = scanner.nextLine();
                    movieCollection.removeMovieByID(removeMovieID);
                    break;
                case 3:
                    System.out.print("Enter title: ");
                    String searchTitle = scanner.nextLine();
                    movieCollection.searchMovieByTitle(searchTitle);
                    break;
                case 4:
                    System.out.print("Enter genre: ");
                    String searchGenre = scanner.nextLine();
                    movieCollection.displayMoviesByGenre(searchGenre);
                    break;
                case 5:
                    movieCollection.displayAllMovies();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}