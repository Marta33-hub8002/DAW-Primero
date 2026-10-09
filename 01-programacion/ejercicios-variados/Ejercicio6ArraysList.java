import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
public class Ejercicio6ArraysList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> calificaciones = new ArrayList<>();

        System.out.println("Introduce las notas: ");
        
        while (true) {
            double nota = sc.nextDouble();
            if (nota == -1) {
                break;
            }
            calificaciones.add(nota);
        }
        double suma = 0;
        for(int i = 0; i < calificaciones.size();i++){
           suma = suma + calificaciones.get(i);
        }
        double media = suma/calificaciones.size();
        System.out.println("La media: " + media);
       
        int contador = 0;
        System.out.println("Notas que superan la media:");
        
        for (int i = 0; i < calificaciones.size(); i++) {
        if (calificaciones.get(i) > media) {
        System.out.println(calificaciones.get(i));
                contador++;
            }
        }
        System.out.println("Número de alumnos que han superado la media: " + contador);
        
    }
}