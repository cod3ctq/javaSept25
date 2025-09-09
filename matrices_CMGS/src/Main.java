import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Matriz de enteros vacia
         int[][] matriz1 = new int[5][5];

           System.out.println(Arrays.deepToString(matriz1));

            matriz1[0][0] = 5;
            matriz1[4][4] = 8;

            System.out.println(Arrays.deepToString(matriz1));

        //LLenar con ciclos toda la matriz

          for (int filas=0; filas<matriz1.length; filas++){
            System.out.println(Arrays.toString(matriz1[filas]));
            for (int columnas=0; columnas<matriz1[filas].length; columnas++){
            //  System.out.println("Valor actual en la celda: " +filas+ " :" +columnas+ " :" +matriz1[filas][columnas]);
                System.out.println(matriz1[filas][columnas]);
            //    System.out.println(matriz2[filas][columnas]);


            }
         }

    }
}