


import java.util.ArrayList;
import java.util.Arrays;

public class App {

    private static ArrayList<Integer> maximosPorFila(ArrayList<ArrayList<Integer>> matriz) {
        ArrayList<Integer> maximos = new ArrayList<>();
        for (int i = 0; i < matriz.size(); i++) {
            maximos.add(maximo(matriz.get(i)));
        }
        return maximos;
    }

    private static ArrayList<Integer> maximosPorColumna(ArrayList<ArrayList<Integer>> matriz) {
        ArrayList<Integer> maximos = new ArrayList<>();

        // Número de columnas = longitud de la fila más larga
        int numColumnas = 0;
        for (int i = 0; i < matriz.size(); i++) {
            numColumnas = Math.max(numColumnas, matriz.get(i).size());
        }

        for (int columna = 0; columna < numColumnas; columna++) {
            ArrayList<Integer> elementosColumna = new ArrayList<>();
            for (int fila = 0; fila < matriz.size(); fila++) {
                if (columna < matriz.get(fila).size()) {
                    elementosColumna.add(matriz.get(fila).get(columna));
                }
            }
            maximos.add(maximo(elementosColumna));
        }
        return maximos;
    }

    private static Integer maximo(ArrayList<Integer> fila) {
        int max = fila.get(0);
        for (int i = 1; i < fila.size(); i++) {
            max = Math.max(max, fila.get(i));
        }
        return max;
    }

    private static void pintarElementos(ArrayList<Integer> elementos) {
        for (int i = 0; i < elementos.size(); i++) {
            System.out.print(elementos.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> entrada = new ArrayList<ArrayList<Integer>>();
        entrada.add(new ArrayList<>(Arrays.asList(4, 8, 2, 6)));
        entrada.add(new ArrayList<>(Arrays.asList(9, 3, 7, 1, 50, 123, 2)));
        entrada.add(new ArrayList<>(Arrays.asList(5, 12)));

        ArrayList<Integer> maximosFila = maximosPorFila(entrada);
        pintarElementos(maximosFila);

        ArrayList<Integer> maximosColumna = maximosPorColumna(entrada);
        pintarElementos(maximosColumna);
    }
}