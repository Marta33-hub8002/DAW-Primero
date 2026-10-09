public class Ejercicio3Funciones {
     public static void saludo(String nombre , int hora) {
        if (hora < 0 || hora > 23) {
            System.out.println("Error");
        } 
        if (hora < 12) {
            System.out.println("Buenos dias" + nombre);
        } else if (hora < 21) {
            System.out.println("Buenas tardes" + nombre);
        } else {
            System.out.println("Buenas noches" + nombre);
        }  
    }
    public static void main(String[] args) {
        saludo("marta", 9);
        saludo("naiara", 14);
        saludo("sara", 22);
        



    }
   
}