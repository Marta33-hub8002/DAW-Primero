package Ejercicio1Entornos;

public class Practica2 {
// Contador de cuántas pruebas se han ejecutado en total.
// Es static para que lo compartan todos los métodos.
    static int pruebasTotales = 0;
//Contador de cuantas pruebas fallidas.
    static int pruebasFallidas = 0;
//Suma todos los números de un array y devuelve el total de los ingresos.
    static int sumarIngresos(int[] ingresos){
//Aqui hay un acumulador que empieza en 0.
        int total = 0;
//Recorre el array posición por posición
        for (int i = 0; i < ingresos.length; i++){
//Suma el valor actual al total
            total += ingresos[i];
        }
        return total;
    }
//Compara el resultado esperado con el obtenido e imprime si la prueba pasa o falla.
    static void comprobar (String nombre, int esperado, int obtenido){
//Cada vez que se llama, se cuenta una prueba más
        pruebasTotales++;
//Si coinciden, la prueba pasa
        if (esperado == obtenido){
            System.out.println("[PASA] " + nombre);
//Si no coinciden, se cuenta como fallida y se muestran los valores
        }else{
            pruebasFallidas++;
            System.out.println("[FALLA] " + nombre + " esperado=" + esperado + " obtenido=" + obtenido);
        }     
    }
//Apartir de aqui ya es el ejecutable.
        public static void main(String[] args) {
//Caso normal: 10+20+30+40 = 100
            comprobar("cuatro ingresos", 100,sumarIngresos(new int[]{10, 20, 30, 40}));
//Caso con un solo elemento(ingreso), la suma es el propio valor
            comprobar("un ingreso", 7,sumarIngresos(new int[]{7}));
//Caso límite: array vacío, la suma debe ser 0
            comprobar("sin ingresos", 0, sumarIngresos(new int[]{}));
//Prueba que falla A PROPÓSITO: 8+9 = 17, pero se espera 20
//(sirve para comprobar que el sistema de pruebas detecta errores)
            comprobar("prueba erronea a proposito", 20, sumarIngresos(new int[]{8, 9}));
            System.out.println("Total: " + pruebasTotales + " Fallidas: " + pruebasFallidas);
        }
    }

