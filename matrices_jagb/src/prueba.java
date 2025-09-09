import java.util.Arrays;

public class prueba {

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

                try { //Manejar erroes en tiempo de ejecucuon
                    int num1 = Integer.parseInt(matrizA[filas][columnas]);
                    int num2 = Integer.parseInt(matrizB[filas][columnas]);
                    matrizC[filas][columnas] = num1 + num2;
                } catch (Exception ex) {
                    //ex.printStackTrace();
                    System.out.println(ex.getMessage());
                    System.out.println("continua...");
                    matrizC[filas][columnas] = -1;

                }

                }
            System.out.println(Arrays.toString(matrizC[filas]));
            }
        for(int filas =0 ; filas<matrizA.length; filas++) {
             System.out.println(Arrays.toString(matrizC[filas]));
            for (int columnas = 0; columnas < matrizA[filas].length; columnas++) {

            }
        }


        }
    }

