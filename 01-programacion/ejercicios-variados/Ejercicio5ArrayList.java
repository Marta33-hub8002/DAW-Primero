import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Ejercicio5ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>(); 
        
        System.out.println("Introduce 7 Temperaturas: ");

        for( int i = 0; i < 7; i++){
            double temperatura = sc.nextDouble();
            temperaturas.add(temperatura);
        }
        double suma = 0;
        for(int i = 0; i < temperaturas.size(); i++){
            suma = suma + temperaturas.get(i);
        }
        double media = suma/7;

        double temMaxima = Collections.max(temperaturas);
        System.out.println("La temperatura maxima es: " + temMaxima);
        double temMinima = Collections.min(temperaturas);
        System.out.println("La temperatura minima es: " + temMinima);

    
    }
}