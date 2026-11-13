package Ejercicio1Entornos;

public class Practica3 {
    public static void main(String[] args) {
//Horas trabajadas cada día (posición 0 = día 0, posición 1 = día 1, etc...)
        int [] horas = {4, 6, 3, 7, 2};
//Acumulador que va sumando las horas de todos los días. Empieza en 0.
        int total = 0;
//Recorre cada día vale 0, 1, 2, 3, 4
        for(int dia = 0; dia < horas.length; dia++){
//Traza lo que hace es mostrar el valor de total antes de sumar las horas de este día.
            System.out.println("[TRAZA] dia=" + dia + " antes total=" + total);
//Suma las horas del día actual al total (total = total + horas[dia])
            total += horas[dia];
//Muestra el valor actualizado de total después de haber sumado las horas del día.
            System.out.println("[TRAZA] dia=" + dia + " despues total=" + total);
//Comprueba si el acumulado de horas ha superado el límite permitido de 12. 
            if(total > 12) {
//Simula un punto de ruptura avisando en qué día y con qué valor se superó el límite.
                System.out.println("[BREAKPOINT] total=" + total + "supera 12 en dia" + dia);
//Restablece el valor de total al límite máximo permitido (12).
                total = 12;
//Simula una inspección de variable (watch) mostrando el nuevo valor corregido de total.
                System.out.println("[WATCH] total corregido a " + total);
            }
        }
//Muestra por consola el resultado final acumulado tras terminar de recorrer todos los días.
        System.out.println("Total final: " + total);
    }
}
