package utils;

public class Quicksort {

    public int[] order(int A[], int left, int right) {
        int pivot = A[left]; // tomamos primer elemento como pivote
        int i = left; // i realiza la búsqueda de izquierda a derecha
        int j = right; // j realiza la búsqueda de derecha a izquierda
        int aux;

        while (i < j) { // mientras no se crucen las búsquedas
            while (A[i] <= pivot && i < j)
                i++; // busca elemento mayor que pivote
            while (A[j] > pivot)
                j--; // busca elemento menor que pivote
            if (i < j) { // si no se han cruzado
                aux = A[i]; // los intercambia
                A[i] = A[j];
                A[j] = aux;
            }
        }

        A[left] = A[j]; // se coloca el pivote en su lugar de forma que tendremos
        A[j] = pivot; // los menores a su izquierda y los mayores a su derecha

        if (left < j - 1)
            order(A, left, j - 1); // ordenamos subarray izquierdo
        if (j + 1 < right)
            order(A, j + 1, right); // ordenamos subarray derecho

        return A;
    }
}
