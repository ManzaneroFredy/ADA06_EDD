package Test;

import java.util.ArrayList;

import Model.Movie;
import utils.InsertionSort;
import utils.MovieReader;
import utils.Quicksort;

public class App {
    public static void main(String[] args) throws Exception {

        MovieReader movieReader = new MovieReader();
        Quicksort quicksort = new Quicksort();
        InsertionSort insertionSort = new InsertionSort();

        ArrayList<Movie> movies = new ArrayList<Movie>(); // Create an ArrayList Movie
        
        for(int i= 1; i <= 10;i++){
            movies.add(movieReader.readMovie(i));
        }
        
        

        //Inicio del insertionSort

        ArrayList<Movie> orderMovies = insertionSort.order(movies);


        for(Movie movie: orderMovies){
            System.out.println(movie.getMovie_title() + " (" + movie.getId() + ")");
        }
        
    }
}
