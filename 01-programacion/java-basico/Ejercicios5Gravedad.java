public class Ejercicios5Gravedad {
    public static void main(String[] args) {
        int masaCuerpo = 100;
        double tierra = 9.8;
        double marte = 3.71;
        double jupiter = 24.79;
        double pesoTierra = Math.round(masaCuerpo * tierra);
        double pesoMarte =  Math.round(masaCuerpo * marte);
        double pesoJupiter = Math.round(masaCuerpo * jupiter);
        System.out.println(" El peso de la tierra: " + pesoTierra + " El peso de Marte: " + pesoMarte + " El peso de Jupiter: " + pesoJupiter);
    }
}