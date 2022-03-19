package utils;

import java.util.Scanner;

public class GUI {

    public void showHomeView() {
        
            System.out.println("=======================================================");
            System.out.println("               Ordenamiento de peliculas");
            System.out.println("=======================================================");
            System.out.println("    Seleccione un algoritmo para realizar el ordenamiento:");
            System.out.println("        1. Quicksort");
            System.out.println("        2. InsertionSort");
            System.out.println("        3. RadixSort");
            System.out.println("        4. Salir");
            System.out.println("");
            
    }

    public int showOrderTypeView() {
        int opcion = -1;
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("=======================================================");
            System.out.println("               Ordenamiento de peliculas");
            System.out.println("=======================================================");
            System.out.println("   ¿Como desea ordenar las peliculas?:");
            System.out.println("        1. De menor a mayor (Año)");
            System.out.println("        2. De mayor a menor (Año)");
            System.out.println("        3. En orden alfabético (Título)");
            System.out.println("        4. En orden alfabético Inverso (Título)");
            System.out.println("");
            opcion = input.nextInt();
           
            return opcion;
        } catch (Exception ex) {
            System.out.println("No ingrese valores invalidos");
            showOrderTypeView();
        }
        return opcion;
    }

    public int showOrderTypeViewLimited() {
        int opcion = -1;
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("=======================================================");
            System.out.println("               Ordenamiento de peliculas");
            System.out.println("=======================================================");
            System.out.println("   ¿Como desea ordenar las peliculas?:");
            System.out.println("        1. De menor a mayor (Año)");
            System.out.println("        2. De mayor a menor (Año)");
            System.out.println("");
            opcion = input.nextInt();
            
            return opcion;
        } catch (Exception ex) {
            System.out.println("No ingrese valores invalidos");
            showOrderTypeView();
        }
        return opcion;
    }

    public void showMetricsView(int exchanges, int comparations, double executionTime) {
        System.out.println("==============Métricas del algoritmo==============");
        System.out.println("Tiempo de ejecución: " + executionTime + " milisegundos");
        System.out.println("Intercambios       : " + exchanges);
        System.out.println("Comparaciones      : " + comparations);
    }

    public String showRootView() {
        String direccion;
        Scanner input = new Scanner(System.in);
        System.out.println(
                "================================================================================================");
        System.out.println("");
        System.out.println("                                   Ordenar Peliculas - ADA06");
        System.out.println("");
        System.out.println(
                "================================================================================================");
        System.out.println(
                "    Ingrese la dirección absoluta de donde se encuentra el archivo de peliculas en formato .csv:");
        System.out.println("Ejemplo src/docs/Movie.csv");
        direccion = input.nextLine();
        
        return direccion;
    }


}
