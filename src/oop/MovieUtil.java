package oop;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieUtil {


    public static ArrayList<Movie> getList() {

        ArrayList<Movie> list = new ArrayList<>();

        list.add(new Movie("Inception", "Sci-Fi", 8.8, "Christopher Nolan", 2010, new String[]{"English"}, false));
        list.add(new Movie("Interstellar", "Sci-Fi", 8.6, "Christopher Nolan", 2014, new String[]{"English"}, false));
        list.add(new Movie("The Dark Knight", "Action", 9.0, "Christopher Nolan", 2008, new String[]{"English"}, false));
        list.add(new Movie("The Prestige", "Drama", 8.5, "Christopher Nolan", 2006, new String[]{"English"}, false));
        list.add(new Movie("Tenet", "Sci-Fi", 7.4, "Christopher Nolan", 2020, new String[]{"English"}, false));
        list.add(new Movie("Titanic", "Romance", 7.9, "James Cameron", 1997, new String[]{"English"}, false));
        list.add(new Movie("Avatar", "Fantasy", 7.8, "James Cameron", 2009, new String[]{"English"}, false));
        list.add(new Movie("Aliens", "Sci-Fi", 8.4, "James Cameron", 1986, new String[]{"English"}, false));
        list.add(new Movie("The Matrix", "Sci-Fi", 8.7, "Wachowski Sisters", 1999, new String[]{"English"}, false));
        list.add(new Movie("The Matrix Reloaded", "Sci-Fi", 7.2, "Wachowski Sisters", 2003, new String[]{"English"}, false));
        list.add(new Movie("The Matrix Revolutions", "Sci-Fi", 6.8, "Wachowski Sisters", 2003, new String[]{"English"}, false));
        list.add(new Movie("Forrest Gump", "Drama", 8.8, "Robert Zemeckis", 1994, new String[]{"English"}, true));
        list.add(new Movie("Cast Away", "Drama", 7.8, "Robert Zemeckis", 2000, new String[]{"English"}, true));
        list.add(new Movie("Back to the Future", "Adventure", 8.5, "Robert Zemeckis", 1985, new String[]{"English"}, true));
        list.add(new Movie("Gladiator", "Action", 8.5, "Ridley Scott", 2000, new String[]{"English"}, false));
        list.add(new Movie("The Martian", "Sci-Fi", 8.0, "Ridley Scott", 2015, new String[]{"English"}, false));
        list.add(new Movie("Blade Runner", "Sci-Fi", 8.1, "Ridley Scott", 1982, new String[]{"English"}, false));
        list.add(new Movie("Jurassic Park", "Adventure", 8.2, "Steven Spielberg", 1993, new String[]{"English"}, true));
        list.add(new Movie("E.T.", "Fantasy", 7.9, "Steven Spielberg", 1982, new String[]{"English"}, true));
        list.add(new Movie("Jaws", "Thriller", 8.1, "Steven Spielberg", 1975, new String[]{"English"}, false));
        list.add(new Movie("Saving Private Ryan", "War", 8.6, "Steven Spielberg", 1998, new String[]{"English"}, false));
        list.add(new Movie("The Godfather", "Crime", 9.2, "Francis Ford Coppola", 1972, new String[]{"English"}, false));
        list.add(new Movie("The Godfather Part II", "Crime", 9.0, "Francis Ford Coppola", 1974, new String[]{"English"}, false));
        list.add(new Movie("Pulp Fiction", "Crime", 8.9, "Quentin Tarantino", 1994, new String[]{"English"}, false));
        list.add(new Movie("Django Unchained", "Western", 8.4, "Quentin Tarantino", 2012, new String[]{"English"}, false));
        list.add(new Movie("Inglourious Basterds", "War", 8.3, "Quentin Tarantino", 2009, new String[]{"English", "German"}, false));
        list.add(new Movie("Toy Story", "Animation", 8.3, "John Lasseter", 1995, new String[]{"English"}, true));
        list.add(new Movie("Toy Story 2", "Animation", 7.9, "John Lasseter", 1999, new String[]{"English"}, true));
        list.add(new Movie("Toy Story 3", "Animation", 8.2, "Lee Unkrich", 2010, new String[]{"English"}, true));
        list.add(new Movie("Finding Nemo", "Animation", 8.2, "Andrew Stanton", 2003, new String[]{"English"}, true));
        list.add(new Movie("Inside Out", "Animation", 8.1, "Pete Docter", 2015, new String[]{"English"}, true));
        list.add(new Movie("Up", "Animation", 8.3, "Pete Docter", 2009, new String[]{"English"}, true));
        list.add(new Movie("Spirited Away", "Animation", 8.6, "Hayao Miyazaki", 2001, new String[]{"Japanese"}, true));
        list.add(new Movie("Howl's Moving Castle", "Animation", 8.2, "Hayao Miyazaki", 2004, new String[]{"Japanese"}, true));
        list.add(new Movie("My Neighbor Totoro", "Animation", 8.1, "Hayao Miyazaki", 1988, new String[]{"Japanese"}, true));
        list.add(new Movie("Parasite", "Thriller", 8.5, "Bong Joon-ho", 2019, new String[]{"Korean"}, false));
        list.add(new Movie("Oldboy", "Thriller", 8.4, "Park Chan-wook", 2003, new String[]{"Korean"}, false));
        list.add(new Movie("The Shawshank Redemption", "Drama", 9.3, "Frank Darabont", 1994, new String[]{"English"}, false));
        list.add(new Movie("The Green Mile", "Drama", 8.6, "Frank Darabont", 1999, new String[]{"English"}, false));
        list.add(new Movie("Fight Club", "Drama", 8.8, "David Fincher", 1999, new String[]{"English"}, false));
        list.add(new Movie("Se7en", "Thriller", 8.6, "David Fincher", 1995, new String[]{"English"}, false));
        list.add(new Movie("Gone Girl", "Thriller", 8.1, "David Fincher", 2014, new String[]{"English"}, false));
        list.add(new Movie("La La Land", "Musical", 8.0, "Damien Chazelle", 2016, new String[]{"English"}, true));
        list.add(new Movie("Whiplash", "Drama", 8.5, "Damien Chazelle", 2014, new String[]{"English"}, false));

        return list;
    }

    public static ArrayList<Movie> getMoviesByTitle(String title) {
        ArrayList<Movie> list = new ArrayList<>();
        for(Movie el : getList()) {
            if(el.getTitle().toLowerCase().contains(title.toLowerCase()))
                list.add(el);
        }
        return list;
    }

    public static ArrayList<Movie> getMoviesByGenre(String genre) {
        ArrayList<Movie> list = new ArrayList<>();
        for(Movie el : getList()) {
            if(el.getGenre().equalsIgnoreCase(genre))
                list.add(el);
        }
        return list;
    }

    public static ArrayList<Movie> getMoviesByDirector(String director) {
        ArrayList<Movie> list = new ArrayList<>();
        for(Movie el : getList()) {
            if(el.getDirector().toLowerCase().contains(director.toLowerCase()))
                list.add(el);
        }
        return list;
    }

    public static ArrayList<Movie> getMoviesForChildren() {
        ArrayList<Movie> list = new ArrayList<>();
        for(Movie el : getList()) {
            if(el.isForChildren())
                list.add(el);
        }
        return list;
    }

    public static ArrayList<Movie> getMoviesInRangeOfYears(int year1, int year2) {
        ArrayList<Movie> list = new ArrayList<>();
        for(Movie el : getList()) {
            if(el.getReleaseYear() >= year1 && el.getReleaseYear()<= year2)
                list.add(el);
        }
        return list;
    }

    public static ArrayList<Movie> getMoviesInRangeOfRate(double rate1, double rate2) {
        ArrayList<Movie> list = new ArrayList<>();
        for(Movie el : getList()) {
            if(el.getImdbRate() >= rate1 && el.getImdbRate() <= rate2)
                list.add(el);
        }
        return list;
    }

    public static ArrayList<Movie> getMoviesInLanguage(String givenLanguage) {
        ArrayList<Movie> list = new ArrayList<>();
        for(Movie el : getList()) {
            for(String language : el.getLanguages())
                if(language.equalsIgnoreCase(givenLanguage))
                    list.add(el);
        }
        return list;
    }
}
