package utils;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import model.Movie;


public class OutputFile{


    
    /** 
     * Funcion que genera las salidas
     * @param listaMovie
     * @throws Exception
     */
    public void generateOutput(List<Movie> listaMovie) throws Exception{
        FileOutputStream archivoCsv = new FileOutputStream("MovieOutput.csv");
        OutputStreamWriter salida = new OutputStreamWriter(archivoCsv, "UTF-8");

        for(Movie movie: listaMovie){
            salida.write(movie.getId() + ", " + movie.getMovie_title() + ", " + movie.getDuration()+ ", " + movie.getColor()+ ", " + movie.getLanguage()
            + ", " + movie.getCountry()+ ", " + movie.getContent_rating()+ ", " + movie.getBudget()+ ", " + movie.getYear()+ ", " + movie.getImdb_score()
            + ", " + movie.getAspect_ratio()+ ", " + movie.getMovie_imdb_link() + "\n");
        }
        
        salida.close();
    }

    
    /** 
     * Funcion que genera las salidas
     * @param listaMovie
     * @throws Exception
     */
    public void generateOutput(ArrayList<Movie> listaMovie) throws Exception{
        FileOutputStream archivoCsv = new FileOutputStream("MovieOutput.cvs");
        OutputStreamWriter salida = new OutputStreamWriter(archivoCsv, "UTF-8");

        for(Movie movie: listaMovie){
            salida.write(movie.getId() + ", " + movie.getMovie_title() + ", " + movie.getDuration()+ ", " + movie.getColor()+ ", " + movie.getLanguage()
            + ", " + movie.getCountry()+ ", " + movie.getContent_rating()+ ", " + movie.getBudget()+ ", " + movie.getYear()+ ", " + movie.getImdb_score()
            + ", " + movie.getAspect_ratio()+ ", " + movie.getMovie_imdb_link() + "\n");
        }
        
        salida.close();
    }


    
    /** 
     * Funcion que genera la salida de las métricas
     * @param listaMetricas
     * @param direccionDeSalida
     * @throws Exception
     */
    public void generateMetrics(int exchanges, int comparations, double executionTime) throws Exception{
        FileOutputStream archivoCsv = new FileOutputStream("Metricas.txt");
        OutputStreamWriter salida = new OutputStreamWriter(archivoCsv, "UTF-8");


        salida.write("==============Métricas del algoritmo==============\n");
        salida.write("Tiempo de ejecución: " + executionTime + " milisegundos\n");
        salida.write("Intercambios       : " + exchanges + "\n");
        salida.write("Comparaciones      : " + comparations+ "\n");

        salida.close();
    }

  
}
