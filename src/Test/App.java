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
        
        for(int i= 0; i< 10;i++){
            movies.add(movieReader.readMovie(i));
        }
        


        // int[] ordenado = quicksort.order(numeros, 0, numeros.length-1);

        // for(Integer value: ordenado){
        //     System.out.println(value);
        // }
        
    }
}
