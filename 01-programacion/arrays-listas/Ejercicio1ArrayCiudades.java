import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collection;

public class Ejercicio1ArrayCiudades {
    public static void main(String[] args) {
       List<String> ciudades = new ArrayList<>(); 
       Scanner sc = new Scanner(System.in);
        System.out.println("Introduce ciudades: ");
       
        while (true) {
            String ciudad = sc.nextLine();
            if (ciudad.isEmpty()){ // isEmpty es para salir cuando detecta un espacio en blanco y le damos al enter y se sale ya del introducir datos.
                break;
            }
            ciudades.add(ciudad);
        }

        System.out.println(ciudades);

       
       System.out.println("Primera ciudad introducida: " + ciudades.get(0));
       System.out.println("Ultima ciudad introducida: " + ciudades.get((ciudades.size() - 1)));
       
       for (int i = 0; i < ciudades.size(); i += 2){
        System.out.println("Ciudades que estan en posiciones pares: " + i + ciudades.get(i));
       }

    }
}