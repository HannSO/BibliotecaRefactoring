package main;

/**
 * Created by hannahsmyth-osbourne on 18/11/2016.
 */
public class MovieOptions {

    public void print() {
        System.out.println(buildMovieString("Rocky", "John G. Avildsen", "10"));
        System.out.println(buildMovieString("Rocky II", "John G. Avildsen", "9"));
        System.out.println(buildMovieString("Rocky III", "John G. Avildsen", "8"));
        System.out.println(buildMovieString("Rocky IV", "John G. Avildsen", "7"));
        System.out.println(buildMovieString("Rocky V", "John G. Avildsen", "8"));
        System.out.println(buildMovieString("Drainage", "Francisco Trindade", "N/A"));
        System.out.println(buildMovieString("The Shawshank Redemption", "Frank Darabont", "10"));
        System.out.println(buildMovieString("The Godfather", "Francis Ford Coppola", "7"));
        System.out.println(buildMovieString("Inception", "Frank Darabont", "10"));
        System.out.println(buildMovieString("Pulp Fiction", "Quentin Tarantino", "6"));
    }

    private static String buildMovieString(String movieTitle, String movieDirector, String movieRanking) {
        return movieTitle + " - Director: " + movieDirector + " Rating: " + movieRanking;
    }
}
