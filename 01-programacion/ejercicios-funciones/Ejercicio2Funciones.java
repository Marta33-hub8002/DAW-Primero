public class Ejercicio2Funciones {
    public static double areaCirculo(int radio) {
        double area = Math.PI * radio * radio;
        return area;

    }
    
    public static void main(String[] args) {
        double resultado = areaCirculo(4);
        System.out.println(resultado);
    }
}