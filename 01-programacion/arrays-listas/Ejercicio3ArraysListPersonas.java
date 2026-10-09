import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3ArraysListPersonas {
    public static void main(String[] args) {
        List<String> nombresPersonas = new ArrayList<>(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los nombres de las personas: ");

        while (true) {
            String nombre = sc.nextLine();
            if (nombre.isEmpty()){ // isEmpty es para salir cuando detecta un espacio en blanco y le damos al enter y se sale ya del introducir datos.
                break;
            }
            nombresPersonas.add(nombre);
           
        }
        //Punto1
        System.out.println("Lista completa de los nombres: " + nombresPersonas);
        //Punto2
        System.out.println("Número de nombres que hay en la lista: " + nombresPersonas.size());
        //Punto3
        System.out.println("Introduce un nombre: ");
        String buscarNombre = sc.nextLine();
        //Metodo para que nos devuelva la posicion
        int posicion = nombresPersonas.indexOf(buscarNombre);

        if (posicion == -1) {
            System.out.println("El nombre está en la posición: " + posicion);
        } else {
            System.out.println("El nombre está en la posición: " + posicion);
        }
         //Punto4
        Collections.sort(nombresPersonas);
        System.out.println("Lista ordenada alfabeticamente: " + nombresPersonas);
        
        

    }
}