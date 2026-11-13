//Declaración del paquete al que pertenece esta clase.
package Ejercicio1Entornos;

public class Practica5 {
     
//Método que simula el lanzamiento de un dado de 6 caras devolviendo un número aleatorio entre 1 y 6.
     static int lanzarDado(){
        //Genera un decimal aleatorio entre 0.0 y 5.99, lo convierte a entero (0 a 5) y le suma 1.
        return (int) (Math.random() * 6) + 1;
     }
     
//Método que calcula el daño causado según el resultado del dado recibido.
     static int danoZoro(int dado) {
//Comprueba si el valor del dado está fuera del rango válido (menor que 1 o mayor que 6).
        if (dado < 1 || dado > 6) {
//Devuelve -1 para indicar que el valor del dado es erróneo o inválido.
            return -1;
        }
//Si el dado es válido, calcula y devuelve el daño multiplicando el valor por 10.
        return dado * 15;
     }
     
//Método principal donde se ejecutan las pruebas automatizadas con valores predefinidos.
     public static void main(String[] args) {
//Array con valores simulados de dado para probar casos válidos e inválidos.
        int[] dadosFalsos = {2, 5, -3, 9};
//Array con los resultados que se espera que devuelva la función para cada dado falso.
        int[] esperados = {30, 75, -1, -1};
        
//Bucle que recorre todos los casos de prueba del array dadosFalsos.
        for( int i = 0;i < dadosFalsos.length; i++){
//Llama al método danoZoro con el dado de la posición actual y guarda el resultado obtenido.
            int dado = danoZoro(dadosFalsos[i]);
//Compara el resultado obtenido con el esperado: guarda "OK" si coinciden o "FALLO" si difieren.
            String estado = (dado == esperados[i]) ? "OK" : "FALLO";
//Imprime por consola el dado probado, el daño calculado y si la prueba ha pasado o fallado.
            System.out.println("Dado falso=" + dadosFalsos[i] + " dado=" + dado + "-> " + estado);
        }

    }
}

