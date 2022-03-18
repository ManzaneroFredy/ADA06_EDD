package test;

import java.util.ArrayList;

import model.Movie;
import utils.MovieReader;
import utils.RadixSort;

public class App {
    public static void main(String[] args) throws Exception {
        MovieReader mv = new MovieReader();
        RadixSort rs = new RadixSort();

        ArrayList<Movie> movies = new ArrayList<Movie>(); // Create an ArrayList Movie
        
        for(int i= 1; i<= 1000;i++){
            movies.add(mv.readMovie(i));
        }

        long inicio = System.nanoTime();
        // Llama al metodo para ordenar mediante quicksort y guarda el resultado  en un array de peliculas ordenado
        rs.DescentSort(movies);
        long fin = System.nanoTime();
        long tiempo = fin-inicio;
        System.out.println(Math.max(0L, tiempo / 1_000_000.0d)+ " milisegundos");
        

        for(Movie movie: movies){
            System.out.println(movie.getMovie_title() + " ("+ movie.getId() + ")" + " (movie year: " + movie.getYear() + ")");
        }

    }
}
