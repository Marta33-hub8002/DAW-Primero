package Ejercicio1Entornos;

public class Practica4 {
    static int contarRicosErroneo(int[] monedas, int minimo){
        int cuenta = 0;
        for(int i = 0; i < monedas.length -1; i++){
             if (monedas[i] >= minimo) {
                cuenta++;
             }
        }
        return cuenta;
    }
     static int contarRicos(int[] monedas, int minimo) {
        int cuenta = 0;
        for (int i = 0; i < monedas.length; i++) { // condición correcta
            if (monedas[i] >= minimo) {
                cuenta++;
            }
        }
        return cuenta;
    }
    static int numIncidencia = 0;
    static void verificar(String funcion, int esperado, int obtenido){
        if (esperado != obtenido) {
            numIncidencia++;
            System.out.println("INC-" + numIncidencia + " | Funcion: " + funcion + "| Esperado: " + esperado + "|Obtenido: " + obtenido);
        }
    }
    public static void main(String[] args) {
         int[] botin = {120, 30, 80, 200, 90};
         verificar("contarRicosErroneo", 4, contarRicosErroneo(botin, 80));
         verificar("contarRicos", 4, contarRicos(botin, 80));
         verificar("contarRicosErroneo", 0, contarRicosErroneo(new int[]{},80));
         System.out.println("Incidencias detectadas: " + numIncidencia);
    }
}
