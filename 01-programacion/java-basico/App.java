import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
    /* int a = 4; // numeros enteros, rango 2 elevado a 32
        double b = 5.6; // decimales
        char letra = 'a'; //siempre con comillas simples
        byte c = 6; // rango 2 elevado a 8
        short d = 34; //rango 2 elevado 16
        long e = 5678; // rango 2 elevado a 64
   
        boolean verdadero = true;
        String nombre = "marta"; // con comillas dobles,se utiliza para poner varios caracteres.
    */ 
         //OPERADORES ARITMETICOS EJEMPLOS
       /*t a = 2;
        int b = 4;
        int suma = a+b;
        int resto = a % b; //sale el resto */
        //System.out.println(nombre.toUpperCase()); //Atajo -> sout ;cuando ponemos un "." podemos llamar un metodo.
       //ystem.out.println((1+2*3)/2); //->Tambien se puede operar directamente desde aqui

       Scanner sc = new Scanner(System.in);// sirve para poder meter datos desde el teclado en el terminal
        System.out.println("Dime tu nombre: ");
        String nombre = sc.nextLine();//aqui se almacena, si es otro tipo por ejemplo double hay que cmabiar ek metodo, por ejemplo nextDouble
        System.out.println("Hola " + nombre);
        entradaDatos.close();
    
        Scanner entradaDatos = new Scanner(System.in);
        System.out.print("Dime tu nota: ");
        double nota = entradaDatos.nextDouble();

        if (nota >= 5) {
            System.out.println("Aprobado");
        }else{
            System.out.println("Has palmado");
        }

        //BUCLES FOR(cuando se sabe) , WHILE
            for (int i = 1; i <=5; i = i + 1//tambien se puede poner i++, es lo mismo porque incrementa uno) {
                System.out.println(i); // para que salgan en la misma linea quitamos al println la ln.
            }


    }


    
}