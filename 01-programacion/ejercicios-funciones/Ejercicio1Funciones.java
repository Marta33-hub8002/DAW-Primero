
public class Ejercicio1Funciones {
    public static void longitud(char a , int numero) {
        for(int i = 1; i <= numero; i++){
            System.out.println(a);
        }
            System.out.println();
    }
        public static void main(String[] args){
             System.out.println("\033[H\033[2J");
            longitud('*', 5); 
    }
}