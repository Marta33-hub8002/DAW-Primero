package Ejercicio1Entornos;

public class Practica5 {
     static int lanzarDado(){
        return (int) (Math.random() * 6) + 1;
     }
     static int danoZoro(int dado) {
        if (dado < 1 || dado > 6) {
            return -1;
        }
        return dado * 10;
     }
     public static void main(String[] args) {
        int[] dadosFalsos = {2, 5, -3, 9};
        int[] esperados = {30, 75, -1, -1};
        
        for( int i = 0;i < dadosFalsos.length; i++){
            int dado = danoZoro(dadosFalsos[i]);
            String estado = (dano == esperados[i]) ? "OK" : "FALLO";
            System.out.println("Dado falso=" + dadosFalsos[i] + " dado=" + dado + "-> " + estado);
        }

    }
}
