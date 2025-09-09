import java.util.Arrays;

public class E1 {
    public static void main(String[] args) {

            //---Matrices creadas
        String[][] matrizA = {
                {"7", "B", "2", "H", "9"},
                {"C", "0", "E", "5", "1"},
                {"A", "6", "F", "D", "3"},
                {"8", "G", "4", "I", "2"},
                {"J", "7", "K", "0", "L"}
        };
        String[][] matrizB = {
                {"5", "M", "N", "3", "O"},
                {"P", "8", "Q", "1", "R"},
                {"2", "S", "6", "T", "9"},
                {"U", "0", "V", "4", "W"},
                {"X", "7", "Y", "Z", "5"}
        };
        int [][] matrizC = new int[5][5];
        //---

        //----Variables
        int suma = 0;
        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String numeros = "1234567890";
        String acum;

        //----

        for(int filas =0 ; filas<matrizA.length; filas++){
           // System.out.println(Arrays.toString(matrizA[filas]));
            for (int columnas = 0; columnas<matrizA[filas].length; columnas++){

                if(numeros.indexOf(matrizA[filas][columnas])>=0 && numeros.indexOf(matrizB[filas][columnas])>=0) {

                    int num1 = Integer.parseInt(matrizA[filas][columnas]);
                    int num2 = Integer.parseInt(matrizB[filas][columnas]);
                    matrizC[filas][columnas] = num1 + num2;

                } else if (letras.indexOf(matrizA[filas][columnas])>=0 && letras.indexOf(matrizB[filas][columnas])>=0) {

                }

            }
            System.out.println(Arrays.toString(matrizC[filas]));

        }
    }
    }

