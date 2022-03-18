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
        
        for(int i= 1; i <= 7;i++){
            movies.add(movieReader.readMovie(i));
        }

        
        
        

        //Inicio del insertionSort

        

        long inicio = System.nanoTime();
        // Llama al metodo para ordenar mediante quicksort y guarda el resultado  en un array de peliculas ordenado
        ArrayList<Movie> orderMovies = insertionSort.order(movies, 1);
        long fin = System.nanoTime();
        long tiempo = fin-inicio;
        
        


        for(Movie movie: orderMovies){
            System.out.println(movie.getMovie_title() + " (" + movie.getId() + ")" + " (" + movie.getYear() + ")");
        }
        System.out.print("Tiempo de ejecucion: ");
        System.out.println(Math.max(0L, tiempo / 1_000_000.0d)+ " milisegundos");
        insertionSort.getComparations();
        insertionSort.getExChange();
        
        
    }
}
