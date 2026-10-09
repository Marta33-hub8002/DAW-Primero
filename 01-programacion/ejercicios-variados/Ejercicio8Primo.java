import java.util.Scanner;

public class Ejercicio8Primo {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Dime un numero: ");
        int numero = sc.nextInt();
       
        int contadorDivisores = 0;
        for(int i = 1; i <= numero; i++){

            if (numero % i == 0){
                contadorDivisores++;
            }
            if (contadorDivisores > 2){
                System.out.println("El numero no es" + numero+ " primo");
            }else{
                System.out.println("El numero " + numero + "es primo");
            }
            
            sc.close();
        }
    }

}