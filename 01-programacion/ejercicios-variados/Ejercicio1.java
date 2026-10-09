import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();
        final int DIAS = 7;

        System.out.println("Introduce " + DIAS + " temperaturas en Celsius: ");

        for (int i = 0; i < DIAS; i++) {
            double celsius = sc.nextDouble();
            double fahrenheit = celsius * 9 / 5 + 32;
            temperaturas.add(fahrenheit);
        }

        double suma = 0;
        for (double t : temperaturas) {
            suma += t;
        }
        double media = suma / temperaturas.size();

        System.out.println("La temperatura media es: " + media + " °F");
        System.out.println("La temperatura máxima es: " + Collections.max(temperaturas) + " °F");
        System.out.println("La temperatura mínima es: " + Collections.min(temperaturas) + " °F");

        sc.close();
    }
}