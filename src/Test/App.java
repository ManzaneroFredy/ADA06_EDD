package test;

import java.util.ArrayList;

import model.Movie;
import utils.MovieReader;
import utils.Quicksort;

public class App {
    public static void main(String[] args) throws Exception {

        MovieReader movieReader = new MovieReader();
        Quicksort quicksort = new Quicksort();

        ArrayList<Movie> movies = new ArrayList<Movie>(); // Create an ArrayList Movie
        
        for(int i= 1; i<= 10;i++){
            movies.add(movieReader.readMovie(i));
        }

        // for(Movie movie : movies){
        //     System.out.println(movie.getMovie_title() + " ("+ movie.getId() + ")");
        // }
        


        ArrayList<Movie> orderMovies = quicksort.order(movies, 0, movies.size()-1);

        for(Movie movie: orderMovies){
            System.out.println(movie.getMovie_title() + " ("+ movie.getId() + ")");
        }
        
    }
}
