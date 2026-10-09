public class Ejercicio3Segundos {
    public static void main(String[] args) {
        int numSegundos = 125;
        int unSegundo = 60;
        int minutos = numSegundos/unSegundo;
        int segundos = numSegundos%unSegundo;
        System.out.println("El resultado es de: " + minutos+ " m " + segundos + " s");
    }
}