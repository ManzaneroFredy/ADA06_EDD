package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;

import model.Movie;

public class MovieReader {
    private String RUTA_ARCHIVO = "src/docs/Movie.csv";
    private final static String SEPARATOR = ",";
    private BufferedReader documentReader = null;

    
    /** 
     * Metodo que hace un recorrido del archivo Movie.csv y retorna un objeto Movie dependiendo de la posicion indicada
     * @param index Posicion de la pelicula 
     * @return Movie Objeto movie que contiene todos los datos de la pelicula
     * @throws Exception 
     */
    public Movie readMovie(int index) throws Exception {
        try {
            this.documentReader = new BufferedReader(new FileReader(RUTA_ARCHIVO,StandardCharsets.UTF_8));
            String line = "";
            line = documentReader.readLine();
            line = documentReader.readLine();
            for(int i = 0; i < index -1 ; i++){
                line = documentReader.readLine();
            }
            String[] fileData = line.split(SEPARATOR);
            fileData[0] = fileData[0].replace("?1", "1");
            Movie movie = new Movie();
            movie.setId(fileData[0] != "" ? Integer.parseInt(fileData[0]): 0 );
            movie.setMovie_title(fileData[1] != "" ? fileData[1] : "No Title");
            movie.setDuration(fileData[2] != "" ? Integer.parseInt(fileData[2]) : 00);
            movie.setColor(fileData[3] != "" ? fileData[3] : "No Color");
            movie.setLanguage(fileData[4] != ""? fileData[4] : "No language");
            movie.setCountry(fileData[5] != ""? fileData[4] : "No Country");
            movie.setContent_rating(fileData[6] != ""? fileData[6] : "No Content rating");
            movie.setBudget(fileData[7] != ""? Long.parseLong(fileData[7]) : 0);
            movie.setYear(fileData[8] != ""? Integer.parseInt(fileData[8]) : 0);
            movie.setImdb_score(fileData[9] != ""? Double.parseDouble(fileData[9]) : 0);
            movie.setAspect_ratio(fileData[10] != ""? Double.parseDouble(fileData[10]) : 0);
            movie.setMovie_imdb_link(fileData[11] != "" ? fileData[11] : "No imdb Link");
            return movie;
        } catch (Exception ex) {
            System.out.println("problema detectado " + ex);
            return new Movie("No DATA");
        } finally {
            if (null != documentReader) {
                documentReader.close();
            }
        }
        
    }


    
    /** 
     * Metodo que genera un archivo csv con una lista de tipo DELink<Movie>
     * @param listaMovie Recibe el primer elemento de la lista para recorrer los siguientes elementos
     * @throws Exception
     */
    // public void generarArchivoSalida(DELink<Movie> listaMovie) throws Exception{
    //     FileOutputStream archivoCsv = new FileOutputStream("src/Docs/MovieFinal.csv");
    //     OutputStreamWriter salida = new OutputStreamWriter(archivoCsv, "UTF-8");
    //     DELink<Movie> temp = listaMovie;

    //     while(temp.getNext() != null){
    //         salida.write(temp.getdData().getId() + ", " + temp.getdData().getMovie_title() + ", " + temp.getdData().getDuration()+ ", " + temp.getdData().getColor()+ ", " + temp.getdData().getLanguage()
    //         + ", " + temp.getdData().getCountry()+ ", " + temp.getdData().getContent_rating()+ ", " + temp.getdData().getBudget()+ ", " + temp.getdData().getYear()+ ", " + temp.getdData().getImdb_score()
    //         + ", " + temp.getdData().getAspect_ratio()+ ", " + temp.getdData().getMovie_imdb_link() + "\n");
    //         temp = temp.getNext();
    //     }
    //     salida.close();
    // }
}
