
import java.util.Arrays;

public class suma_matrices {
    public static void main(String[] args) {


        int[][] resultados = new int[5][5];
        int n1, n2;

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

        String numeros = ("1234567890");
        //Manejar errores en tiempo de ejecucion

        for (int filas = 0; filas < matrizA.length; filas++) {
            for (int columnas = 0; columnas < matrizA[filas].length; columnas++) {

                if (numeros.indexOf(matrizA[filas][columnas])>=0 && numeros.indexOf(matrizB[filas][columnas])>=0)  {
                    n1 = Integer.parseInt(matrizA[filas][columnas]);
                    n2 = Integer.parseInt(matrizB[filas][columnas]);

                    resultados[filas][columnas] = n1 + n2;
                }else{
                    resultados[filas][columnas] = 0;
                }
            }
        }
        for (int i = 0; i < resultados.length; i++) {
            System.out.println(Arrays.toString(resultados[i]));
        }

        //----------------------------------------------

        //VERSIONADO DE CÓDIGO: se trata de la idea de organizar, controlar y archivar cambio en el código del
        //proyecto
        //HERRAMIENTAS: GIT, SUBVERSION
        //REPOSITORIO: GITHUB,GITLAB, BITBUCKET, AMAZON CODE COMMIT


    }
}