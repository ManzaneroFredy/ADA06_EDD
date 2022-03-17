package test;

import java.util.ArrayList;
import java.util.List;

import model.Movie;
import utils.MovieReader;
import utils.RadixSort;

public class App {
    public static void main(String[] args) throws Exception {
        MovieReader mv = new MovieReader();
        RadixSort rs = new RadixSort();

        ArrayList<Movie> movies = new ArrayList<Movie>(); // Create an ArrayList Movie
        
        for(int i= 1; i<= 10;i++){
            movies.add(mv.readMovie(i));
        }

        rs.AscentSort(movies);

        for(Movie movie: movies){
            System.out.println(movie.getMovie_title() + " ("+ movie.getId() + ")" + " (movie year: " + movie.getYear() + ")");
        }

    }
}
