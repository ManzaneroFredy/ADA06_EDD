package utils;

import java.util.ArrayList;
import java.util.List;

import model.Movie;

public class RadixSort {
    private List<Movie> movies = new ArrayList<>();
    private List<List<Movie>> number_base = new ArrayList<>();
    private final static int NUMBER_BASE = 4;

    public List<Movie> ordenar(List<Movie> moviesList) throws Exception {

        for (int i = 0; i < movies.size(); i++) {
            this.movies.add(moviesList.get(i));
        }

        // se inicializan las listas correspondientes con la base del número, en este
        // caso, estamos trabajando con numero decimales
        for (int i = 0; i < 10; i++) {
            number_base.add(null);
        }

        // Aqui comienza el método de ordenamiento radix
        for (int i = 0; i < movies.size(); i++) {

            // Una vez que se obtienen los años se procede a hacer el ordenamiento.
            for (int j = 0; j < NUMBER_BASE; j++) {
                int temp = 0;
                temp = moviesList.get(j).getYear() % 10;
                moviesList.get(j).setYear(moviesList.get(j).getYear() % 10);
                switch (temp) {
                    case 0:
                        number_base.get(0).add(moviesList.get(j));
                        break;
                    case 1:
                        number_base.get(1).add(moviesList.get(j));
                        break;
                    case 2:
                        number_base.get(2).add(moviesList.get(j));
                        break;
                    case 3:
                        number_base.get(3).add(moviesList.get(j));
                        break;
                    case 4:
                        number_base.get(4).add(moviesList.get(j));
                        break;
                    case 5:
                        number_base.get(5).add(moviesList.get(j));
                        break;
                    case 6:
                        number_base.get(6).add(moviesList.get(j));
                        break;
                    case 7:
                        number_base.get(7).add(moviesList.get(j));
                        break;
                    case 8:
                        number_base.get(8).add(moviesList.get(j));
                        break;
                    case 9:
                        number_base.get(9).add(moviesList.get(j));
                        break;
                    default:
                        throw new Exception("Error en el ordenamiento radix en la parte de insertar las peliculas");
                }
                ;

                // Se eliminan todas las peliculas ingresadas para poder ingresarlas de nuevo
                int temp2 = moviesList.size();
                for (int k = 0; k < temp2; k++) {
                    moviesList.remove(0);
                }

                // Se ingresan de nuevo las peliculas
                for (int k = 0; k < number_base.get(0).size(); k++) {
                    moviesList.add(number_base.get(0).get(k));
                }

                for (int k = 0; k < number_base.get(1).size(); k++) {
                    moviesList.add(number_base.get(1).get(k));
                }

                for (int k = 0; k < number_base.get(2).size(); k++) {
                    moviesList.add(number_base.get(2).get(k));
                }

                for (int k = 0; k < number_base.get(3).size(); k++) {
                    moviesList.add(number_base.get(3).get(k));
                }

                for (int k = 0; k < number_base.get(4).size(); k++) {
                    moviesList.add(number_base.get(4).get(k));
                }

                for (int k = 0; k < number_base.get(5).size(); k++) {
                    moviesList.add(number_base.get(5).get(k));
                }

                for (int k = 0; k < number_base.get(6).size(); k++) {
                    moviesList.add(number_base.get(6).get(k));
                }

                for (int k = 0; k < number_base.get(7).size(); k++) {
                    moviesList.add(number_base.get(7).get(k));
                }

                for (int k = 0; k < number_base.get(8).size(); k++) {
                    moviesList.add(number_base.get(8).get(k));
                }

                for(int k = 0; k <number_base.get(9).size(); k++){
                    moviesList.add(number_base.get(9).get(k));
                }

            }
        }
        
        for(int k = 0; k < moviesList.size(); k++){
            for(int i = 0; i < moviesList.size(); i++){
                if(moviesList.get(k).compareTo(movies.get(i)) == 0){
                    moviesList.get(i).setYear(movies.get(i).getYear());
                }
            }
        }
        return moviesList;
    }

   
}
