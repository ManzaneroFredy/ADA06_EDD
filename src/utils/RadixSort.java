package utils;

import java.util.ArrayList;
import java.util.List;

import model.Movie;

public class RadixSort {
    private List<Movie> movies = new ArrayList<>();
    private List<List<Movie>> number_base = new ArrayList<>(List.of(new ArrayList<Movie>() , new ArrayList<Movie>(), new ArrayList<Movie>(), new ArrayList<Movie>(),
                                            new ArrayList<Movie>(), new ArrayList<Movie>(),  new ArrayList<Movie>(), new ArrayList<Movie>(), new ArrayList<Movie>(), new ArrayList<Movie>()));
    private final static int NUMBER_BASE = 4;
    private List<Integer> movieYearsBackUp = new ArrayList<>();
   
    
    /** 
     * Esta función ordena una lista del objeto Movie de forma ascendente
     * @param moviesList
     * @return List<Movie>
     * @throws Exception
     */
    public List<Movie> AscentSort(List<Movie> moviesList) throws Exception {
        int numeroDeComparaciones = 0;
        int numeroDeIntercambios = 0;
        this.clonarAnio(moviesList);

        for (int i = 0; i < moviesList.size(); i++) {
            this.movies.add(moviesList.get(i));
        }

        // for(Movie movie: movies){
        //     System.out.println("DEBUG AÑOS PELICULAS: " + movie.getYear());
        // }
        //System.out.println("DEBUG MOVIE SIZE: " + this.movies.size());

        // Aqui comienza el método de ordenamiento radix
        for (int i = 0; i < NUMBER_BASE; i++) {
            // Una vez que se obtienen los años se procede a hacer el ordenamiento.
            for (int f = 0; f < movies.size(); f++) {
                int temp = 0;
                temp = moviesList.get(f).getYear() % 10;
                //System.out.println("DEBUG TEMP SIZE: "  + temp);
                moviesList.get(f).setYear(moviesList.get(f).getYear() / 10);
                switch (temp) {
                    case 0:
                        number_base.get(0).add(moviesList.get(f));
                        numeroDeIntercambios++;
                        break;
                    case 1:
                        number_base.get(1).add(moviesList.get(f));
                        numeroDeIntercambios++;
                        break;
                    case 2:
                        number_base.get(2).add(moviesList.get(f));
                        numeroDeIntercambios++;
                        break;
                    case 3:
                        number_base.get(3).add(moviesList.get(f));
                        numeroDeIntercambios++;
                        break;
                    case 4:
                        number_base.get(4).add(moviesList.get(f));
                        numeroDeIntercambios++;
                        break;
                    case 5:
                        number_base.get(5).add(moviesList.get(f));
                        numeroDeIntercambios++;
                        break;
                    case 6:
                        number_base.get(6).add(moviesList.get(f));
                        numeroDeIntercambios++;
                        break;
                    case 7:
                        number_base.get(7).add(moviesList.get(f));
                        numeroDeIntercambios++;
                        break;
                    case 8:
                        number_base.get(8).add(moviesList.get(f));
                        numeroDeIntercambios++;
                        break;
                    case 9:
                        number_base.get(9).add(moviesList.get(f));
                        numeroDeIntercambios++;
                        break;
                    default:
                        throw new Exception("Error en el ordenamiento radix en la parte de insertar las peliculas");
                }
                ;
            }

            // debug
            //System.out.println("DEBUG YEARS: " + number_base.get(0).get(0).getYear());

            // Se eliminan todas las peliculas ingresadas para poder ingresarlas de nuevo
            int temp2 = moviesList.size();
            //System.out.println("DEBUG TEMP SIZE: "  + temp2);
            for (int k = 0; k < temp2; k++) {
                moviesList.remove(0);
            }

            //debug
            // for (Movie movie : moviesList) {
            //     System.out.println("DEBUG MOVIES_TITLE: " + movie.getMovie_title());
            // }


            // Se ingresan de nuevo las peliculas
            for(List<Movie> listOfMovies: number_base){
                for(int j = 0; j < listOfMovies.size(); j++){
                    moviesList.add(listOfMovies.get(j));
                }
            }

            //Se eliminan todas las peliculas ingresadas en la listas
            for(int k = 0; k < 10; k++){
                for(List<Movie> listOfMovies: number_base){
                    for(int j = 0; j < listOfMovies.size(); j++){
                        listOfMovies.remove(0);
                    }
                }
            }

        }

        /*
         * //debug
         * for(Movie peli: moviesList){
         * System.out.println("Pelis: " + peli.getMovie_title());
         * }
         */

        
        //Proceso para asignarle bien los años a las peliculas 
        int h = 0;
        for(Movie movieYear: movies){
            movieYear.setYear(movieYearsBackUp.get(h));
            h++;
        }

        //Comparaciones
        for (int k = 0; k < moviesList.size(); k++) {
            for (int i = 0; i < movies.size(); i++) {
                numeroDeComparaciones++;
                //debug
                //System.out.println("DEBUG: "+moviesList.get(k) + " COMPARANDO CON:  " + movies.get(i) + " AÑO PELICULA: " + movies.get(i).getYear());
                if (moviesList.get(k).compareTo(movies.get(i)) == 0) {
                    moviesList.get(k).setYear(movies.get(i).getYear());
                    //System.out.println("DEBUG MOVIE YEAR: " +  moviesList.get(k).getYear());
                    break;
                }
            }
        }

        System.out.println("Numero de intercambios: " + numeroDeIntercambios);
        System.out.println("Número de comparaciones: " + numeroDeComparaciones);


        return moviesList;
    }

    
    /** 
     * Esta función ordena una lista del objeto Movie de forma ascendente
     * @param moviesList
     * @return List<Movie>
     * @throws Exception
     */
    public List<Movie> DescentSort(List<Movie> moviesList) throws Exception {
        int numeroDeComparaciones = 0;
        int numeroDeIntercambios = 0;

        this.clonarAnio(moviesList);

        for (int i = 0; i < moviesList.size(); i++) {
            this.movies.add(moviesList.get(i));
        }

        // for(Movie movie: movies){
        //     System.out.println("DEBUG AÑOS PELICULAS: " + movie.getYear());
        // }
        //System.out.println("DEBUG MOVIE SIZE: " + this.movies.size());

        // Aqui comienza el método de ordenamiento radix
        for (int i = 0; i < NUMBER_BASE; i++) {
            // Una vez que se obtienen los años se procede a hacer el ordenamiento.

            for (int f = 0; f < movies.size(); f++) {
                int temp = 0;
                temp = moviesList.get(f).getYear() % 10;
                //System.out.println("DEBUG TEMP SIZE: "  + temp);
                moviesList.get(f).setYear(moviesList.get(f).getYear() / 10);
                switch (temp) {
                    case 0:
                        number_base.get(0).add(moviesList.get(f));
                        break;
                    case 1:
                        number_base.get(1).add(moviesList.get(f));
                        break;
                    case 2:
                        number_base.get(2).add(moviesList.get(f));
                        break;
                    case 3:
                        number_base.get(3).add(moviesList.get(f));
                        break;
                    case 4:
                        number_base.get(4).add(moviesList.get(f));
                        break;
                    case 5:
                        number_base.get(5).add(moviesList.get(f));
                        break;
                    case 6:
                        number_base.get(6).add(moviesList.get(f));
                        break;
                    case 7:
                        number_base.get(7).add(moviesList.get(f));
                        break;
                    case 8:
                        number_base.get(8).add(moviesList.get(f));
                        break;
                    case 9:
                        number_base.get(9).add(moviesList.get(f));
                        break;
                    default:
                        throw new Exception("Error en el ordenamiento radix en la parte de insertar las peliculas");
                }
                ;
            }

            // debug
            //System.out.println("DEBUG YEARS: " + number_base.get(0).get(0).getYear());

            // Se eliminan todas las peliculas ingresadas para poder ingresarlas de nuevo
            int temp2 = moviesList.size();
            //System.out.println("DEBUG TEMP SIZE: "  + temp2);
            for (int k = 0; k < temp2; k++) {
                moviesList.remove(0);
            }

            //debug
            // for (Movie movie : moviesList) {
            //     System.out.println("DEBUG MOVIES_TITLE: " + movie.getMovie_title());
            // }


            // Se ingresan de nuevo las peliculas
            for(int k = number_base.size() - 1; k >= 0; k--){
                for(int j = 0; j < number_base.get(k).size(); j++){
                    moviesList.add(number_base.get(k).get(j));
                }
            }

            //Se eliminan todas las peliculas ingresadas en la listas
            for(int k = 0; k < 10; k++){
                for(List<Movie> listOfMovies: number_base){
                    for(int j = 0; j < listOfMovies.size(); j++){
                        listOfMovies.remove(0);
                    }
                }
            }

        }

        /*
         * //debug
         * for(Movie peli: moviesList){
         * System.out.println("Pelis: " + peli.getMovie_title());
         * }
         */

        
        //Proceso para asignarle bien los años a las peliculas 
        int h = 0;
        for(Movie movieYear: movies){
            movieYear.setYear(movieYearsBackUp.get(h));
            h++;
        }

        for (int k = 0; k < moviesList.size(); k++) {
            for (int i = 0; i < movies.size(); i++) {
                //debug
                //System.out.println("DEBUG: "+moviesList.get(k) + " COMPARANDO CON:  " + movies.get(i) + " AÑO PELICULA: " + movies.get(i).getYear());
                if (moviesList.get(k).compareTo(movies.get(i)) == 0) {
                    moviesList.get(k).setYear(movies.get(i).getYear());
                    //System.out.println("DEBUG MOVIE YEAR: " +  moviesList.get(k).getYear());
                    break;
                }
            }
        }
        
        
        
        System.out.println("Numero de intercambios: " + numeroDeIntercambios);
        System.out.println("Número de comparaciones: " + numeroDeComparaciones);
        return moviesList;
    }


    private void clonarAnio(List<Movie> listaAClonar){
        for(Movie movie: listaAClonar){
            this.movieYearsBackUp.add(movie.getYear());
        }
    }

}
