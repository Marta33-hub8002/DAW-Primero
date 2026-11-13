package Ejercicio1Entornos;

public class Practica1 {
    //Funcion llamada etiquetaPrecio
    //Recibe un número entero y devuelve un String.
    static String etiquetaPrecio(int berries){
    //En este primer if, lo que hace es que si el precio es un numero negativo da error.
        if (berries < 0) {
            return "ERROR";
        }
    //De 0 a 49 -> el precio bajo, barato.
        else if (berries < 50) {
            return "BARATO";
        }
    //De 50 a 199 -> el precio medio,normal.
        else if (berries < 200) {
            return"NORMAL";
        }
    // De 50 a 199 -> el precio alto ya es = a lujo.
        else {
            return "LUJO";
        }
    }
    //A partir de aqui ya esta el programa ejecutable
    public static void main(String[] args) {
    //Estos son los valores que vamos a probar.
        int[] entradas = {-5, 0, 49, 50, 199, 200, 256};
    //Estos son los string que devolverá en funcion de la entrada.
        String[] esperados = {"ERROR", "BARATO", "BARATO","NORMAL","NORMAL","LUJO", "LUJO"};
    //Recorre todos los casos de prueba, uno por uno.  
        for (int i = 0; i < entradas.length; i++){
    //Llama a la función con la entrada actual y guarda el resultado.
            String obtenido = etiquetaPrecio(entradas[i]);
    //Compara lo obtenido con lo esperado:
            String veredicto = obtenido.equals(esperados[i]) ? "OK" : "FALLO";
    //Muestra por pantalla el resultado de este caso.
            System.out.println("Caso " + (i + 1) + ":entrada=" + entradas[i] + " esperado=" + esperados[i] + " obtenido=" + obtenido + " ->" + veredicto);
        }
    }
}
