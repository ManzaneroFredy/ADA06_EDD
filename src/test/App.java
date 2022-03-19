package test;

import java.util.ArrayList;

import model.Movie;
import utils.OuputFile;
import utils.MovieReader;
import utils.RadixSort;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String archivoDeSalida = "";
        MovieReader mv = new MovieReader();
        RadixSort rs = new RadixSort();
        OuputFile archivoSalida = new OuputFile();

        ArrayList<Movie> movies = new ArrayList<Movie>(); // Create an ArrayList Movie
        System.out.println("Ingrese la ruta donde desee generar el archivo de salida");
        archivoDeSalida = input.nextLine();
        input.close();


        
        for(int i= 1; i<= 500;i++){
            movies.add(mv.readMovie(i));
        }

        long inicio = System.nanoTime();
        // Llama al metodo para ordenar mediante quicksort y guarda el resultado  en un array de peliculas ordenado
        long fin = System.nanoTime();
        long tiempo = fin-inicio;
        System.out.println(Math.max(0L, tiempo / 1_000_000.0d)+ " milisegundos");
        

        for(Movie movie: movies){
            System.out.println(movie.getMovie_title() + " ("+ movie.getId() + ")" + " (movie year: " + movie.getYear() + ")");
        }

        archivoSalida.generateOuput(rs.DescentSort(movies), archivoDeSalida);

    }
}
