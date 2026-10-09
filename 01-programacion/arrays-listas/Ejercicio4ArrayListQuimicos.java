import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4ArrayListQuimicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> elementos = new ArrayList<>(); 
        System.out.println("Introduce los elementos quimicos: ");

         while (true) {
            String elementoString = sc.nextLine();
            if (elementoString.isEmpty()) {
                break;
            }
            elementos.add(elementoString);
        }
        System.out.println("Elementos quimicos: " + elementos);

        int nitrogeno = elementos.indexOf("nitrogeno");
        int cloro = elementos.indexOf("cloro");
        System.out.println("La posicion del nitrogeno es: " + nitrogeno);
        System.out.println("La posicion del cloro es: " + cloro);

        System.out.println("dime un nombre de un elemento que quieras eliminar: ");
        String elementoEliminado = sc.next();
        elementos.remove(elementoEliminado);
        System.out.println("Lista de elementos: " + elementos);
        
     }
}