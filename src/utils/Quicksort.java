package utils;

import java.util.ArrayList;

import model.Movie;

public class Quicksort {

    public ArrayList<Movie> order(ArrayList<Movie> movies, int left, int right, int orderType) {
        Movie pivot = movies.get(left); // tomamos primer elemento como pivote
        int i = left; // i realiza la búsqueda de izquierda a derecha
        int j = right; // j realiza la búsqueda de derecha a izquierda
        Movie aux;

        switch (orderType) {
            //Ordenar de menor a mayor
            case 1:
                while (i < j) { // mientras no se crucen las búsquedas
                    while (movies.get(i).compareTo(pivot.getYear()) <= 0 && i < j)
                        i++; // busca elemento mayor que pivote
                    while (movies.get(j).compareTo(pivot.getYear()) > 0)
                        j--; // busca elemento menor que pivote
                    if (i < j) { // si no se han cruzado
                        aux = movies.get(i); // los intercambia
                        movies.set(i, movies.get(j));
                        movies.set(j, aux);
                    }
                }
                break;
            //Ordenar de mayor a menor
            case 2:
                while (i < j) { // mientras no se crucen las búsquedas
                    while (movies.get(i).compareTo(pivot.getYear()) >= 0 && i < j)
                        i++; // busca elemento mayor que pivote
                    while (movies.get(j).compareTo(pivot.getYear()) < 0)
                        j--; // busca elemento menor que pivote
                    if (i < j) { // si no se han cruzado
                        aux = movies.get(i); // los intercambia
                        movies.set(i, movies.get(j));
                        movies.set(j, aux);
                    }
                }
                break;
            //Ordenar en orden alfabetico
            case 3:
                while (i < j) { // mientras no se crucen las búsquedas
                    while (movies.get(i).compareTo(pivot) <= 0 && i < j)
                        i++; // busca elemento mayor que pivote
                    while (movies.get(j).compareTo(pivot) > 0)
                        j--; // busca elemento menor que pivote
                    if (i < j) { // si no se han cruzado
                        aux = movies.get(i); // los intercambia
                        movies.set(i, movies.get(j));
                        movies.set(j, aux);
                    }
                }
                break;
            //Ordenar en orden alfabetico inverso
            case 4:
                while (i < j) { // mientras no se crucen las búsquedas
                    while (movies.get(i).compareTo(pivot) >= 0 && i < j)
                        i++; // busca elemento mayor que pivote
                    while (movies.get(j).compareTo(pivot) < 0)
                        j--; // busca elemento menor que pivote
                    if (i < j) { // si no se han cruzado
                        aux = movies.get(i); // los intercambia
                        movies.set(i, movies.get(j));
                        movies.set(j, aux);
                    }
                }
                break;

            default:
        }

        movies.set(left, movies.get(j));// se coloca el pivote en su lugar de forma que tendremos
        movies.set(j, pivot); // los menores a su izquierda y los mayores a su derecha

        if (left < j - 1)
            order(movies, left, j - 1, orderType); // ordenamos subarray izquierdo
        if (j + 1 < right)
            order(movies, j + 1, right, orderType); // ordenamos subarray derecho

        return movies;
    }
}
