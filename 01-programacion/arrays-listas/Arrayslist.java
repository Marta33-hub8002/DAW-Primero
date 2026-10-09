import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Arrayslist {
    public static void main(String[] args) {
        /*List<Integer> numeros = new ArrayList<>();
        numeros.add( 42);
        numeros.add( 2);
        int a = 89;
        numeros.add(a);
        */

        
       //LISTAS 
        //Sirve para saber el numero de posiciones que tiene System.out.println(numeros.size());
        //Con get sacamos un numero de la lista. System.out.println(numeros.get(1));
       
       
       /*  for( int i = 0; i < numeros.size(); i++){
            System.out.println("Elemento en la posicion " + i + ": " + numeros.get(i));
        }
            Es un bucle que lo que hace es empezar desde la posicion cero, y va incrementando +1 para sacar todas las posiciones
            */
        /*for (Integer valor : numeros){
            System.out.println(valor);
        }
            FORMA MAS SENCILLA DE HACER LO MISMO
        */
       //METODO REMOVE: para eliminar un elemento de la lista
        //Da un error porque no puedes borrarlo, no da el error antes porque en la compilacion no sabe cuantas posiciones tiene, entonces tienes que poner el numero de la posicion
       //System.out.println(numeros);
       //Ponemos integer porque es un objeto de la clase int por eso ahora lo elimina, si no lo ponemos se piensa que te refieres a la posicion 89 entonces como no exixte por eso da error
       // hay que poner integer(castear)
       //numeros.remove((Integer) 89);
       //System.out.println(numeros);
       List<String> nombres = new ArrayList<>();
       nombres.add("pepe");
       nombres.add("sofia");
       nombres.add("ramon");
       
       System.out.println(nombres);
       Integer indice = nombres.indexOf("pepe");//Para crear un indice de pepe,te dice su posicion
       System.out.println(indice);
       nombres.set(indice, "fernando");//Nos permite cambiar un elemento por otro, pepe cambia a ser fernando
       System.out.println(nombres);
        Boolean existeSofia = nombres.contains("sofia")//para mirar si existe sofia te devulve un true o false por eso hay que poner boolean
        System.out.println(existeSofia);
        //Este espera uqe le pongamos el arraylist creado nuestro,directamente nos lo ordena, perdemos el orden inicial
        Collection.sort(nombres);
        System.out.println(nombres);


    }
}