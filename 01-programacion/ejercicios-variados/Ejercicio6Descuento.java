import java.util.Scanner;

public class Ejercicio6Descuento {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Unidades: ");
       int unidades = sc.nextInt();

       System.out.println("Precio unitario: ");
       int precioUnitario =sc.nextInt();

       int importeTotal = unidades * precioUnitario;
       double descuento = 0.10;

       if (importeTotal > 1000){
            descuento = 0.10;
       }

       double importeSinDescuentos = importeTotal - (importeTotal * descuento);

       System.out.println("Importe  total: " + importeTotal + " euros");
       System.out.println("Descuento a aplicar: " + (descuento * 100) + "%"); 
        System.out.println("Importe neto: " + importeSinDescuentos); 
 
        sc.close(); 

    }
}