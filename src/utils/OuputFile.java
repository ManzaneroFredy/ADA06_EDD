package utils;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import model.Movie;


public class OuputFile{


    public void generateOuput(List<Movie> listaMovie, String direccionDeSalida) throws Exception{
        FileOutputStream archivoCsv = new FileOutputStream(direccionDeSalida);
        OutputStreamWriter salida = new OutputStreamWriter(archivoCsv, "UTF-8");

        for(Movie movie: listaMovie){
            salida.write(movie.getId() + ", " + movie.getMovie_title() + ", " + movie.getDuration()+ ", " + movie.getColor()+ ", " + movie.getLanguage()
            + ", " + movie.getCountry()+ ", " + movie.getContent_rating()+ ", " + movie.getBudget()+ ", " + movie.getYear()+ ", " + movie.getImdb_score()
            + ", " + movie.getAspect_ratio()+ ", " + movie.getMovie_imdb_link() + "\n");
        }
        
        salida.close();
    }

  
}
