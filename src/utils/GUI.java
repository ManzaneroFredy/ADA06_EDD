package utils;

import java.util.Scanner;

public class GUI {

    public int mostrarMenuHome() {
        int opcion = -1;
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("=======================================================");
            System.out.println("               Ordenamiento de peliculas");
            System.out.println("=======================================================");
            System.out.println("    Selecione una propiedad para hacer el ordenamiento:");
            System.out.println("        1. Por nombre");
            System.out.println("        2. Por año de lanzamiento");
            System.out.println("");
            opcion = input.nextInt();
            input.close();
            return opcion;
        }catch(Exception ex){
            System.out.println("No ingrese valores invalidos");
            mostrarMenuHome();
        }
        return opcion;
    }

    public void mostrarCabeceraRc() {
        System.out.println("==============DISEÑO DE SOFTWARE==============");
        System.out.println("Ingrese las calificaciones de los alumnos");
        System.out.println("Matricula                  Calificación");
    }

    public String mostrarCabeceraGs() {
        String direccion;
        Scanner input = new Scanner(System.in);
        System.out.println("================================================================================================");
        System.out.println("");
        System.out.println("                                   Exportar calificaciones");
        System.out.println("");
        System.out.println("================================================================================================");
        System.out.println("    Ingrese la dirección absoluta de donde se encuentra el archivo de peliculas en formato .csv:");
        System.out.println("Ejemplo E:/Archivos/Semestre 4/Estructura de datos/Unidad 3/ADA06/ADA06/src/Docs/Movie.csv");
        direccion = input.nextLine();
        input.close();
        return direccion;
    }

    public void mostrarCabeceraLogin(){

        System.out.println("==============================================");
        System.out.println("                    LOGIN");
        System.out.println("Proporcione un nombre de usuario y contrasena");
        System.out.println("               para continuar");
        System.out.println("==============================================");



     
    }

}
