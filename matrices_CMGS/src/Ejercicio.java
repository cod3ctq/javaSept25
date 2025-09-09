import java.util.Arrays;

public class Ejercicio {
    public static void main(String[] args) {
        String[][] matriz1 = {
                {"7", "B", "2", "H", "9"},
                {"C", "0", "E", "5", "1"},
                {"A", "6", "F", "D", "3"},
                {"8", "G", "4", "I", "2"},
                {"J", "7", "K", "0", "L"},
        };

        String[][] matriz2 = {
                {"5", "M", "N", "3", "O"},
                {"P", "8", "Q", "1", "R"},
                {"2", "S", "6", "T", "9"},
                {"U", "0", "V", "4", "W"},
                {"X", "7", "Y", "Z", "5"},
        };

        String numeros = "0123456789";
        String letras = "abcdefghijklmnñopqrstuvwxyz";
        int[][] resultados = new int[5][5];
        int n1, n2=0;

        for (int filas = 0; filas < matriz1.length; filas++) {
            System.out.println(Arrays.toString(matriz1[filas]));
            for (int columnas = 0; columnas < matriz1[filas].length; columnas++) {
                //  System.out.println("Valor actual en la celda: " +filas+ " :" +columnas+ " :" +matriz1[filas][columnas]);
                System.out.println("A: " + matriz1[filas][columnas]);
                System.out.println("B: " + matriz2[filas][columnas]);

                //Manejar errores en tiempo de ejecucion
                // try catch sirve para trabajar y manejar errores y excepciones

                try { //intenta hacer esto....
                    n1 = Integer.parseInt(matriz1[filas][columnas]);
                    n2 = Integer.parseInt(matriz2[filas][columnas]);

                    resultados[filas][columnas] = n1 + n2;
                }catch (Exception ex){
                    System.out.println(ex.getMessage());
                  //  ex.printStackTrace();
                    System.out.println("Continua...");

                    resultados[filas][columnas] = -1;
                }


                // indexOf sirve para preguntar por los valores de la matriz
              //  if (numeros.indexOf(matriz1[filas][columnas]) > 0 && numeros.indexOf(matriz2[filas][columnas]) > 0) {

//                    n1 = Integer.parseInt(matriz1[filas][columnas]);
//                    n2 = Integer.parseInt(matriz2[filas][columnas]);
//
//                    resultados[filas][columnas] = n1 + n2;
//                } else {
//                    resultados[filas][columnas] = 0;
//                }
            }
        }
        for (int i=0; i<resultados.length; i++){
            System.out.println(Arrays.toString(resultados[i]));
        }
    }
}
//------------------------------------------------------------------------------------
/*
Versionado de codigo: Se trata de la idea de organizar, controlar y archivar cambios en el codigo del proyecto

Herramienta: Git, Subversion

Repositorio: GitHub, GitLap, BitBucket, Amazon  Code Commit

 */