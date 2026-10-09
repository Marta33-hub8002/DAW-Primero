public class Funciones {

     public static void generarLinea(char a, int numero) {
        for(int i = 1; i < numero; i++){
            System.out.println(a);
        }
     
    }


    public static void main(String[] args) {
        
        System.out.println("\033[H\033[2J"); // SIRVE PARA LIMPAR EL TERMINAL(CUANDO EJECUTAMOS EL CODIGO NO SALE DONDE ESTA EL ARCHIVO , PROTOCOLO,LAS LETRAS AZULES)
                //PRIMER EJEMPLO
        // asi se llama al metodo de arriba-> saludo(); public static void saludo () y luego lo que quieras imprimir por pantalla, y dentro del main ya lo llamas. 
                // SEGUNDO EJEMPLO
        // otro ejemplo de metodo en public hay que poner en void el tipo de dato aqui es int y dentro la variable   "public static int doble(int a) {
        //return a * 2;"
        //int resultado = doble(7);
        //System.out.println(resultado);
                //TERCER EJEMPLO
        //fuera del main->  public static int suma(int a, int b) {
                            //return a + b;
        //dentro del main->
        //System.out.println(suma(3,4));

                //CUARTO EJEMPLO
        //Fuera del main-> public static void generarLinea(char a, int numero) {
        //System.out.println(a * numero);

        //dentro del main-> cambia el numero por un asterisco, para que genere un linea de asterisco arriba del main se pone asi,esta mal es: 
        // public static void generarLinea(char a, int numero) {
       // for(int i = 1; i < numero; i++){
        //    System.out.println(a);
        //}
        //generarLinea('*', 12);
     
        


    }
}