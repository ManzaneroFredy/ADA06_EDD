package utils;

import java.util.ArrayList;

import model.Movie;

public class InsertionSort {

    private int comparations = 0;
    private int exChanges = 0;

    /**
     * 
     * método para ordenar por insertion sort
     * @param movies
     * @param x
     * @return ArrayList<Movie>
     */
    public ArrayList<Movie> order(ArrayList<Movie> movies, int x) {

        int currentIndex;
        Movie key;

        switch (x) {
            case 3:
                for (int i = 0; i < movies.size(); i++) {
                    key = movies.get(i);
                    currentIndex = i - 1;
                    while (currentIndex >= 0 && movies.get(currentIndex).compareTo(key) > 0) {
                        movies.set(currentIndex + 1, movies.get(currentIndex));
                        currentIndex--;
                        this.comparations++;
                        this.exChanges++;
                    }
                    movies.set(currentIndex + 1, key);
                    this.comparations++;
                }

                break;

            case 4:

                for (int i = 0; i < movies.size(); i++) {
                    key = movies.get(i);
                    currentIndex = i - 1;
                    while (currentIndex >= 0 && movies.get(currentIndex).compareTo(key) < 0) {
                        movies.set(currentIndex + 1, movies.get(currentIndex));
                        currentIndex--;
                        this.comparations++;
                        this.exChanges++;

                    }
                    movies.set(currentIndex + 1, key);
                    this.comparations++;
                }

                break;

            case 1:

                for (int i = 0; i < movies.size(); i++) {
                    key = movies.get(i);
                    currentIndex = i - 1;
                    while (currentIndex >= 0 && movies.get(currentIndex).compareTo(key.getYear()) > 0) {
                        movies.set(currentIndex + 1, movies.get(currentIndex));
                        currentIndex--;
                        this.comparations++;
                        this.exChanges++;

                    }
                    movies.set(currentIndex + 1, key);
                    this.comparations++;

                }

                break;

            case 2:

                for (int i = 0; i < movies.size(); i++) {
                    key = movies.get(i);
                    currentIndex = i - 1;
                    while (currentIndex >= 0 && movies.get(currentIndex).compareTo(key.getYear()) < 0) {
                        movies.set(currentIndex + 1, movies.get(currentIndex));
                        currentIndex--;
                        this.comparations++;
                        this.exChanges++;

                    }
                    movies.set(currentIndex + 1, key);
                    this.comparations++;

                }

                break;

            default:

        }

        return movies;
    }

     /**
     * getter para los intercambios
     */
    public int getExChange() {

        return this.exChanges;
    }

    /**
     * getter para las comparaciones
     */
    public int getComparations() {

        return this.comparations;

    }

}
