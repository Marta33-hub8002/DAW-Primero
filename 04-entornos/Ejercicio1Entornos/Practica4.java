package Ejercicio1Entornos;

public class Practica4 {
    
//Método con un error intencionado que cuenta cuántos elementos superan o igualan el mínimo.
    static int contarRicosErroneo(int[] monedas, int minimo){
        //Contador que almacena cuántas cantidades cumplen la condición. Empieza en 0.
        int cuenta = 0;
//Bucle con fallo: al poner length - 1 deja sin revisar el último elemento del array.
        for(int i = 0; i < monedas.length -1; i++){
             //Comprueba si las monedas de la posición actual son mayores o iguales al mínimo.
             if (monedas[i] >= minimo) {
                //Incrementa en 1 el contador si se cumple la condición.
                cuenta++;
             }
        }
//Devuelve el total de elementos contados.
        return cuenta;
    }
    
//Método corregido que cuenta cuántos elementos del array son mayores o iguales al mínimo.
     static int contarRicos(int[] monedas, int minimo) {
//Contador que almacena cuántas cantidades cumplen la condición. Empieza en 0.
        int cuenta = 0;
//Recorre todo el array desde la posición 0 hasta el final.
        for (int i = 0; i < monedas.length; i++) { // condición correcta
//Comprueba si las monedas de la posición actual son mayores o iguales al mínimo.
            if (monedas[i] >= minimo) {
//Incrementa en 1 el contador si se cumple la condición.
                cuenta++;
            }
        }
 //Devuelve el total de elementos contados.
        return cuenta;
    }
    
//Variable global que lleva el registro de cuántos fallos se han detectado en las pruebas.
    static int numIncidencia = 0;
    
//Método auxiliar que compara el resultado esperado con el obtenido y registra un fallo si no coinciden.
    static void verificar(String funcion, int esperado, int obtenido){
        //Comprueba si el valor que debería dar es distinto al que realmente ha devuelto el método.
        if (esperado != obtenido) {
//Aumenta en 1 el número total de incidencias detectadas.
            numIncidencia++;
//Imprime por consola el informe detallado del error encontrado.
            System.out.println("INC-" + numIncidencia + " | Funcion: " + funcion + "| Esperado: " + esperado + "|Obtenido: " + obtenido);
        }
    }
    
//Método principal donde se ejecutan los casos de prueba.
    public static void main(String[] args) {
//Array de prueba con diferentes cantidades de monedas.
         int[] botin = {120, 30, 80, 200, 90};
//Prueba el método erróneo esperando 4 resultados (fallará porque no lee el 90 del final).
         verificar("contarRicosErroneo", 4, contarRicosErroneo(botin, 80));
//Prueba el método correcto esperando 4 resultados (pasará la prueba sin incidencias).
         verificar("contarRicos", 4, contarRicos(botin, 80));
//Prueba el método erróneo con un array vacío esperando 0 (no da error porque no entra al bucle).
         verificar("contarRicosErroneo", 0, contarRicosErroneo(new int[]{},80));
//Muestra por consola el resumen final con el total de incidencias encontradas.
         System.out.println("Incidencias detectadas: " + numIncidencia);
    }
}
