package oop;

import java.util.ArrayList;

public class Searcher {
    public static void main(String[] args) {
        ArrayList<Movie> movies = MovieUtil.getList();
//        ArrayList<Movie> moviesByTitle = MovieUtil.getMoviesByTitle("Matrix");
//        print(moviesByTitle);
//        print(MovieUtil.getMoviesByGenre("crime"));

        // print movies by director
//        print(MovieUtil.getMoviesByDirector("James Cameron"));
//        print(MovieUtil.getMoviesForChildren());
//        print(MovieUtil.getMoviesInRangeOfYears(1994,1999));
//        print(MovieUtil.getMoviesInRangeOfRate(9, 10));
        print(MovieUtil.getMoviesInLanguage("english"));
    }

    private static void print(ArrayList<Movie> list) {
        int count = 1;
        for(Movie m : list)
           System.out.println(count++ + ") " + m);
    }

}
