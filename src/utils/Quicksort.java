package utils;

import java.util.ArrayList;

import model.Movie;

public class Quicksort {

    public ArrayList<Movie> order(ArrayList<Movie> movies, int left, int right) {
        Movie pivot = movies.get(left); // tomamos primer elemento como pivote
        int i = left; // i realiza la búsqueda de izquierda a derecha
        int j = right; // j realiza la búsqueda de derecha a izquierda
        Movie aux;

        while (i < j) { // mientras no se crucen las búsquedas
            while (movies.get(i).compareTo(pivot) <= 0 && i < j)
                i++; // busca elemento mayor que pivote
            while (movies.get(j).compareTo(pivot)> 0)
                j--; // busca elemento menor que pivote
            if (i < j) { // si no se han cruzado
                aux = movies.get(i); // los intercambia
                movies.set(i, movies.get(j));
                movies.set(j, aux);
            }
        }
        movies.set(left, movies.get(j));// se coloca el pivote en su lugar de forma que tendremos
        movies.set(j, pivot); // los menores a su izquierda y los mayores a su derecha

        if (left < j - 1)
            order(movies, left, j - 1); // ordenamos subarray izquierdo
        if (j + 1 < right)
            order(movies, j + 1, right); // ordenamos subarray derecho

        return movies;
    }
}
