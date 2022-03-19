package test;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import model.Movie;
import utils.OutputFile;
import utils.Quicksort;
import utils.GUI;
import utils.InsertionSort;
import utils.MovieReader;
import utils.RadixSort;
import java.util.Scanner;

public class App {
    
    /** 
     * Inicio la funcion principal
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        // Inicializamos el movieReader
        MovieReader movieReader = new MovieReader();
        // Algoritmos
        RadixSort rs = new RadixSort();
        Quicksort quicksort = new Quicksort();
        InsertionSort insertionSort = new InsertionSort();

        OutputFile outputFile = new OutputFile();
        // Create an ArrayList Movie
        ArrayList<Movie> movies = new ArrayList<Movie>();
        ArrayList<Movie> orderedMovies = new ArrayList<Movie>();
        List<Movie> orderedMoviesRs = new ArrayList<Movie>();  

        //Metricas
        long startTime = 0;
        long endTime = 0;
        long totalTime = 0;
        int comparations = 0;
        int exchanges = 0;

        // Variables del menu
        GUI gui = new GUI();
        String outputPath;

        // Inicializamos el rootView para leer la ruta del archivo
        outputPath = gui.showRootView();
        movies = movieReader.readMovie(outputPath);

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario
        int orderType;

        while (!salir) {
            gui.showHomeView();
            try {
                opcion = sn.nextInt();
                switch (opcion) {
                    //Quicksort
                    case 1:
                        do{
                            orderType = gui.showOrderTypeView();
                        }while(orderType < 1 || orderType > 4);
                        switch (orderType) {
                            case 1:
                                startTime = System.nanoTime();
                                orderedMovies = quicksort.order(movies, 0, movies.size() - 1, orderType);
                                endTime = System.nanoTime();
                                salir = true;
                                break;   
                            case 2:
                                startTime = System.nanoTime();
                                orderedMovies = quicksort.order(movies, 0, movies.size() - 1, orderType);
                                endTime = System.nanoTime();
                                salir = true;
                                break;   
                            case 3:
                                startTime = System.nanoTime();
                                orderedMovies = quicksort.order(movies, 0, movies.size() - 1, orderType);
                                endTime = System.nanoTime();
                                salir = true;
                                break;   
                            case 4:
                                startTime = System.nanoTime();
                                orderedMovies = quicksort.order(movies, 0, movies.size() - 1, orderType);
                                endTime = System.nanoTime();
                                salir = true;
                                break;   
                            default:
                                System.out.println("Solo números entre 1 y 4");
                        }
                        exchanges = quicksort.getExchanges();
                        comparations = quicksort.getComparisons();
                        break;
                    //InsertionSort
                    case 2:
                        do{
                            orderType = gui.showOrderTypeView();
                        }while(orderType < 1 || orderType > 4);
                        switch (orderType) {
                            case 1:
                                startTime  = System.nanoTime();
                                orderedMovies = insertionSort.order(movies, orderType);
                                endTime = System.nanoTime();
                                salir = true;
                                break;
                            case 2:
                                startTime  = System.nanoTime();
                                orderedMovies = insertionSort.order(movies, orderType);
                                endTime = System.nanoTime();
                                salir = true;
                                break;
                            case 3:
                                startTime  = System.nanoTime();
                                orderedMovies = insertionSort.order(movies, orderType);
                                endTime = System.nanoTime();
                                salir = true;
                                break;
                            case 4:
                                startTime  = System.nanoTime();
                                orderedMovies = insertionSort.order(movies, orderType);
                                endTime = System.nanoTime();
                                salir = true;
                                break;
                            default:
                                System.out.println("Solo números entre 1 y 4");
                        }
                        exchanges = insertionSort.getExChange();
                        comparations = insertionSort.getComparations();
                        break;

                    //RadixSort
                    case 3:
                        do{
                            orderType = gui.showOrderTypeViewLimited();
                        }while(orderType < 1 || orderType > 2);
                        switch (orderType) {
                            case 1:
                                startTime  = System.nanoTime();
                                orderedMoviesRs = rs.AscentSort(movies);
                                endTime = System.nanoTime();
                                salir = true;
                                break;
                            case 2:
                                startTime  = System.nanoTime();
                                orderedMoviesRs = rs.DescentSort(movies);
                                endTime = System.nanoTime();
                                salir = true;
                                break;
                            default:
                                System.out.println("Solo números entre 1 y 2");
                        }
                        exchanges = rs.getNumeroDeIntercambios();
                        comparations = rs.getNumeroDeComparaciones();
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

        // long inicio = System.nanoTime();
        // outputFile.generateOuput(rs.DescentSort(movies));
        // long fin = System.nanoTime();
         totalTime = endTime - startTime;
         //System.out.println(Math.max(0L, totalTime / 1_000_000.0d) + " milisegundos");


         //Generate Output File
         if(orderedMoviesRs.size() > 0){
            outputFile.generateOutput(orderedMoviesRs);
         }else{
            outputFile.generateOutput(orderedMovies);
         }


         //Generate Metrics and show in console
         
         gui.showMetricsView(exchanges,comparations,Math.max(0L, totalTime / 1_000_000.0d));
         outputFile.generateMetrics(exchanges, comparations, Math.max(0L, totalTime / 1_000_000.0d));

        //  //Show orderedMovies in console
        // for(Movie movie: movies){
        // System.out.println(movie.toString());
        // }

    }
}
