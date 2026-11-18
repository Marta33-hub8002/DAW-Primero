
import java.util.ArrayList;
import java.util.Arrays;


public class app1 {


   


    private static ArrayList<Integer> maximosPorFila(ArrayList<ArrayList<Integer>> matriz) {


        return new ArrayList<>();
    }


    private static ArrayList<Integer> maximosPorColumna(ArrayList<ArrayList<Integer>> matriz) {
        
        return new ArrayList<>();
    }


    private static Integer maximo(ArrayList<Integer> fila) {


        return 0;
    }


    private static void pintarElementos(ArrayList<Integer> elementos) {


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
