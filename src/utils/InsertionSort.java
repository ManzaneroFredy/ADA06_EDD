package utils;

import java.util.ArrayList;

import Model.Movie;

public class InsertionSort {

    public ArrayList<Movie> order(ArrayList<Movie> movies) {
        int currentIndex;
        Movie key;
        for (int i = 0; i < movies.size(); i++){
            key = movies.get(i);
            currentIndex = i-1;
            while(currentIndex >= 0 && movies.get(currentIndex).compareTo(key) > 0){
                movies.set(currentIndex + 1, movies.get(currentIndex));
                currentIndex--;
                
            }
            movies.set(currentIndex + 1, key);
        }

        return movies;
    }

}
