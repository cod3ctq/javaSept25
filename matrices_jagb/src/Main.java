import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            //Matriz de enteros vacia
        int[][] matriz1 = new int[5][5];

       // System.out.println(Arrays.deepToString(matriz1));

        matriz1[0][0] = 5;
        matriz1[4][4] = 8;

       // System.out.println(Arrays.deepToString(matriz1));

        // Llenar con ciclos toda la matriz
        for(int filas =0 ; filas<matriz1.length; filas++){

            //System.out.println(Arrays.toString(matriz1[filas]));
        for (int columnas = 0; columnas<matriz1[filas].length; columnas++){
                System.out.println("Valor actual en la celda: ["+filas+"] ["+columnas+"] : "+matriz1[filas][columnas]);
            }
        }




    }
}