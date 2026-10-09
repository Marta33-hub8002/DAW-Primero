import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2ArraysListTareas {
    public static void main(String[] args) {
         List<String> tareas = new ArrayList<>(); 
       Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las tareas: ");

        while (true) {
            String tareaString = sc.nextLine();
            if (tareaString.isEmpty()){ // isEmpty es para salir cuando detecta un espacio en blanco y le damos al enter y se sale ya del introducir datos.
                break;
            }
            tareas.add(tareaString);
        }
        System.out.println("Lista de tareas de ahora: " + tareas);
        System.out.println("Introduce una nueva tarea: ");
        String nuevaTarea = sc.nextLine();
       
        System.out.println("Dime un número para la posición de la tarea: ");
        int posicionTarea = sc.nextInt();
        int indice = posicionTarea -1;
        System.out.println(indice);
        tareas.set(indice, nuevaTarea);
        
        System.out.println("Lista de tareas final: " + tareas);


    }
}